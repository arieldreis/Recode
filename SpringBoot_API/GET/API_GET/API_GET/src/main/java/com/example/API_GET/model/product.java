package com.example.API_GET.model;

public class product {
    private String nome;
    private Double preco;
    private Integer quantidade;
    public product(String nome, Double preco, Integer quantidade){
        super();
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setQuantidade(Integer Quantidade){
        this.quantidade = Quantidade;
    }
}
