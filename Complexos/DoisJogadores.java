package Complexos;

public class DoisJogadores {

    // J1
    boolean jogador1 = false;
    int somaj1;
    int j1_100;
    int j1_50;
    int j1_25;
    int j1_10;
    int j1_5;
    // J2
    boolean jogador2 = false;
    int somaj2;
    int j2_100;
    int j2_50;
    int j2_25;
    int j2_10;
    int j2_5;

    int valorGanho;
    int valorApostado;

    public DoisJogadores(/* Jogador 1*/ int j1_100, int j1_50, int j1_25, int j1_10, int j1_5,
    /* Jogador 2*/ int j2_100, int j2_50, int j2_25, int j2_10, int j2_5 /* Valor Apostado */){

        this.j1_100 = j1_100;
        this.j1_50 = j1_50;
        this.j1_25 = j1_25;
        this.j1_10 = j1_10;
        this.j1_5 = j1_5;

        j1_100 *= 100;
        j1_50 *= 50;
        j1_25 *= 25;
        j1_10 *= 10;
        j1_5 *= 5;

        this.j2_100 = j2_100;
        this.j2_50 = j2_50;
        this.j2_25 = j2_25;
        this.j2_10 = j2_10;
        this.j2_5 = j2_5;

        j2_100 *= 100;
        j2_50 *= 50;
        j2_25 *= 25;
        j2_10 *= 10;
        j2_5 *= 5;

        somaj1 = j1_100 + j1_50 + j1_25 + j1_10 + j1_5;
        somaj2 = j2_100 + j2_50 + j2_25 + j2_10 + j2_5;

        if(somaj1 + somaj2 != 7600){

        System.out.println("Erro na comtabilização de fichas !");
        System.out.println("(Soma total diferente de 7600)");

        } // end if

        else if (somaj1 + somaj2 == 7600) {

            if (somaj1 > somaj2) {

                jogador1 = true; // Indica que o jogador 1 tem mais valor que o jogador 2
                
            }

            else if (somaj1 < somaj2) {

                jogador2 = true; // Indica que o jogador 2 tem mais valor que o jogador 1
                
            }

        } // end else if

    } // end builder

            public void exibirInfo(){

            if (jogador1 = true) {

                valorGanho = (somaj1 * valorApostado) / 3800;
                System.out.println("O Jogador 1 teve um ganho de R$"+ valorGanho);
                System.out.println("Totalizando R$"+ valorApostado + valorGanho);

            }

            else if (jogador2 = true) {

                valorGanho = (somaj2 * valorApostado) / 3800;
                System.out.println("O Jogador 2 teve um ganho de R$"+ valorGanho);
                System.out.println("Totalizando R$"+ valorApostado + valorGanho);

            }

        }
    
} // end class
