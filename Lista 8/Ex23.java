import java.util.Scanner;
import java.util.ArrayList;
public class Ex23{
public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	int AD[] = new int[5];
	int x = 0;
	for(int i = 0;i<5;i++){
	System.out.println("Digite um numero: ");
	int numero = leia.nextInt();
	AD[i] = numero;
}
	for(int i = 0; i<5;i++){
	for(int i2 = 0; i2<5;i2++){
		if(AD[i2]%2 == 0){
			if(AD[i] < AD[i2]){
				x = AD[i];
				AD[i] = AD[i2];
				AD[i2] = x;
				
				}
				
				}
			
			}
			
		}
		System.out.println();
		for(int i = 0;i<5;i++){
			if(AD[i]%2==0){
			System.out.print(AD[i] + " ");
		}
			}
}
}
