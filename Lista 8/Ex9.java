import java.util.ArrayList;
import java.util.Scanner;
class Ex9{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);

int f[] = new int[5];
int h[] = new int[5];
int i2 = 0;
for(int i = 0;i<5;i++){
	System.out.println("Digite o "+ (i+1) + " elemento : ");
	f[i] = leia.nextInt();
	if(f[i]%2 == 0){
	h[i2] = f[i];
	i2++;
}

	}
	System.out.println();
	if(i2 == 0){
		System.out.println("Nao existe numero par na sequencia digitada");
		}else{
	for(int i = 0;i<i2;i++)
	System.out.println(h[i]);
}
}

}

