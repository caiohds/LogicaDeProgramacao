import java.util.Scanner;
class Ex6{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        
        
		System.out.println("Digite o primeiro valor: ");
        int n1= leia.nextInt();
        System.out.println("Digite o segundo valor diferente do primeiro: ");
        int n2= leia.nextInt();
       
if(n1>n2){
	System.out.println("O primeiro numero e maior que o segundo numero " );
	
	}else if(n2>n1){
	System.out.println("O segundo numero e maior que o primeiro " );
	
	}else{
		System.out.println("Digite valores diferentes");
		}
			
	
}        
}
