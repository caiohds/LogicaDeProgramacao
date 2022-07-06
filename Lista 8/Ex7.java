import java.util.ArrayList;
import java.util.Scanner;
class Ex7{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);

int a[] = {1,10,3,30,5,50,7,10,9,100,11,120,13,142,15,16,17,18,19,20};

int maior = 0;
int menor = 10000;
for(int i = 0;i<20;i++){
	if(a[i] > maior){
		maior = a[i];
		}
	if(a[i] < menor){
		menor = a[i];
		}
	}
	System.out.println("Maior: " + maior);
	System.out.println("Menor: " + menor);
	

}
}
