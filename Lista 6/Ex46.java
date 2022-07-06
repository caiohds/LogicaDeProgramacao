import java.util.Scanner;
class Ex46{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 
int num;
int cont = 0;
	System.out.println("Escreva um numero: ");
	num = leia.nextInt();
for(int i = 2;i<num;i++){

	if ( num% i == 0){
		cont++;
	}

	
	}
	if( cont ==0){
			System.out.println("O numero e primo!");
		}else{
			
			System.out.println("O numero nao e primo!");
			}
}
}
