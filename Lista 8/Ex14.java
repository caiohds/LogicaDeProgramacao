import java.util.ArrayList;
import java.util.Scanner;
class Ex14{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int s[] = new int[10];
int t[] = new int[15];
int u[] = new int[25];
int i2 = 0;
int i3 = 0;
for(int i =0;i<10;i++){
	System.out.println("Digite um numero: ");
	int n = leia.nextInt();
	s[i] = n;
	
	}
	System.out.println();
for(int i =0;i<15;i++){
	System.out.println("Digite um numero: ");
	int m = leia.nextInt();
	t[i] = m;
	
	}
	System.out.println();

for(int i = 1;i<25;i++){
	if(i%2==0 && i2<=9){
		
		
		
		u[i-1] = s[i2];
	i2++;
	
	
	}else{
		u[i-1] = t[i3];
		i3++;
	
		}
		System.out.println(u[i-1]);	
	}
	
}
}
