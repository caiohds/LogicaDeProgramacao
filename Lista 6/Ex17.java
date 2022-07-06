import java.util.Scanner;
class Ex17{
public static void main(String[] args){
double nota1,nota2;

char resp;
Scanner leia = new Scanner(System.in);
do{
	System.out.println("Escreva a primeira nota: ");
	nota1 = leia.nextDouble();
	System.out.println("Escreva a segunda nota: ");
	nota2 = leia.nextDouble();
	double media = (nota1 + nota2) /2;
	System.out.println("Media: "+media);
	System.out.println("Voce deseja continuar?(Digite S se deseja continua)");
	resp = leia.next().charAt(0);
	
	}while(resp=='S');

}
}
