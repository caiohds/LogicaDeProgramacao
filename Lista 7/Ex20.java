import java.util.Scanner;
class Ex20{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
String[] words = frase.split("\\s+");
System.out.println("Quantidade de palavras: " + words.length);



}
}
