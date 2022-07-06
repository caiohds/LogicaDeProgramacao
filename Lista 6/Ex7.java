import java.util.Scanner;
class Ex7{

public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
	int n = 1;
	boolean cond ;
	do{
	System.out.println("Escreva um valor de 1 a 10");
	n = leia.nextInt();
	if(n>10 || n<1){
		 cond = false;
		}else{
			 cond = true;
			}
	}while(cond != true);
	for(int i = 1; i<=10;i++){
	System.out.println(i*n);
	}
}

}
