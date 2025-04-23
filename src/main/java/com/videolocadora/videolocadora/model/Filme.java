package com.videolocadora.videolocadora.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "filme")
@NoArgsConstructor

public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome_filme", length = 50, nullable = false)
    private String nomeFilme;

    @Column(name = "descricao_filme", length = 80, nullable = false)
    private String descricaoFilme;

    @Column(name = "preco", precision =  18, scale = 2)
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", length = 30, nullable = false)
    private Categoria categoria;

    @Column(name = "data_do_filme")
    private LocalDate dataFilme;

}
