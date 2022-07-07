import java.util.Scanner;
public class Programa2 {
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
int i = 0;

do{
	i++;
	proximo = penultimo + ultimo;
	penultimo = ultimo;
	ultimo= proximo;
	
}while(i<=fim);
for(int i2 = fim;i2>=in;i2--){
	
	proximo =  ultimo -penultimo ;
	ultimo = penultimo;
	penultimo= proximo;
	System.out.print(proximo + " ");
	}
			}
 
    }

