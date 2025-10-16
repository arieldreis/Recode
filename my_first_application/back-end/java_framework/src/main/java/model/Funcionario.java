package model;

public class Funcionario {
  private String nome;
  private String departamento;
  private Long salario;
  public Funcionario (String nome, String departamento, Long salario){
    super();
    this.nome = nome;
    this.departamento = departamento;
    this.salario = salario;
    // Como criar uma API utilizando a linguagem java com o framework Spring Boot.
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getDepartamento(){
    return departamento;
  }
  public void setDepartamento(String departamento){
    this.departamento = departamento;
  }
  public Long getSalario(){
    return salario;
  }
  public void setSalario(Long salario){
    this.salario = salario;
  }
}
