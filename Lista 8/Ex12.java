import java.util.ArrayList;
import java.util.Scanner;
class Ex12{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);

int p[] = new int[10];
int q[] = new int[15];
int r[] = new int[25];
int i2 = 0;
for(int i = 0;i<10;i++){
	System.out.println("Digite o "+ (i+1) + " elemento : ");
	p[i] = leia.nextInt();	
	r[i] = p[i];
	i2++;
}
for(int i = 0;i<10;i++){
	System.out.println(p[i]);
}
	System.out.println();
for(int i = 0;i<15;i++){
	System.out.println("Digite o "+ (i+1) + " elemento : ");
	q[i] = leia.nextInt();
	r[i2] = q[i];
	i2++;
}
for(int i = 0;i<15;i++){
	System.out.println(q[i]);
}
System.out.println();
for(int i = 0;i<25;i++){
	
	
	
	
	System.out.println(r[i]);
	
}
}
}
