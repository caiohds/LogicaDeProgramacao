import java.util.Scanner;
class Ex36{
public static void main(String[] args){
 Scanner leia = new Scanner(System.in);
 
int quant;

do{
	
	int i2 = 1;
	int i3 = 1;

System.out.println("Digite um valor: ");
quant = leia.nextInt();
	if(quant <0){
		System.out.println("Digite apenas numeros positivos!");
		
		
		}else if(quant == 0){
			System.out.println("Fim do Programa");
			
			}else if (quant>0){
				for(int i = 1;i<=quant;i++){
					 if(i3==1){
						 System.out.print(i2+ " ");
						 }else{
					 System.out.print(i2+ "/" + i3 + " ");
					  
					 
				 }
					i3++; 
					}	
					System.out.println(); 
	}
}while(quant != 0);
}			
}
