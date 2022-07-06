import java.util.ArrayList;
import java.util.Scanner;
class Ex3{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int a[];
int n ;

	System.out.println("Digite o valor de numeros que voce deseja inserir(ate 20)");
	n = leia.nextInt();

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
