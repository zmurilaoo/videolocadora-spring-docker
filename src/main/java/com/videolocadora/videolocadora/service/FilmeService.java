package com.videolocadora.videolocadora.service;


import com.videolocadora.videolocadora.exceptions.FilmeExeception;
import com.videolocadora.videolocadora.model.Categoria;
import com.videolocadora.videolocadora.model.Filme;
import com.videolocadora.videolocadora.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    public List<Filme> buscarPorCategoria(Categoria cat) {

        return  filmeRepository.findAllByCategoria(cat);
    }


    public List<Filme> buscarPorDescriacaoAndPreco(String descricao, BigDecimal preco){

        List<Filme> filmes = filmeRepository.findAllByDescricaoAndPreco(descricao, preco);

        if (filmes.isEmpty()) {
            throw new FilmeExeception("A descrição e o preço, não pode ser está vazio! ");
        }

        return filmes ;

    }


}
