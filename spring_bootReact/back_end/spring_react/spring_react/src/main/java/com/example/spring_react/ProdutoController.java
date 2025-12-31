package com.example.spring_react;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import com.example.spring_react.model.Produtos;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @GetMapping
    public List<Produtos> getAllProdutos(){
        return Arrays.asList(
            new Produtos("Creme de Leite", 10.0, 5),
            new Produtos("Macarrão", 20.0, 3),
            new Produtos("Arroz", 17.50, 8)
        );
    }
}