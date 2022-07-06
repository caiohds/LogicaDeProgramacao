import java.util.Scanner;
class Ex50{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int cont = 0;
int cont2 = 0;
System.out.println("Digite o numero inicial: ");
int num = leia.nextInt();
System.out.println("Digite a quantidade de numeros primos voce deseja ver: ");
int quant = leia.nextInt();

do{

cont = 0 ;
for(int i2 = 2;i2<num;i2++){
 if( num%i2 == 0){
		cont++;
			break;
		}
}

if(cont ==0){
System.out.println(num);
cont2++;
}
num++;



}while(cont2<quant);
}
}
