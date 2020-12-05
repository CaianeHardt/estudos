package com.company;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
	    System.out.println("Seja bem vindo ao projeto Cai Pah");
	    boolean showMenu;
        do {
            System.out.println("Escolha uma opção entre 1 e 2");

            int op;
            try {
                Scanner scanner = new Scanner(System.in);
                op = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("erro ao ler opção digitada - " +e.getClass().getSimpleName());
                showMenu = true;
                continue;
            }

            switch (op) {
                case 1:
                    System.out.println("você escolheu a opção 1");
                    showMenu = false;
                    break;
                case 2:
                    System.out.println("você escolheu a opção 2");
                    showMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    showMenu = true;
                    break;
            }
        } while (showMenu);
    }
}
