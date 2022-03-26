package com.example.demo.controler;

import java.util.concurrent.atomic.AtomicLong;

import com.example.demo.domain.pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CadastroControle {
    
    @GetMapping("/listar")
	public String hello(@RequestParam(value = "nome", defaultValue = "DEUS") String name) {
		return String.format("Olá, Math Shelby %s!", name);
    }

    private final AtomicLong idGenarator = new AtomicLong();

    @GetMapping("/listarpessoa")
	public pessoa listarpessoa(@RequestParam(value = "nome", defaultValue = "DEUS") String name) {
		return new pessoa( idGenarator.incrementAndGet(), name);
} 
}
