package br.com.alura.domain;

public class Pet {
    private Long id;
    private String nome;
    private String tipo;
    private String raca;
    private String cor;
    private Integer idade;
    private Float peso;

    public Pet(String nome, String tipo, String raca, String cor, Integer idade, Float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public long getId() {
        return id;
    }
}
