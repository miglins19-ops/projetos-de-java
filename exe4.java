
import java.util.Scanner;
import java.util.Random;

public class exe4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        int[][] cartela = new int[4][4];
        boolean[][] acertos = new boolean[4][4];

        int numero;
        int rodadas = 0;
        int totalAcertos = 0;
        boolean repetido;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                do {
                    numero = aleatorio.nextInt(75) + 1;
                    repetido = false;

                    for (int x = 0; x < 4; x++) {
                        for (int y = 0; y < 4; y++) {
                            if (cartela[x][y] == numero) {
                                repetido = true;
                            }
                        }
                    }
                } while (repetido);
                cartela[i][j] = numero;
            }
        }
        System.out.println("SUA CARTELA DE BINGO:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%02d  ", cartela[i][j]);
            }
            System.out.println();
        }

        while (totalAcertos < 16) {
            System.out.print("\nDigite o numero cantado: ");
            numero = ler.nextInt();
            rodadas++;
            boolean encontrou = false;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (cartela[i][j] == numero && acertos[i][j] == false) {
                        acertos[i][j] = true;
                        totalAcertos++;
                        encontrou = true;
                    }
                }
            }

            if (encontrou) {
                System.out.println("Numero encontrado na cartela!");
            } else {
                System.out.println("Numero nao encontrado!");
            }

            System.out.println("Acertos: " + totalAcertos + "/16");
        }

        System.out.println("\nBINGO!");
        System.out.println("Voce ganhou em " + rodadas + " rodadas!");

        ler.close();
    }
}
