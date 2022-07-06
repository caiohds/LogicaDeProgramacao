import java.util.Scanner;
class Ex23{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
	
	
	
	System.out.print("Digite uma frase: ");
	String nome = leia.nextLine();
	String sobrenome;
	String[] words = nome.split("\\s+");
	int i = words.length-1;
	System.out.print(words[i]);	

	
	}
}
