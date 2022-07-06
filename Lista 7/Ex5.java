import java.util.Scanner;
class Ex5{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 frase= frase.toLowerCase();
 int cont = 0;

 for(int i = 0;i<frase.length();i++){
if(frase.charAt(i) == 'a'){
	cont++;
}
	 }
	 System.out.println("Quantidade de 'a' repetidos na frase: " + cont);
}

}
