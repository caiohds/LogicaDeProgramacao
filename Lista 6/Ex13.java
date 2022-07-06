import java.util.Scanner;
class Ex13{
public static void main(String[] args){
int soma=0;
int n;
Scanner leia = new Scanner(System.in);

for(int i = 1; i<=10; i++){
System.out.println("Escreva um numero: ");
n = leia.nextInt();
if( n<40){
soma+=n;
}
}
System.out.println("Soma dos numeros inferiores a 40: "+soma);

}
}
