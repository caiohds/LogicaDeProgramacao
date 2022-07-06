import java.util.Scanner;
class Ex11{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
		 String texto;
         System.out.print("Qual operacao voce deseja realizar ( + - / *)?: ");
		 texto = leia.next();
		System.out.println("Digite o primeiro valor: ");
        double v1= leia.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double v2= leia.nextDouble();
        double total;
        
        switch(texto){

        case "+":
             total = v1 + v2;
             System.out.println("Valor total: " + total);
            break;

        case "*":
             total = v1 * v2;
              System.out.println("Valor total: " + total);
            break;
        
        case "/":
             total = v1 / v2;
              System.out.println("Valor total: " + total);
            break;
        
        case "-":
             total = v1 - v2;
              System.out.println("Valor total: " + total);
            break;       
           
        default:
            System.out.println("Digite apenas sinais de operacao aritimetica " );


    }
        
}	      
}
