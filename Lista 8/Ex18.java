import java.util.ArrayList;
import java.util.Scanner;

class Ex18{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int quantidade;
int numero = 0;
int fatorial = 1;
do{
System.out.println("Digite a quantidade de numeros fatoriais voce deseja ver: ");
quantidade = leia.nextInt();
}while(quantidade<=0 && quantidade>15);
int fatoriais[] = new int[quantidade];
for(int i = 0; i<quantidade; i++){
	fatorial = 1;
	numero++;
	
for(int i2 = numero;i2>=1;i2--){
	fatorial *=i2;
	
	}
	fatoriais[i] = fatorial;
	System.out.println(numero+ " = "+ fatoriais[i] );
	}
}
}
