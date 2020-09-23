package br.com.tecnisys.java8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Endpoint {

    @GetMapping
    public String versao(){
    	String strVersao = "Sua versão do Java é: ".concat(System.getProperty("java.runtime.version"));
        return strVersao;
    }
}
