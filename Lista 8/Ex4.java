import java.util.ArrayList;
import java.util.Scanner;
class Ex4{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int a[];
int n ;
do{
	System.out.println("Digite o valor de numeros que voce deseja inserir(ate 20)");
	n = leia.nextInt();
}while(n>20 && n>0);
	a = new int[n];
for(int i = 0;i<n;i++){
	System.out.println("Digite o valor dessa posicao");
	a[i] = leia.nextInt();
	}
for(int i = 0;i<n;i++){
	System.out.println("Posicao "+ (i+1) +": " + a[i] );
	
	}
	
	
	

}
}
