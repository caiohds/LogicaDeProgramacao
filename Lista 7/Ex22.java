import java.util.Scanner;
class Ex22{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
	
	
	int cont= 0;	
	System.out.print("Digite uma frase: ");
	String frase = leia.nextLine();
	System.out.print("Digite uma palavra: ");
	String palavra = leia.nextLine();
	frase = frase.toLowerCase();
	palavra = palavra.toLowerCase();
		
	for(int i = 0; i < frase.length(); i++){
	
	if(frase.substring(i).startsWith(palavra)){
	cont++;
			
		}
	}
		
	System.out.println("Quantidade de ocorrencias da palavra \'" + palavra + "\' na frase: " + cont);
	
	}
}

