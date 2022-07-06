import java.util.Random;
class VerificaValorProdutoRandom{
	
public static void main(String[] args) {
Random rd = new Random();

        int precoProduto1 = rd.nextInt(1000)+1;
        int precoProduto2 = rd.nextInt(1000)+1;
       
            System.out.println("Valor do primeiro produto: " + precoProduto1);
            System.out.println("Valor do segundo produto: " + precoProduto2);
        if(precoProduto1 > precoProduto2){
			System.out.println("O primeiro produto e mais caro que o segundo produto");
		}else if(precoProduto1 < precoProduto2){
			System.out.println("O segundo produto e mais caro que o primeiro produto");
			
			
			}else
			{
				System.out.println("Os dois produtos possuem o mesmo valor");
				}

     
        
}
}
