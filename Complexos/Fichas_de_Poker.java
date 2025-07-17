package Complexos;

import java.util.Scanner;

public class Fichas_de_Poker{

    public static void main (String[]args) {
        Scanner teclado = new Scanner(System.in);

        boolean loop = true;

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