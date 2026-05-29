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
            System.out.println("Nenhuma fruta cadastrada!");
            return;
        }

        for (Fruta fruta : frutas) {
            System.out.println("ID: " + fruta.getId()
                + " | Nome: " + fruta.getNome()
                + " | Preço: " + fruta.getPreco()
                + " | Quantidade: " + fruta.getQuantidade()
                + " | Tipo: " + fruta.getTipo());
        }
    }

    public void listarVerduras() {
        System.out.println("\n--- VERDURAS ---");

        if (verduras.isEmpty()) {
            System.out.println("Nenhuma verdura cadastrada.");
            return;
        }

        for (Verdura verdura : verduras) {
            System.out.println("ID: " + verdura.getId()
                + " | Nome: " + verdura.getNome()
                + " | Preço: " + verdura.getPreco()
                + " | Quantidade: " + verdura.getQuantidade()
                + " | Peso: " + verdura.getPeso() + "kg");
        }
    }

    public Fruta pesquisarFruta(String nome) {
        for (Fruta fruta : frutas) {
            if (fruta.getNome().equalsIgnoreCase(nome)) {
                return fruta;
            }
        }
        return null;
    }

    public Verdura pesquisarVerdura(String nome) {
        for (Verdura verdura : verduras) {
            if (verdura.getNome().equalsIgnoreCase(nome)) {
                return verdura;
            }
        }
        return null;
    }

    public boolean removerFruta(String nome) {
        Fruta fruta = pesquisarFruta(nome);
        if (fruta != null) {
            frutas.remove(fruta);
            return true;
        }
        return false;
    }

    public boolean removerVerdura(String nome) {
        Verdura verdura = pesquisarVerdura(nome);
        if (verdura != null) {
            verduras.remove(verdura);
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
