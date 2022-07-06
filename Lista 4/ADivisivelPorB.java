import java.util.Scanner;
class ADivisivelPorB{
	
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		System.out.println("Escreva o valor do primeiro numero 0 a 1000: ");
        int a= leia.nextInt();
      
       System.out.println("Escreva o valor do segundo  numero de 0 a 20: ");
       int b= leia.nextInt();
        
     if(b<1){
		   System.out.println("O valor de B tem que ser maior que 0");
	}
	  
	if(a % b == 0){
		   System.out.println("A e divisivel por B");
	}else if(a % b != 0){
			System.out.println("A nao e divisivel por B");
	}else{
		System.out.println("O valor digitado nao e valido");
		}
       
		
            
  
        
}
}
