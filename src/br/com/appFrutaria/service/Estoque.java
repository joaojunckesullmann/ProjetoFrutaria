package br.com.appFrutaria.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.view.Atendente;

public class Estoque {
    private List<Fruta> listaFruta;

    public Estoque() {
        listaFruta = new ArrayList<>();
    }
    public void gerenciarEstoque(int opcao, Atendente atendente) {
        switch (opcao) {
            case 1 -> {
                String nome = atendente.frutaNome();
                double preco = atendente.frutaPreco();
                int quantidade = atendente.frutaQuantidade();
                String tipo = atendente.frutaTipo();

                Fruta fruta = new Fruta(nome, preco, quantidade, tipo);
                listaFruta.add(fruta);
                System.out.println("Fruta cadastrada com sucesso!");
            }

            case 2 -> {
                if (listaFruta.isEmpty()) {
                    System.out.println("Nenhuma fruta cadastrada.");
                } else {
                    for (Fruta fruta : listaFruta) {
                        atendente. vizualizar(fruta);
                    }
                }
            }

            case 3 -> {
                String nome = atendente.removerFruta();
                boolean removido = false;

                for (int i = 0; i < listaFruta.size(); i++) {
                    if (listaFruta.get(i).getNome().equalsIgnoreCase(nome)) {
                        listaFruta.remove(i);
                        removido = true;
                        break;
                    }
                }

                if (removido) {
                    atendente.vizualizarFrutaRemovida(nome);
                } else {
                    atendente.mensagemNaoEncontrado();
                }
            }

            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida!");
        }
    }
}