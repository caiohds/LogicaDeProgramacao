import java.util.Scanner;
class Ex24{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
	
	
	
	System.out.print("Digite uma sequencia binaria: ");
	String sequencia = leia.nextLine();
	int anterior = 0;
	int maior = 0;
	int tamanho = 0;
	
	for(int i = 0;i<sequencia.length();i++){
		
		
			if(sequencia.charAt(i) == '1'){
				
			if(sequencia.charAt(i) == anterior){
				tamanho++;
				
				if(tamanho > maior){
				maior = tamanho+1;
				
				}
				}else{
				tamanho = 0;
					}
			
			
			}
		
		anterior = sequencia.charAt(i);
		}
	System.out.println("A maior sequencia consecutiva de numeros 1 e: "+ maior);
	
	}
}
