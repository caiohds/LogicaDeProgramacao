import java.util.Scanner;
class Ex14{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 char c;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 
 System.out.println("Digite um caracter");
 c = leia.next().charAt(0);
 
 




for(int i = 0;i<frase.length();i++){

if( frase.charAt(i) == c ){
frase = frase.replace(frase.charAt(i), '*');
}  
} 
	System.out.println(frase);
	
}	
	}	
