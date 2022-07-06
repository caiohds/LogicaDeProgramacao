import java.util.Scanner;
class Ex12{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
		 
		System.out.println("Digite o preco do produto: ");
        double preco= leia.nextDouble();
        System.out.println("Digite o Codigo de Origem (1- Norte 2,5,9 - Sul 3,10 ate 15- Leste 7 ou 20 - Oeste qualquer outro-Importado: ");
        int co= leia.nextInt();
        double frete;
        double valorF;
        
        switch(co){

        case 1:
             frete = preco * 0.1;
             valorF = preco + frete;
             
             System.out.println("Frete: " +frete);
             System.out.println("Valor Final: " +valorF);
             System.out.println("Regiao: Norte " );
            break;

         case 2:
         case 5:
         case 9:
             frete = preco * 0.03;
             valorF = preco + frete;
             
             System.out.println("Frete: " +frete);
             System.out.println("Valor Final: " +valorF);
             System.out.println("Regiao: Sul " );
            break;
            
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
             frete = preco * 0.012;
             valorF = preco + frete;
             
             System.out.println("Frete: " +frete);
             System.out.println("Valor Final: " +valorF);
             System.out.println("Regiao: Leste " );
            break;
            
         case 7:
         case 20:
         
             frete = preco * 0.073;
             valorF = preco + frete;
             
             System.out.println("Frete: " +frete);
             System.out.println("Valor Final: " +valorF);
             System.out.println("Regiao: Oeste " );
            break;
         
           
        default:
            frete = preco * 0.222;
             valorF = preco + frete;
             
             System.out.println("Frete: " +frete);
             System.out.println("Valor Final: " +valorF);
             System.out.println("Regiao: importado " );


    }
}
}
