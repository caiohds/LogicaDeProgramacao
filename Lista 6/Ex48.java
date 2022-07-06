import java.util.Scanner;
class Ex48{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int cont = 0;
int cont2 = 0;
System.out.println("Digite a quantidade de numeros primos voce deseja ver: ");
int num = leia.nextInt();
int i = 1;
do{
i++;
cont = 0 ;
for(int i2 = 2;i2<i;i2++){
 if( i%i2 == 0){
		cont++;
			break;
		}
}
if(cont ==0){
System.out.println(i);
cont2++;
}




}while(cont2<num);
}
}
