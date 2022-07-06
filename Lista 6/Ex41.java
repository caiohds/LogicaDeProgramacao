import java.util.Scanner;
class Ex41{
public static void main(String[] args){
 Scanner leia = new Scanner(System.in);
 
int num,fat = 1;
System.out.println("Escreva um numero: ");
num = leia.nextInt();

for(int i = 1;i<=num;i++){
	fat*=i;
	if(i<num){
	
	System.out.print( " "+i + " *");
}else{
	System.out.print(" "+ i + " = ");
	}
	}
	System.out.print(fat);
}			
}
