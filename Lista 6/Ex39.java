import java.util.Scanner;
class Ex39{
public static void main(String[] args){
 Scanner leia = new Scanner(System.in);
 
int quant;

do{
	
	int i2 = 1;
	int i3 = 50;
	int i4 = 0;
	int i5 = 0;

System.out.println("Digite um valor: ");
quant = leia.nextInt();
	if(quant <0){
		System.out.println("Digite apenas numeros positivos!");
		
		
		}else if(quant == 0){
			System.out.println("Fim do Programa");
			
			}else if (quant>0){
				for(int i = 1;i<=quant;i++){
					
				
					  System.out.print(i2+ "/" + i3 + " ");
					  
					 
				 i4+=i2;
				 i5+=i3; 
				 i2++;
					i3--;
					
					}	
					System.out.println();
					System.out.println("Soma: " + i4 + " / " + i5);  
	}
}while(quant != 0);
}			
}
