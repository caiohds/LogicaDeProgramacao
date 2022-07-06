import java.util.Scanner;
class Ex21{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
	int qt;
	int maior = 0;
	int menor = 2147483647;
	int n;
	System.out.println("Escreva a quantidade: ");
	qt = leia.nextInt();
	
	for(int i = 1; i<=qt;i++){
		System.out.println("Escreva o valor do numero: ");
		n = leia.nextInt();
		if(maior < n){
			maior = n;
			}
		if(menor> n){
			menor = n;
			}
		}
		System.out.println("Maior: "+ maior);
		System.out.println("Menor: "+ menor);
	
}
}
