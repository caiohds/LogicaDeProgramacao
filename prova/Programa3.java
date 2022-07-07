import java.util.Scanner;
public class Programa3{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
	int hr;
	do{
	System.out.println("Que horas sao?");
	 hr = leia.nextInt();
}while(hr>=24 || hr<0);

	if(hr>=0 && hr<=6){
		System.out.println("zZzZzZzZzZ");
	}else if(hr>=7 && hr<=11){
		System.out.println("Bom dia");
	}else if(hr>=12 && hr<=17){
		System.out.println("Boa tarde");
	}else{
		System.out.println("Boa noite");
		}
}
}
