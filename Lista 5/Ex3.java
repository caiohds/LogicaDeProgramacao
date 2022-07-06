import java.util.Scanner;
class Ex3{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        
        double total;
		System.out.println("Digite a quantidade: ");
        int qt= leia.nextInt();
       
if(qt>= 12 ){
	total = qt * 1;
	System.out.println("Preco final: "+ total + " R$");
	}else if(qt<12){
	total = qt * 1.30;
	System.out.println("Preco final: "+ total + " R$");
	}
			
	
        
}
}
