package br.com.appFrutaria.view;

import java.util.Scanner;

public class Atendente {

    private Scanner input = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("\n+======== MENU PRINCIPAL ===========+");
        System.out.println("| 1 - Cadastrar fruta---------------|");
        System.out.println("| 2 - Cadastrar Verdura-------------|");
        System.out.println("| 3 - Listar Fruta------------------|");
        System.out.println("| 4 - Listar Verdura----------------|");
        System.out.println("| 5 - Pesquisar fruta---------------|");
        System.out.println("| 6 - Pesquisar Verdura-------------|");
        System.out.println("| 7 - Remover fruta-----------------|");
        System.out.println("| 8 - Remover Verdura---------------|"); 
        System.out.println("| 9 - Verificar total de Fruta------|"); 
        System.out.println("| 10 - Verificar total de Verdura---|");
        System.out.println("| 0 - Sair -------------------------|");
        System.out.println("+===================================+");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        return input.nextInt();
    }

    public String lerTexto(String msg) {
        System.out.print(msg);
        input.nextLine(); 
        return input.nextLine();
    }

    public int lerInt(String msg) {
        System.out.print(msg);
        return input.nextInt();
    }

    public double lerDouble(String msg) {
        System.out.print(msg);
        return input.nextDouble();
    }
}
