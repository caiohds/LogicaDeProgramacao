import java.util.Scanner;
class Ex9{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        
        
		System.out.println("Digite o total de horas trabalhadas no mes: ");
        int h= leia.nextInt();
        System.out.println("Digite o salario por hora: ");
		double sh= leia.nextDouble();
        double he = h/4;
        double h2 = (he - 40)* 4;
        double hf = h - h2;
        
       
if(he>40){
	double sf = (hf * sh) + ((sh *h2) *1.5);
	System.out.println( "Salario final: " + sf);
	
	}else {
		double sf = h * sh;
		System.out.println( "Hora total: " + sf);
		}
			
	
}        
}
