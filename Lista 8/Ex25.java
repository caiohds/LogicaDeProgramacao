import java.util.Scanner;
import java.util.ArrayList;
public class Ex25{
public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite a quantidade de termos: ");
	int quantidade = leia.nextInt();
	int AF[] = new int[quantidade];
	int x = 0;
	
	int x2 = 0;
	for(int i = 0;i<quantidade;i++){
	System.out.println("Digite um numero: ");
	AF[i]  = leia.nextInt();
	
}
	for(int i = 0; i<quantidade;i++){
		int divisor = 0;
	for(int i2 = 2; i2<quantidade;i2++){
		if(AF[i]%i2 == 0){
			divisor++;
				
			}
					
			
			}
		if(divisor == ){
			if(AF[i] < AF[i2]){
				x = AF[i];
				AF[i] = AF[i2];
				AF[i2] = x;
				
				}
			}
			
		}
		System.out.println();
		for(int i = 0;i<quantidade;i++){
			if(AF[i]%2!=0){
			System.out.print(AF[i] + " ");
		}
			}
			System.out.println();
			for(int i = 0;i<quantidade;i++){
			if(AF[i]%2==0){
			System.out.print(AF[i] + " ");
		}
			}
}
}
