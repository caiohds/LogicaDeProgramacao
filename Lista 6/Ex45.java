import java.util.Scanner;
class Ex45{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
 
int num,fat = 1;
System.out.println("Escreva um numero: ");
	num = leia.nextInt();
for(int i = num;i>=1;i--){
	fat = 1;
	
for(int i2 = 1;i2<=i;i2++){
	fat*=i2;
	if(i2<i){
	
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
