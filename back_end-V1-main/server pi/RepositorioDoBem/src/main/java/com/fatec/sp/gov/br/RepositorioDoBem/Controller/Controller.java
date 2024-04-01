package com.fatec.sp.gov.br.RepositorioDoBem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpingBootApplication
@RestController

Public class Controller{

    @Autowired
    @Qualifier("nomeAlimento")
    private String nomeAlimento;

    @Autowired
    @Qualifier("pesoAlimento")
    private double pesoAlimento;

    @Autowired
    @Qualifier("quantidadeAlimento")
    private int quantidadeAlimento;

    @Autowired
    @Qualifier("validadeAlimento")
    private String validadeAlimento;

    @GetMapping("/VerAlimento")
    public String VerAlimento(){
        return "Nome: " + nomeAlimento + '\n' +
                "Peso: " + pesoAlimento + '\n' +
                "Quantidade: " + quantidadeAlimento + '\n' +
                "Validade: " + validadeAlimento;
    }

}