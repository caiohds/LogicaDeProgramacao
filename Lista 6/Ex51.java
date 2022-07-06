import java.util.Scanner;
class Ex51{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);

System.out.println("Digite a quantidade de numeros primos voce deseja ver: ");
int quant = leia.nextInt();
int ultimo = 0;
int penultimo = 1;
int proximo = 0;
for(int i = 1;i<=quant;i++){
	
	System.out.print(proximo + " ");
	proximo = penultimo + ultimo;
	penultimo = ultimo;
	ultimo= proximo;
	}
}
}
