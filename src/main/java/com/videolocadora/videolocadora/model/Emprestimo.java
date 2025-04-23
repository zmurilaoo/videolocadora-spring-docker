package com.videolocadora.videolocadora.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

@Entity
@Data
@Table(name = "emprestimo")
@NoArgsConstructor

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

}
