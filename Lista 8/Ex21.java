import java.util.ArrayList;
import java.util.Scanner;

class Ex21{
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
		
	
	for(int i = 0; i < aa.length; i++){
	if(aa[i] %2 != 0){
	aa[i] = aa[i] * 2;
			
				
			}
		}
		

	
	for(int i = 0; i < aa.length; i++){
	System.out.print(aa[i] + " ");
		
		}
}
}
