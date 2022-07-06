import java.util.Scanner;
class Ex16{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 int cont = 0;




for(int i = 0;i<frase.length();i++){



if(frase.charAt(i) >=65 && frase.charAt(i) <= 90){
	cont++;
}else{
	System.out.println("Nem todas as letras sao maiusculas");
	break;
	}  
}
if(cont != 0){
 System.out.println("Todas as letras sao maiusculas");
}
	 }
	
	
}	
	
