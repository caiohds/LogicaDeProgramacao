import java.util.ArrayList;
import java.util.Scanner;
class Ex10{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);

int PA[] = new int[5];
int PB[] = new int[5];
int PC[] = new int[10];
int i2 = 5;
for(int i = 0;i<5;i++){
	System.out.println("Digite o "+ (i+1) + " elemento : ");
	PA[i] = leia.nextInt();	
	PC[i] = PA[i];
}
	System.out.println();
for(int i = 0;i<5;i++){
	System.out.println("Digite o "+ (i+1) + " elemento : ");
	PB[i] = leia.nextInt();
	PC[i2] = PB[i];
	i2++;
}
System.out.println();
for(int i = 0;i<10;i++){
	
	
	
	
	System.out.println(PC[i]);
	
}
}
}
