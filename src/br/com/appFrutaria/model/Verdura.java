package br.com.appFrutaria.model;

public class Verdura extends Produto {

    private double peso; 

    public Verdura(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}