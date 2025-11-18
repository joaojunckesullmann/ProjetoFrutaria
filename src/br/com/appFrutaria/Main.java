package br.com.appFrutaria;

import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.service.Estoque;
import br.com.appFrutaria.view.Atendente;

public class Main {
    public static void main(String[] args) {
        
        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque();
        int opcaoMenuEscolhida;

        do {
            opcaoMenuEscolhida = atendente.menuPrincipal();
            estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);
        } while (opcaoMenuEscolhida != 0);

        atendente.finalizarApp();
    }
}