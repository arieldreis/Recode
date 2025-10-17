package com.example.java_framework;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Funcionario;
@CrossOrigin(origins = "http://localhost:4200") // à classe de controle da API
@RestController // diz pro Spring que essa classe vai responder requisições HTTP.
@RequestMapping("/api/funcionario")
public class FuncionarioController {
  @GetMapping // cria uma rota GET no caminho /hello.
  public List<Funcionario> getAllEmployees(){
    // Aqui você pode retornar uma lista de funcionário de um banco de dados ou de outra onte de dados.
    return Arrays.asList(
      new Funcionario("Caique Pereira", "TI", 15000L),
      new Funcionario("Carlos Alberto Silva", "RH", 10000L)
    );
  }
}
