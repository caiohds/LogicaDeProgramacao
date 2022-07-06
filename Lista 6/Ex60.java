import java.util.Scanner;
class Ex60{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
System.out.println("Digite o numero para verificar : ");
int num = leia.nextInt();
System.out.println("Digite o primeiro numero: ");
int ultimo = leia.nextInt();
System.out.println("Digite o segundo numero: ");
int penultimo = leia.nextInt();
int proximo = 0;
do{
	proximo = penultimo + ultimo;
	System.out.print(proximo + " ");
	
	penultimo = ultimo;
	ultimo= proximo;
	}while(proximo<num);
	if(num == proximo){
		System.out.println("\nO numero pertence a sequencia");
		
		}else{
			System.out.println("\nO numero nao pertence a sequencia");
			
			}
}
}
