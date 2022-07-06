import java.util.Scanner;
class Ex43{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 
int num,fat = 1;

for(int i = 1;i<=7;i++){
	fat = 1;
	System.out.println("Escreva um numero: ");
	num = leia.nextInt();
for(int i2 = 1;i2<=num;i2++){
	fat*=i2;
	if(i2<num){
	
	System.out.print( " "+i2 + " *");
}else{
	System.out.print(" "+ i2 + " = ");
	}
	}
	System.out.print(fat);
	System.out.println();
	
	
	}
}
}
