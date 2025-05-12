package com.videolocadora.videolocadora.service;


import com.videolocadora.videolocadora.dto.ClienteDto;
import com.videolocadora.videolocadora.exceptions.ClienteExeception;
import com.videolocadora.videolocadora.model.Cliente;
import com.videolocadora.videolocadora.repository.ClienteRepository;
import org.hibernate.sql.model.internal.OptionalTableUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }





}

