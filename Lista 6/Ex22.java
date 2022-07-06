import java.util.Scanner;
class Ex22{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
	int cod;
	int preco;
	int maior = 0;
	int media= 0;
	for(int i = 1; i<=15;i++){
		System.out.println("Digite o codigo do produto: ");
		cod = leia.nextInt();
		System.out.println("Digite o preco do produto: ");
		preco = leia.nextInt();
		if(maior< preco){
			maior = preco;
			}
			media += preco;
		}
	System.out.println("Maior: "+ maior);
	System.out.println("Media: "+ media/15);
}
}
