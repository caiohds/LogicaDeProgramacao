import java.util.Scanner;
class Ex18{
public static void main(String[] args){
	int nm;
	double valor;
	int media = 0;

Scanner leia = new Scanner(System.in);
System.out.println("Escreva o numero de mercadorias do estoque: ");
nm = leia.nextInt();
for(int i = 1; i<=nm;i++){
	System.out.println("Escreva o valor da mercadoria: ");
	valor = leia.nextDouble();
	media +=valor;
	}
System.out.println("Valor Total: " + media);	
System.out.println("Media da mercadoria: "+ media/nm);
}
}
