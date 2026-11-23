public class Exe1 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int valor = 2;

                for (int linha=0;linha<4;linha++) {
                    
                	for (int coluna=0; coluna < 4; coluna++) {
                        matriz[linha][coluna] = valor;
                        valor *= 2;
                    }
                }
                for (int linha=0;linha<4;linha++) {
 
                	for (int coluna=0;coluna<4;coluna++) {
                        System.out.print("["+matriz[linha][coluna]+"]" + "\t");
                    }
                    System.out.println();
                }
            }
    }
