package com.fatec.sp.gov.br.RepositorioDoBem.Configuration;

import com.fatec.sp.gov.br.RepositorioDoBem.Builder.Alimento;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
publib class Config{

    Alimento.Builder builder = new Alimento.Builder();

    Alimento alimento = builder
            .nome("Arroz")
            .peso(5.0)
            .quantidade(1)
            .validade("01/09/2027")
            .build();


    @Bean(name = "nomeAlimento")
    public String nomeAlimento(){
        return Alimento.getNome();
    }

    @Bean(name = "pesoAlimento")
    public double pesoAlimento(){
        return Alimento.getPeso();
    }

    @Bean(name = "quantidadeAlimento")
    public int quantidadeAlimento(){
        return Alimento.getQuantidade();
    }

    @Bean(name = "validadeAlimento")
    public String validadeAlimento(){
        return Alimento.getValidade();
    }


}
