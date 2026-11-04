import java.util.Scanner;
public class exer1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    	final int TAM=10;
    	int a[],b[],i;
    	a = new int[TAM];
    	b = new int[TAM];
    	
    	
    	for(i=0;i<TAM;i++) {
    		System.out.println("Digite o valor de A "+(i+1)+"o numero");
    		a[i] = ler.nextInt();
    	}
    	
    	for(i=0;i<TAM;i++) {
    		b[i] = a[i]*a[i];
    	}
    	System.out.print("\nB[] = [");
    	for(i=0;i<TAM;i++) {
    		System.out.print(b[i]+" ");
    	}
    	System.out.print("]");


        ler.close();
        
    }
}
