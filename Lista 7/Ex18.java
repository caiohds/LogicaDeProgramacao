import java.util.Scanner;
class Ex18{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma sequencia");
 frase = leia.nextLine();
 if(frase.length() == 8){
for(int i = 0;i<frase.length();i++){
	if(frase.charAt(i) != '0' && frase.charAt(i) != '1'){
		System.out.println("Nao e uma sequencia de 8 bit's");
		break;
		}
	if(i == 7){
		System.out.println("E uma sequencia de 8 bit's");
		}
	}
}else{
	System.out.println("Nao e uma sequencia de 8 bit's");

	}

}
}
