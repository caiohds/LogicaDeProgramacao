import java.util.Scanner;
class Ex14{
public static void main(String[] args){
int soma=0;
int valor1,valor2;
Scanner leia = new Scanner(System.in);
System.out.println("Escreva o primeiro valor: ");
valor1 = leia.nextInt();
System.out.println("Escreva o segundo valor: ");
valor2 = leia.nextInt();
for(int i = valor1; i<=valor2; i++){

soma+=i;
}
System.out.println("Soma: "+soma);

}
}
