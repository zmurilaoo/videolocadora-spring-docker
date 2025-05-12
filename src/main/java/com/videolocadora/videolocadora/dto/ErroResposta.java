package com.videolocadora.videolocadora.dto;

import org.springframework.http.HttpStatus;

import java.util.List;

public record ErroResposta(int status, String mensagem, List<ErroCampo>erros) {




    //erro 400, quando os dados são enviados errado
    public static ErroResposta erroResposta(String mensagem) {
        return new ErroResposta(HttpStatus.BAD_REQUEST.value(), mensagem, List.of());
    }


    public static ErroResposta resposta(String mensagem){
        return new ErroResposta(HttpStatus.CONTINUE.value(), mensagem, List.of());
    }




}
