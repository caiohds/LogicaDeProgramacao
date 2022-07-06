import java.util.Scanner;
class Ex57{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);


int divisor = 0;
System.out.println("Digite a quantidade de numeros perfeitos: ");
int quant = leia.nextInt();
int i = 1;
int i5 = 0;
do{
	i++;
	divisor = 0;
for(int i2 = 1;i2<i;i2++){
	if(i%i2 == 0){
		divisor+=i2;
		}
		
	}
	if(divisor == i){
		i5++;
		System.out.println(i);
		}
	}while(i5<quant);
	


}
}
