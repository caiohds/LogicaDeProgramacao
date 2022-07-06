import java.util.Scanner;
class  VerificaValorProduto{
	
public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
       
       System.out.println("Escreva o valor do primeiro produto 1 a 1000: ");
      int precoProduto1= leia.nextInt();
      
       System.out.println("Escreva o valor do segundo  produto de 1 a 1000: ");
      int precoProduto2= leia.nextInt();
       
            
         if((precoProduto1> 1000 || precoProduto1 == 0)|| (precoProduto2> 1000 || precoProduto2 == 0)){
			 
			System.out.println("Valor invalido");
				 
		}else if(precoProduto1 > precoProduto2){
			
			System.out.println("O primeiro produto e mais caro que o segundo produto");
			
		}else if(precoProduto1 < precoProduto2){
			
			System.out.println("O segundo produto e mais caro que o primeiro produto");
						
		}else
			{
			System.out.println("Os dois produtos possuem o mesmo valor");
			}
        
}
}
