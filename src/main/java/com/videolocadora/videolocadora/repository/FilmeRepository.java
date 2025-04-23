package com.videolocadora.videolocadora.repository;

import com.videolocadora.videolocadora.model.Categoria;
import com.videolocadora.videolocadora.model.Cliente;
import com.videolocadora.videolocadora.model.Emprestimo;
import com.videolocadora.videolocadora.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, UUID> {
    List<Filme> findAllByCategoria(Categoria  categoria);

    List<Filme> findAllByDescricaoAndPreco(String descricao, BigDecimal preco);

    List<Filme> findAllByCliente(Cliente cliente);

    List<Emprestimo> findAllByTodosEmprestimos(Cliente cliente);



}
