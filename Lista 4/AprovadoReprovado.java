import java.util.Scanner;
class  AprovadoReprovado{
	
public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
       
       System.out.println("Escreva uma nota de 0 a 10: ");
      double nota= leia.nextDouble();
       
            System.out.println("Nota: "+nota);
            if( nota  > 10){
				System.out.println("Nota invalida");
				}else if ( nota  < 6){
					System.out.println("REPROVADO");
					}else {
						System.out.println("APROVADO");
						}
        
}
}
