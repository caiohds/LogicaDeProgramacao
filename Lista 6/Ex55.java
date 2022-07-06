import java.util.Scanner;
class Ex55{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);


int divisor = 0;
System.out.println("Digite o numero : ");
int num = leia.nextInt();


for(int i = 1;i<num;i++){
	if(num%i == 0){
		divisor+=i;
		}
	}
	if(divisor == num){
		System.out.println("O numero e perfeito");
		}else{
			System.out.println("O numero nao e perfeito");
			}


}
}
