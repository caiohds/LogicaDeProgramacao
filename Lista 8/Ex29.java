import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Ex29{
public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);

int quantidade;
do{
System.out.println("Digite a quantidade de termos do vetor");
quantidade = leia.nextInt();
}while(quantidade<10);
int AJ[] = new int[quantidade];	

for(int i = 0; i<quantidade;i++){
	AJ[i] = (int)(Math.random() * 100);
	}
	for(int i = 0;i<10;i++){
		System.out.println("Digite um numero: ");
		int numero = leia.nextInt();
	for(int i2 = 0;i2<quantidade;i2++){
		if(AJ[i2] == numero){
			System.out.println("Parabens, voce adivinhou um numero");
			System.out.println("Posicao no vetor onde o numero digitado se encontra: " + (i2+1));
			i = 9;
			break;
			
			}
		}
		}
		System.out.print("Vetor: ");
		for(int i = 0;i<quantidade;i++){
			System.out.print(AJ[i]+ " ");
			}
}
}
