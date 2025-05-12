package com.videolocadora.videolocadora.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

@Entity
@Data
@Table(name = "cliente")
@NoArgsConstructor


public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    @Column(name = "nome", length = 30, nullable = false)
    @Size(max = 30, message = "Nome dever conter, no máximo 30 caracteres")
    private String nome;


    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "email", length = 70, nullable = false)
    private String email;

//    @Column(name = "data_nascimento", nullable = false)
//    private LocalDate dataNascimento;


    @Column(name = "telefone", length = 11, nullable = false)
    private  String telefone;

    @OneToMany(mappedBy = "cliente")
    List<Filme> filmes;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @Column(name = "id_usuario")
    private UUID idUsuario;

}
