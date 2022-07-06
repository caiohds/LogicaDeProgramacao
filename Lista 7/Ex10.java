import java.util.Scanner;
class Ex10{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 
 int cont = 0;
int i2 ;


for(int i = 0;i<frase.length();i++){
for(  i2 = 65; i2<=90;i2++){
	

if(frase.charAt(i) == i2){
	cont++;
	
	
	
}
 
  
}

	 }
	System.out.println("Quantidade de letras maiusculas: " + ": " + cont );
}

}
