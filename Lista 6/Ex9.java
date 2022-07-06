import java.util.Scanner;
class Ex9{
public static void main(String[] args){

	Scanner leia = new Scanner(System.in);
	
int n;
int intervalo = 0;
int intervalo2 = 0;
for(int i = 1; i<=10;i++){
System.out.println("Escreva um numero: ");
n = leia.nextInt();
if(n>=10 && n<=20){
	intervalo++;
}else{
	intervalo2++;
}

}
System.out.println("Quantidade dentro do intervalo de 10 a 20: " + intervalo);
System.out.println("Quantidade fora do intervalo de 10 a 20: " + intervalo2);
}
}
