package com.videolocadora.videolocadora.dto;


import com.videolocadora.videolocadora.model.Cliente;
import jakarta.validation.Valid;

public record ClienteDto(String nome,
                         String  email ) {



    public Cliente salvar(){
        Cliente cliente =  new Cliente();

        cliente.setNome(this.nome);
        cliente.setEmail(this.email);

        return cliente;
    }





}
