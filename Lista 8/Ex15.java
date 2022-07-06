import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
class Ex15{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);



int n;
int m;
int i2 = 0;
int i3 = 0;
do{
System.out.println("Digite o tamanho do primeiro vetor: ");
n = leia.nextInt();
}while(n<0 && n>10);
int S[] = new int[n];
for(int i = 0; i <n;i++){
	int cont = (int)(Math.random() *10)+1;
	S[i] = cont;
	System.out.print(S[i]+ " ");
	}
	System.out.println();
	System.out.println();
do{
System.out.println("Digite o tamanho do segundo vetor: ");
m = leia.nextInt();
}while(m<0 && m>15);
int T[] = new int[m];
for(int i = 0; i <m;i++){
	int cont = (int)(Math.random() *10)+1;
	T[i] = cont;
	System.out.print(T[i]+ " ");
	}
	System.out.println();
	System.out.println();
int u[] = new int[m+n];
	for(int i = 1;i<=m+n;i++){
	if(i%2==0 && i2<=n){
		
		
		
		u[i-1] = S[i2];
		i2++;
	
	
	}else if( i3<=m){
		u[i-1] = T[i3];
		i3++;
	
		}
		System.out.println(u[i-1]);	
	}
}
}
