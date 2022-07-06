import java.util.ArrayList;
import java.util.Scanner;
class Ex5{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int a1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int a2[] =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int a3[] = new int[15];

for(int i = 0;i<15;i++){
	a3[i] = a2[i] + a1[i];
	System.out.println(a3[i]);
	}

	
	
	

}
}
