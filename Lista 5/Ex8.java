import java.util.Scanner;
class Ex8{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        
        
		System.out.println("Digite a hora do inicio do jogo: ");
        int in= leia.nextInt();
        System.out.println("Digite a hora do fim do jogo: ");
        int fim= leia.nextInt();
        int ht = fim - in;	
       
if(ht>=24){
	System.out.println( "Nao pode utrapassar de 24 horas de jogo");
	
	}else {
		System.out.println( "Hora total: " + ht);
		}
			
	
}        
}
