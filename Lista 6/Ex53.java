import java.util.Scanner;
class Ex53{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);


int ultimo = 0;
int penultimo = 1;
int proximo = 0;

do{	
	System.out.print(proximo + " ");
	proximo = penultimo + ultimo;
	penultimo = ultimo;
	ultimo= proximo;
	}while(proximo<=250);

}
}
