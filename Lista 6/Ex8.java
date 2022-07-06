import java.util.Scanner;
class Ex8{
public static void main(String[] args){
int neg = 0;
Scanner leia = new Scanner(System.in);
for(int i = 1; i<=10;i++){
System.out.println("Escreva um numero: ");
int n = leia.nextInt();
if(n < 0){
neg++;
}
}
System.out.println("Quantidade de numeros negativos: " +neg);
}

}
