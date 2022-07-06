//Caio Henrique Donizete Silva
import java.util.Random;
public class  ExibeNumeroAleatorio{
	
	public static void main (String[] args) {
		Random random = new Random();
		double numeroAleatorio= random.nextDouble() * 100;		
		System.out.print("Número Aleatório: "+  numeroAleatorio);
		
		 
	}
}
