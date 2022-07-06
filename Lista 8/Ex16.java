import java.util.ArrayList;
import java.util.Scanner;

class Ex16{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int quantidade;
do{
System.out.println("Digite a quantidade de termos da sequencia fibbonacci voce deseja: ");
 quantidade = leia.nextInt();
}while(quantidade<0 && quantidade>20);
int fib[] = new int[quantidade];
int ultimo = 1;
int penultimo = 0;
int proximo = 0;
for(int i = 0;i<quantidade;i++){
	if(i ==0){
		System.out.print("0 ");
		}else if( i ==1){
			System.out.print("1 ");
			}else{
			proximo = ultimo + penultimo;
	penultimo = ultimo;
	ultimo = proximo;
	fib[i] = proximo;
	System.out.print(fib[i] + " ");
}
	}


}
}
