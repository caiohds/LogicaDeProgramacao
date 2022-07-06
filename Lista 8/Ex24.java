import java.util.Scanner;
import java.util.ArrayList;
public class Ex24{
public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
	int AE[] = new int[5];
	int x = 0;
	for(int i = 0;i<5;i++){
	System.out.println("Digite um numero: ");
	int numero = leia.nextInt();
	AE[i] = numero;
}
	for(int i = 0; i<5;i++){
	for(int i2 = 0; i2<5;i2++){
		if(AE[i2]%2 != 0){
			if(AE[i] > AE[i2]){
				x = AE[i];
				AE[i] = AE[i2];
				AE[i2] = x;
				
				}
				
				}
			
			}
			
		}
		System.out.println();
		for(int i = 0;i<5;i++){
			if(AE[i]%2!=0){
			System.out.print(AE[i] + " ");
		}
			}
}
}
