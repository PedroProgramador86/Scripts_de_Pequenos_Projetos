package Complexos;

import java.util.Scanner;

public class Fichas_de_Poker{

    public static void main (String[]args) {
        Scanner teclado = new Scanner(System.in);

        boolean loop = true;
        int valorApostado;

        // Variaveis de Fichas:

        //j1
        int j1_100;
        int j1_50;
        int j1_25;
        int j1_10;
        int j1_5;

        //j2
        int j2_100;
        int j2_50;
        int j2_25;
        int j2_10;
        int j2_5;

        //j3
        int j3_100;
        int j3_50;
        int j3_25;
        int j3_10;
        int j3_5;

        //j4
        int j4_100;
        int j4_50;
        int j4_25;
        int j4_10;
        int j4_5;

        while (loop) {

        System.out.println("---------- M E N U ----------");
        System.out.println("[1] - 2 Jogadores");
        System.out.println("[2] - 3 Jogadores");
        System.out.println("[3] - 4 Jogadores");
        System.out.println("[0] - Sair");
        
        System.out.printf("User: ");
        int op_user = teclado.nextInt();

        switch (op_user) {

            case 1:

                System.out.printf("Valor apostado: R$");
                valorApostado = teclado.nextInt();

                System.out.println("Digite a quantidade de fichas de ambos os jogadores\n");

                System.out.println("---------- Jogador 1 ----------");
                System.out.printf("Fichas de 100: ");
                j1_100 = teclado.nextInt();
                System.out.printf("Fichas de 50: ");
                j1_50 = teclado.nextInt();
                System.out.printf("Fichas de 25: ");
                j1_25 = teclado.nextInt();
                System.out.printf("Fichas de 10: ");
                j1_10 = teclado.nextInt();
                System.out.printf("fichas de 5: ");
                j1_5 = teclado.nextInt();

                System.out.println("---------- Jogador 2 ----------");
                System.out.printf("Fichas de 100: ");
                j2_100 = teclado.nextInt();
                System.out.printf("Fichas de 50: ");
                j2_50 = teclado.nextInt();
                System.out.printf("Fichas de 25: ");
                j2_25 = teclado.nextInt();
                System.out.printf("Fichas de 10: ");
                j2_10 = teclado.nextInt();
                System.out.printf("fichas de 5: ");
                j2_5 = teclado.nextInt();
                
                DoisJogadores opcao1 = new DoisJogadores(j1_100, j1_50, j1_25, j1_10, j1_5, j2_100, j2_50, j2_25, j2_10, j2_5, valorApostado);

                opcao1.exibirInfo();

            break;

            case 2:
                
            break;

            case 3:
                
            break;

            case 0:
            
                loop = false;

            break;
        
            default:

                System.out.println("\nOpção Invalida ! \nDigite Novamente\n");

            break;

            } // end switch case

        } // end loop while

        teclado.close();

    } // end function main

} // end class