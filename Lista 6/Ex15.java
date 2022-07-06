import java.util.Scanner;
class Ex15{
public static void main(String[] args){
int soma=0;
int valor1,valor2;
Scanner leia = new Scanner(System.in);
do{
System.out.println("Escreva o primeiro valor: ");
valor1 = leia.nextInt();
System.out.println("Escreva o segundo valor(maior que o primeiro): ");
valor2 = leia.nextInt();
}while(valor1>=valor2);

for(int i = valor1; i<=valor2; i++){

soma+=i;
}
System.out.println("Soma: "+soma);

}
}
