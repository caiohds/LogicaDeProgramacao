import java.util.Scanner;
class Ex5{

public static void main(String[] args){
Scanner leia = new Scanner(System.in);

	int n;
	do{
		System.out.println("Digite um numero maior que zero: ");
		 n = leia.nextInt();
		}while(n==0);
	for(int i = 1;i<=n;i++){
		System.out.println(i);
		}
}

}
