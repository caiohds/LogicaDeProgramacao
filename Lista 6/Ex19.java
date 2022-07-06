import java.util.Scanner;
class Ex19{
public static void main(String[] args){
	int nm = 0;
	double valor;
	int media = 0;
	char resp;
Scanner leia = new Scanner(System.in);
do{
	nm++;
	System.out.println("Escreva o valor da mercadoria: ");
	valor = leia.nextDouble();
	media +=valor;
	System.out.println("Deseja continuar(digite 's' se deseja continuar)?: ");
	resp = leia.next().charAt(0);
}while(resp == 's');
System.out.println("Valor Total: " + media);	
System.out.println("Media da mercadoria: "+ media/nm);
}
}
