import java.util.ArrayList;
import java.util.Scanner;

class Ex19{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int z[] = new int[10];
	
	for(int i = 0; i < z.length; i++){
	System.out.print("Digite um numero: ");
	z[i] = leia.nextInt();

		}
		
	System.out.println();
	
	for(int i = 0; i < z.length; i++){
	System.out.print(z[i] + " ");
		
		}
		
	System.out.println();
		
	int x;
	for(int i = 0; i < z.length; i++){
	
	for(int i2 = 0; i2< z.length; i2++){
	
	if(z[i] < z[i2]){
	x = z[i];
	z[i] = z[i2];
	z[i2] = x;
			
				}
			}
		}
		

	
	for(int i = 0; i < z.length; i++){
	System.out.print(z[i] + " ");
		
		}
}
}
