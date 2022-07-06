import java.util.Scanner;
class Ex11{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 String frase;
 System.out.println("Digite uma frase");
 frase = leia.nextLine();
 frase = frase.toLowerCase();
 int cont = 0;
 int cont2 = 0;
int i2 ;
int i3;

for(int i = 0;i<frase.length();i++){
for(  i2 = 97; i2<=122;i2++){


if(frase.charAt(i) == i2){
	cont++;	
}  
}
for(  i3 = 48; i3<=57;i3++){


if(frase.charAt(i) == i3){
	cont2++;	
}
}  
	 }
	System.out.println("Quantidade de letras : "  + cont );
	System.out.println("Quantidade de numeros : "  + cont2 );
}	
	}	
	

