import java.util.Scanner;
class Ex34{
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
				for(int i = 1;i<=quant;i++){
					 i3++;
					 System.out.print(i2+ " " );
					 i2+= i3;
					}	
					System.out.println(); 
	}
}while(quant != 0);
}			
}
