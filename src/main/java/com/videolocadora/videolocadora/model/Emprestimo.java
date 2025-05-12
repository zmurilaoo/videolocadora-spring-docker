package com.videolocadora.videolocadora.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

@Entity
@Data
@Table(name = "emprestimo")
@NoArgsConstructor

@EntityListeners((AutoCloseable.class))

// Analisa as classes, e joga para atributos de Auditoria.

public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  UUID id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_filme ")
    private Filme filme;

    @Column(name = "data_emprestismo")
    private LocalDate dataEmprestimo;

    @Column(name = "data_devolucao")
    private LocalDate dataDevolucao;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 30)
    private Status status;


    @CreatedBy
    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    @LastModifiedDate
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @Column(name = "id_usuario")
    private UUID idUsuario;

}
