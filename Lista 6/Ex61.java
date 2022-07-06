import java.util.Scanner;
class Ex61{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
System.out.println("Digite a quantidade de termos : ");
int qt = leia.nextInt();
int prox = 0;
int soma = 0;
int soma2 = 0;
int proxi = 1;
for(int i = 1;i<=qt;i++){
prox +=2;
	
	
	if(i<qt){
	System.out.print(prox + "/"+proxi + " + ");
}else{
	System.out.print(prox + "/"+proxi + " = " );
	
	}
	soma +=prox;
	soma2 +=proxi;
	proxi +=2;
	
	
	}
	System.out.print(soma+ "/"+soma2);
}
}
