package Model;

import Utils.Utils;

public class Produto {

    private static int contar = 1; //contador de produto

    private int id;
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;

        Produto.contar += 1; //toda vez que criar um produdo sera contabilizado +1 na variavel contar
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString(){
        return "id: " + this.getId() +
            "\nNome: " + this.getNome() +
            "\nPreço: " + Utils.DoubleToString(this.getPreco()); //Iniciado com o "Utils.DoubleToString" para formatar com "R$ 0.00"
    }
}
