import java.util.Scanner;
class Ex10{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        
        
		System.out.println("Digite o salario fixo: ");
        double sf= leia.nextDouble();
        System.out.println("Digite o valor das vendas: ");
        double vendas= leia.nextDouble();
       
if(vendas<= 1500){
	double sfinal = (vendas * 0.03) + sf;
	System.out.println( "Salario final: "+ sfinal);
	
	}else {
		double sfinal = (vendas * 0.05) + sf;
	System.out.println( "Salario final: "+ sfinal);
		}
			
	
}        
}
