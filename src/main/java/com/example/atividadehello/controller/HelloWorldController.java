package com.example.atividadehello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloWorldController {
	
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
    
    @GetMapping("/bsm")
    public List<String> bsmList() {
        return Arrays.asList(
            "Proatividade",
            "Orientação ao Futuro",
            "Responsabilidade Pessoal",
            "Comunicação",
            "Mentalidade de Crescimento",
            "Trabalho em Equipe",
            "Persistência",
            "Orientação ao Detalhe"
        );
    }

    @GetMapping("/objetivos")
    public List<String> objetivosDeAprendizagem() {
        return Arrays.asList(
            "Estudar Spring Boot",
            "Praticar Java",
            "Aprimorar o uso de APIs REST",
            "Melhorar a lógica de programação",
            "Dominar os conceitos de controle de versão com Git e GitHub",
            "Aprender sobre testes"
        );
    }

}
