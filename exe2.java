import java.util.Random;
public class exe2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int linhaMaior = 0, colunaMaior = 0;
        int linhaMenor = 0, colunaMenor = 0;
        Random aleatorio = new Random();
        
        for (int linha=0;linha< 3; linha++) {
            for (int coluna=0;coluna<3;coluna++) {
                matriz[linha][coluna] = aleatorio.nextInt(100);
            }
        }
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int linha=0;linha<3;linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                    linhaMenor = linha;
                    colunaMenor = coluna;
                }
            }
        }
        System.out.println("matriz:");

        for (int linha=0;linha<3;linha++) {
            for (int coluna=0;coluna< 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n maior valor: " + maior);
        System.out.println("linha: " + linhaMaior);
        System.out.println("coluna: " + colunaMaior);
        System.out.println("\n menor valor: " + menor);
        System.out.println("linha: " + linhaMenor);
        System.out.println("coluna: " + colunaMenor);
    }
}
