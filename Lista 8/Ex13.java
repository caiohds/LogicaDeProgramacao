import java.util.ArrayList;
import java.util.Scanner;
class Ex13{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int p[] = new int[10];
int q[] = new int[15];
String r[] = new String[25];
for(int i =0;i<10;i++){
	System.out.println("Digite um numero: ");
	int n = leia.nextInt();
	p[i] = n;
	
	}
	System.out.println();
for(int i =0;i<15;i++){
	System.out.println("Digite um numero: ");
	int m = leia.nextInt();
	q[i] = m;
	
	}
	System.out.println();
for(int i = 0;i<10;i++){
	r[i] =( p[i]+""+  q[i]);
	
	}
for(int i = 10;i<15;i++){
	r[i] = ("" +q[i]);
	System.out.println(r[i]);
	}
	
}
}
