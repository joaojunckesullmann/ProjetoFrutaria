package br.com.appFrutaria;

import br.com.appFrutaria.model.Fruta;
import br.com.appFrutaria.model.Verdura;
import br.com.appFrutaria.service.Estoque;
import br.com.appFrutaria.view.Atendente;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        Atendente atendente = new Atendente();

        int opcao;

        do {
            atendente.exibirMenu();
            opcao = atendente.lerOpcao();

            switch (opcao) {

                case 1:
                    String nomeF = atendente.lerTexto("Nome da fruta: ");
                    double precoF = atendente.lerDouble("Preço: ");
                    int qtdF = atendente.lerInt("Quantidade: ");
                    String tipoF = atendente.lerTexto("Tipo da fruta: ");

                    estoque.cadastrarFruta(new Fruta(nomeF, precoF, qtdF, tipoF));
                    System.out.println("Fruta cadastrada!");
                    break;

                case 2:
                    String nomeV = atendente.lerTexto("Nome da verdura: ");
                    double precoV = atendente.lerDouble("Preço: ");
                    int qtdV = atendente.lerInt("Quantidade: ");
                    double pesoV = atendente.lerDouble("Peso (kg): ");

                    estoque.cadastrarVerdura(new Verdura(nomeV, precoV, qtdV, pesoV));
                    System.out.println("Verdura cadastrada!");
                    break;

                case 3:
                    estoque.listarFrutas();
                    break;

                case 4:
                    estoque.listarVerduras();
                    break;

                case 5:
                    String pesqF = atendente.lerTexto("Nome da fruta: ");
                    Fruta f = estoque.pesquisarFruta(pesqF);
                    if (f != null)
                        System.out.println("Encontrada: " + f.getNome());
                    else
                        System.out.println("Fruta não encontrada.");
                    break;

                case 6:
                    String pesqV = atendente.lerTexto("Nome da verdura: ");
                    Verdura v = estoque.pesquisarVerdura(pesqV);
                    if (v != null)
                        System.out.println("Encontrada: " + v.getNome());
                    else
                        System.out.println("Verdura não encontrada.");
                    break;

                case 7:
                    String remF = atendente.lerTexto("Nome da fruta: ");
                    System.out.println(estoque.removerFruta(remF)
                            ? "Fruta removida!" : "Fruta não encontrada.");
                    break;

                case 8:
                    String remV = atendente.lerTexto("Nome da verdura: ");
                    System.out.println(estoque.removerVerdura(remV)
                            ? "Verdura removida!" : "Verdura não encontrada.");
                    break;

                case 9:
                    System.out.println("Total de frutas: " + estoque.totalFrutas());
                    break;

                case 10:
                    System.out.println("Total de verduras: " + estoque.totalVerduras());
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
