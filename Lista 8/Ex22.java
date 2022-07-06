import java.util.Scanner;
import java.util.ArrayList;
public class Ex22{
public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int tamanho = 0;
		
	do{
	System.out.print("Digite o tamanho do vetor: ");
	tamanho = leia.nextInt();
		
	while(tamanho < 1 || tamanho > 20){
	System.out.println("Tamanho invalido! Digite um valor entre 1 e 20.");
			
		}
			
	}while(tamanho < 1 || tamanho > 20);	
	int ac[] = new int[tamanho];
	int maior = 0, menor = 0;
		
	System.out.print("Digite o valor do maior elemento do vetor: ");
	maior = leia.nextInt();
	System.out.print("Digite o valor do menor elemento do vetor: ");
	menor = leia.nextInt();
		
	for(int i = 0; i < ac.length; i++){
			
	do{
	System.out.print("Digite um numero: ");
	ac[i] = leia.nextInt();
			
	if(ac[i] < menor || ac[i] > maior){
	System.out.printf("Numero invalido! Digite um valor entre %d e %d.\n", menor, maior);
		
		}
		
	}while(ac[i] < menor || ac[i] > maior);
		
		}
		
	
		
	for(int i = 0; i < ac.length; i++){
	System.out.print(ac[i] + " ");
		
		}
	}
}
