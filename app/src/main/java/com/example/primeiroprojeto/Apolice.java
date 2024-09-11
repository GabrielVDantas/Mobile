package com.example.primeiroprojeto;

public class Apolice {

    private Integer numero;

    private String nome;

    private Integer idade;

    private String sexo;

    private Double valorAutomovel;

    public Apolice(Integer numero, String nome, Integer idade, String sexo, Double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public Apolice() {}

    public Double calculaValor(String sexo, Integer idade, Double valorAutomovel) {
        if (sexo.equalsIgnoreCase("masculino") && idade >= 25) {
            return valorAutomovel * 0.1;
        } else if (sexo.equalsIgnoreCase("masculino") && idade >= 25) {
            return valorAutomovel * 0.05;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            return valorAutomovel * 0.02;
        }
        return null;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(Double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
}
