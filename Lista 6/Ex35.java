import java.util.Scanner;
class Ex35{
public static void main(String[] args){
 Scanner leia = new Scanner(System.in);
 
int quant;

do{
	
	int i2 = 1;

System.out.println("Digite um valor: ");
quant = leia.nextInt();
	if(quant <0){
		System.out.println("Digite apenas numeros positivos!");
		
		
		}else if(quant == 0){
			System.out.println("Fim do Programa");
			
			}else if (quant>0){
				for(int i = 1;i<=quant;i++){
					 
					 System.out.print(i2+ " " );
					  System.out.print(-i2+ " " );
					 i2++;
					 
					 
					}	
					System.out.println(); 
	}
}while(quant != 0);
}			
}
