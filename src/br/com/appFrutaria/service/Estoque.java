package br.com.appFrutaria.service;

import java.util.ArrayList;
import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.model.Verdura;

public class Estoque {

    private ArrayList<Fruta> frutas = new ArrayList<>();
    private ArrayList<Verdura> verduras = new ArrayList<>();

    public void cadastrarFruta(Fruta f) {
        frutas.add(f);
    }

    public void cadastrarVerdura(Verdura v) {
        verduras.add(v);
    }

    public void listarFrutas() {
        System.out.println("\n--- FRUTAS ---");

        if (frutas.isEmpty()) {
            System.out.println("Nenhuma fruta cadastrada.");
            return;
        }

        for (Fruta f : frutas) {
            System.out.println("ID: " + f.getId()
                + " | Nome: " + f.getNome()
                + " | Preço: " + f.getPreco()
                + " | Quantidade: " + f.getQuantidade()
                + " | Tipo: " + f.getTipo());
        }
    }

    public void listarVerduras() {
        System.out.println("\n--- VERDURAS ---");

        if (verduras.isEmpty()) {
            System.out.println("Nenhuma verdura cadastrada.");
            return;
        }

        for (Verdura v : verduras) {
            System.out.println("ID: " + v.getId()
                + " | Nome: " + v.getNome()
                + " | Preço: " + v.getPreco()
                + " | Quantidade: " + v.getQuantidade()
                + " | Peso: " + v.getPeso() + "kg");
        }
    }

    public Fruta pesquisarFruta(String nome) {
        for (Fruta f : frutas) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

    public Verdura pesquisarVerdura(String nome) {
        for (Verdura v : verduras) {
            if (v.getNome().equalsIgnoreCase(nome)) {
                return v;
            }
        }
        return null;
    }

    public boolean removerFruta(String nome) {
        Fruta f = pesquisarFruta(nome);
        if (f != null) {
            frutas.remove(f);
            return true;
        }
        return false;
    }

    public boolean removerVerdura(String nome) {
        Verdura v = pesquisarVerdura(nome);
        if (v != null) {
            verduras.remove(v);
            return true;
        }
        return false;
    }

    public int totalFrutas() {
        return frutas.size();
    }

    public int totalVerduras() {
        return verduras.size();
    }
}
