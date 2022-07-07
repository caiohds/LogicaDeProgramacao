import java.util.Random;

public class Programa1{
public static void main(String[] args){
	Random random = new Random();
	
 String sequencia = "";
 


 

 


char anterior=2;
int cont = 0;
int cont2 = 0;

int x = 0;

for(int i = 1;i<=10;i++){
x = (int) (Math.random() * 2);
if( x ==  1){
	
sequencia = sequencia + '1';
}if(x == 0){
	sequencia = sequencia + '0';
	}

}
int i2;

for( i2 = 0;i2<sequencia.length();i2++){
	
		
		if(sequencia.charAt(i2) == anterior){
		if(sequencia.charAt(i2) == '0'){
			cont++;
			
			do{
				i2++;
				if(i2 == 9){
					break;
					}
				}while(sequencia.charAt(i2) == '0' );	
			}else{
				cont2++;
				
				
				do{
				i2++;
				if(i2 == 9){
					break;
					}
				}while(sequencia.charAt(i2) == '1');	
				
				}
				
		}
		anterior = sequencia.charAt(i2);	
	
	}
	int total = cont + cont2; 
	System.out.println("Sequencia: " +sequencia);
	System.out.println("Zeros: " +cont);
	System.out.println("Uns: " +cont2);
	System.out.println("Total: " +total);
}
}
