package com.videolocadora.videolocadora.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
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
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "email", length = 70, nullable = false)
    private String email;

    @Column(name = "telefone", length = 11, nullable = false)
    private  String telefone;

    @OneToMany(mappedBy = "cliente")
    List<Filme> filmes;

}
