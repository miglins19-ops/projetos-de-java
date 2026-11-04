import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    	final int TAM=10;
    	int a[],i,soma = 0;
    	double media = 0;
    	a = new int[TAM];
    	
    	for(i=0;i<TAM;i++) {
    		System.out.println("Digite o valor de A "+(i+1)+"o numero");
    		a[i] = ler.nextInt();
    	    soma = soma + a[i];

    	}
    	
        media = soma/TAM;
        System.out.println("a media é: "+media);
        
        ler.close();
    }
}

