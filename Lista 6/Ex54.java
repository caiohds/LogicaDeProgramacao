import java.util.Scanner;
class Ex54{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);


int ultimo = 0;
int penultimo = 1;
int proximo = 0;
int in,fim;
System.out.println("Digite o numero inicial: ");
in = leia.nextInt();
System.out.println("Digite o numero final: ");
fim = leia.nextInt();

do{	
	
	if(proximo>=in){
	System.out.print(proximo + " ");
}
proximo = penultimo + ultimo;
	penultimo = ultimo;
	ultimo= proximo;
	}while(proximo<=fim);

}
}
