import java.util.Scanner;
class Ex9{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 frase= frase.toLowerCase();
 int cont = 0;





	
for(int i = 0;i<frase.length();i++){

if(frase.charAt(i) == ' '){
	cont++;
	
	
	
}

}
 
 System.out.println("Quantidade de espacos em branco: " + cont ); 


	 
	
}

}
import java.util.Scanner;
class Ex7{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 frase= frase.toLowerCase();
 int cont = 0;
int i2 ;



for(  i2 = 97; i2<=122;i2++){
	cont = 0;
for(int i = 0;i<frase.length();i++){
if(frase.charAt(i) == i2){
	cont++;
	
	
	
}
 
  
}
System.out.println((char)i2 + ": " + cont );
	 }
	
}

}
