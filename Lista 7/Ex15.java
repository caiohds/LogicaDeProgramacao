import java.util.Scanner;
class Ex15{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 frase = frase.toLowerCase();
int cont = 0;

for(int i = 0;i<frase.length();i++){



if(frase.charAt(i) >=48 && frase.charAt(i) <=57){
	cont++;

	break;

}  
	 }
if(cont != 0 ){
		System.out.println("A frase contem caracteres numericos ");	
	}else{
			System.out.println("A frase nao contem caracteres numericos ");	
		}	
	
}	
	}	
