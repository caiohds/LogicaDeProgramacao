import java.util.Scanner;
class Ex12{
public static void main(String[] args){
int soma=0;
int n;
Scanner leia = new Scanner(System.in);

for(int i = 1; i<=10; i++){
System.out.println("Escreva um numero: ");
n = leia.nextInt();
soma+=n;
}
System.out.println("Soma: "+soma);

}
}
