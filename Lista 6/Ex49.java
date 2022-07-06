import java.util.Scanner;
class Ex49{
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
cont2++;
}




}while(cont2<num);
int cont3 = 0;
do{
for(int i3 = i;i3>=1;i3--){
	cont = 0 ;
for(int i4 = 2;i4<i3;i4++){
	if( i3%i4 == 0){
		cont++;
			break;
		}
}
if(cont ==0){
System.out.println(i3);
cont3++;
}

	}
}while(cont3<num);
}
}
