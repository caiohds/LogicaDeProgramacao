import java.util.Scanner;
class Ex40{
public static void main(String[] args){
 Scanner leia = new Scanner(System.in);
 
int quant;

do{
	
	int i2 = 0;
	int i3 = 0;
	

System.out.println("Digite um valor: ");
quant = leia.nextInt();
	if(quant <0){
		System.out.println("Digite apenas numeros positivos!");
		
		
		}else if(quant == 0){
			System.out.println("Fim do Programa");
			
			}else if (quant>0){
				
				for(i2 = 1;i2<=quant/2;i2++){
					System.out.print( i2 + " ");
					
					}	
				for(i3 = quant/2;i3>=1;i3--){
					System.out.print(" "+ i3 + " ");
					
					}
				
					
						
					System.out.println();
					
	}
}while(quant != 0);
}			
}
