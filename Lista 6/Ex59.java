import java.util.Scanner;
class Ex59{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
System.out.println("Digite a quantidade : ");
int quant = leia.nextInt();
System.out.println("Digite o primeiro numero: ");
int ultimo = leia.nextInt();
System.out.println("Digite o segundo numero: ");
int penultimo = leia.nextInt();
int proximo = 0;
for(int i = 1;i<=quant;i++){
	proximo = penultimo + ultimo;
	System.out.print(proximo + " ");
	
	penultimo = ultimo;
	ultimo= proximo;
	}
}
}
