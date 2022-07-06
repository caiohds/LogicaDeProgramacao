import java.util.Scanner;
class Ex19{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma palavra");
 frase = leia.nextLine();
  String frase2 = new StringBuilder(frase).reverse().toString();
if(frase.equals(frase2)){
	 System.out.println("E um palindromo");
	
	}else{
		System.out.println("Nao e um palindromo");
		}



}
}
