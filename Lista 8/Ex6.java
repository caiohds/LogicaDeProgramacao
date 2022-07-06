import java.util.ArrayList;
import java.util.Scanner;
class Ex6{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int a1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int a2[] = {1,10,3,30,5,50,7,10,9,100,11,120,13,142,15};
int a3[] = new int[15];
int a = 0;
for(int i = 0;i<15;i++){
	if(a1[i] == a2[i]){
		a3[a] = i;
		a++;
		}
	}
for(int i = 0;i<a;i++){
System.out.println("Sao iguais na posicao: "+(a3[i]+1));
}	
	
	

}
}
