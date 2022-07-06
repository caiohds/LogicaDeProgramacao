import java.util.Scanner;
class Ex21{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
String[] words = frase.split("\\s+");
for(int i = 0; i<words.length;i++){
	System.out.println(words[i]);
	}




}
}
