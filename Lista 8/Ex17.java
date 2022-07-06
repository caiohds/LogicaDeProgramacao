import java.util.ArrayList;
import java.util.Scanner;

class Ex17{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int quantidade;
do{
System.out.println("Digite a quantidade de numeros primos voce deseja: ");
quantidade = leia.nextInt();
}while(quantidade<0 && quantidade>20);
int primos[] = new int[quantidade];
int divisores = 0;
int numero = 1;
for(int i = 0;i<quantidade;i++){
	numero++;
	divisores = 0;
for(int i2 = 2;i2<numero;i2++){
	if(numero%i2 == 0){
		divisores++;
		}
	}
	if(divisores == 0){
		primos[i] = numero;
		System.out.print(primos[i] + " ");
		}else{
			i--;
			}
		
	}


}
}
