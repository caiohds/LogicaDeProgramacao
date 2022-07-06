import java.util.Scanner;
class Ex13{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 frase = frase.toLowerCase();
 int cont = 0;


int i2 ;

for(int i = 0;i<frase.length();i++){

if( (int)frase.charAt(i)>=97 || (int)frase.charAt(i) <=122){

if(frase.charAt(i) != 97 && frase.charAt(i) != 101 && frase.charAt(i) != 105 && frase.charAt(i) != 111 && frase.charAt(i) != 117 ){
	cont++;	
}  
}  
} 
	System.out.println("Quantidade de consoantes : "  + cont );
	
}	
	}	
