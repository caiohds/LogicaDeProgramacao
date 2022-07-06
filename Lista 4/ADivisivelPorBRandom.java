
import java.util.Random;
class ADivisivelPorBRandom{
	
public static void main(String[] args) {


        
        Random rd = new Random();
        int a = rd.nextInt(1001);
        int b = rd.nextInt(21);
       if(b == 0){
			   System.out.println("A divisao nao pode ser efetuada, pois b e igual a 0");
			   
		   }
        else if( a % b == 0){
		   System.out.println("O valor A e divisivel por B");
		   }else{
			   System.out.println("O valor A nao e divisivel por B");
			   }
		 System.out.println(a);
		  System.out.println(b);
		 
       
            
  
        
}
}
