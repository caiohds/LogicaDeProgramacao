import java.util.Scanner;
class Ex10{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int media = 0;
int n;

for(int i = 1; i<=10;i++){
System.out.println("Escreva um numero: ");
n = leia.nextInt();

media+=n;
}
System.out.println("Media dos numeros digitados: " + media/10);
}

}
