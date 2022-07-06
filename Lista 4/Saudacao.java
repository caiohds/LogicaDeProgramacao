import java.util.Random;
import java.util.Scanner;
class Saudacao{
	
public static void main(String[] args) {
Random rd = new Random();
 Scanner leia = new Scanner(System.in);
        //int hora = rd.nextInt(24);
       
		System.out.println("Voce deseja escolher os valores ou  gerar valores aleatorios?Digite 1 pra escolher e 2 para aleatoria: ");
        int op= leia.nextInt();
       
if( op == 1){
	int hora = rd.nextInt(24);
		if( hora <= 6){
				
			System.out.println("zZzZzZzZzZzZzZzZzZzZz");
			System.out.println("Hora: "+ hora);
		}else if(hora <=11){
			
			System.out.println("Bom dia");
			System.out.println("Hora: "+ hora);
			
		}else if(hora <=17){
			
			System.out.println("Boa tarde");
			System.out.println("Hora: "+ hora);
			
		}else{
				
			System.out.println("Boa noite");
			System.out.println("Hora: "+ hora);
		}
}else if (op == 2){
	System.out.println("Que horas sao?: ");
    int hora= leia.nextInt();
        if( hora <= 6){
				
			System.out.println("zZzZzZzZzZzZzZzZzZzZz");
			System.out.println("Hora: "+ hora);
		}else if(hora <=11){
			
			System.out.println("Bom dia");
			System.out.println("Hora: "+ hora);
			
		}else if(hora <=17){
			
			System.out.println("Boa tarde");
			System.out.println("Hora: "+ hora);
			
		}else{
				
			System.out.println("Boa noite");
			System.out.println("Hora: "+ hora);
		}
	
}else{
			System.out.println("Digite apenas 1 ou 2");
	}
     
        
}
}
