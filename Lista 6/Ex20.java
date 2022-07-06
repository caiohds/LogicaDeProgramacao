import java.util.Scanner;
class Ex20{
public static void main(String[] args){
	int maior = 0;
	int menor =99999999;
	Scanner leia = new Scanner(System.in);
	for(int i = 1;i<=100;i++){
		System.out.println("Escreva um valor: ");
		int valor = leia.nextInt();
		if( maior < valor){
			maior = valor;
			}else if(valor < menor){
				menor = valor;
			}
		}
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);
}
}
