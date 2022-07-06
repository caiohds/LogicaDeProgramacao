import java.util.Scanner;
import java.util.ArrayList;
public class Ex27{
public static void main (String[] args) {
	Scanner leia = new Scanner(System.in);
int AH[] = new int[10];
int i;


for(i = 0;i<10;i++){
	do{
	System.out.println("Digite um valor maior ou igual a 25: ");
	AH[i]=leia.nextInt();
	}while(AH[i]<25);
	}

int AI[] = new int[2];
AI[1] = 26;
AI[0] = 25;
int c = 0;
for(int x = 0;x<10;x++){
	
	
		if(AH[x] == AI[0]){
		if(AH[x+1] == AI[1]){
			
		System.out.println("O vetor AI comeca na posicao  "+ (x+1) + " do vetor AH");
		break;
		}
			}
						
	}
	
	
}
}

