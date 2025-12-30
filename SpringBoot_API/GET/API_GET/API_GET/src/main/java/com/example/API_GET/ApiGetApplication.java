package com.example.API_GET;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API_GET.model.product;

@RestController
@RequestMapping("/api/produtos") // Rpta para acessar a API

public class ApiGetApplication {
	@GetMapping
	public static void main(String[] args) {

	}
	public List<product> getAllProdutos(){
		return Arrays.asList(
				new product("Creme de Leite", 9.99, 10),
				new product("Leite Integral", 8.99, 9),
				new product("Ervilha em Lata", 3.99, 15),
				new product("Milho em Lata", 4.99, 14),
				new product("Refrigerante de Laranja 2L", 7.99, 4)
		);
	}
}
