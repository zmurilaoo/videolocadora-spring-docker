package com.videolocadora.videolocadora.api;


import com.videolocadora.videolocadora.dto.ClienteDto;
import com.videolocadora.videolocadora.dto.RespostaDto;
import com.videolocadora.videolocadora.model.Cliente;
import com.videolocadora.videolocadora.service.ClienteService;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final  ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }


    public ResponseEntity criar(ClienteDto chamar) {
        Cliente cliente = chamar.salvar();
        service.salvar(cliente);

        //Herder Location

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(cliente.getId()).toUri();

        return ResponseEntity.created(location).build();
    }











}
