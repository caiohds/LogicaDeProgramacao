import java.util.Scanner;
class Ex4{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        
        
		System.out.println("Digite a nota da primeira prova: ");
        double p1= leia.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");
        double p2= leia.nextDouble();
       double total = (p1+p2)/2;
if(total>=6 ){
	System.out.println("APROVADO " );
	System.out.println("Media: "+ total );
	}else if(total<6){
	System.out.println("REPROVADO " );
	System.out.println("Media: "+ total );
	}
			
	
        
}
}
