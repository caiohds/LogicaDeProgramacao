import java.util.ArrayList;
import java.util.Scanner;
class Ex8{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);

int f[] = new int[5];
int soma = 0;
for(int i = 0;i<5;i++){
	System.out.println("Digite o "+ (i+1) + " elemento : ");
	f[i] = leia.nextInt();
	if(f[i]%2 == 1){
	soma+=f[i];
}
	}
	if(soma == 0){
		System.out.println("Nao existe numero impar na sequencia digitada");
		}else{
	
	System.out.println("Soma: " + soma);
}

}
}
