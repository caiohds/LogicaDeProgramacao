import java.util.Scanner;
class Ex52{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);

System.out.println("Digite o numero: ");
int num = leia.nextInt();
int ultimo = 0;
int penultimo = 1;
int proximo = 0;
do{
	
	System.out.print(proximo + " ");
	proximo = penultimo + ultimo;
	penultimo = ultimo;
	ultimo= proximo;
	}while(proximo< num);
	if(proximo == num){
		System.out.println("\nPertence a sequencia fibonacci");
		
		}else{
			System.out.println("\nNao pertence a sequencia fibonacci");
			}
}
}
