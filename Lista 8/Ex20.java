import java.util.ArrayList;
import java.util.Scanner;

class Ex20{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int aa[] = new int[10];
	
	for(int i = 0; i < aa.length; i++){
	System.out.print("Digite um numero: ");
	aa[i] = leia.nextInt();

		}
		
	System.out.println();
	
	for(int i = 0; i < aa.length; i++){
	System.out.print(aa[i] + " ");
		
		}
		
	System.out.println();
		
	int x;
	for(int i = 0; i < aa.length; i++){
	
	for(int i2 = 0; i2< aa.length; i2++){
	
	if(aa[i] > aa[i2]){
	x = aa[i];
	aa[i] = aa[i2];
	aa[i2] = x;
			
				}
			}
		}
		

	
	for(int i = 0; i < aa.length; i++){
	System.out.print(aa[i] + " ");
		
		}
}
}
