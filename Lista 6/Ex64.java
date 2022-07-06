import java.util.Scanner;
class Ex64{
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
		if(i%2== 0 ){
	soma -=prox;
	soma2 -=proxi;
	System.out.print(prox + "/"+proxi + " + ");
}else{
	soma +=prox;
	soma2 +=proxi;
	System.out.print(prox + "/"+proxi + " - ");
	}
}
else{
	if(i%2== 0 ){
	soma -=prox;
	soma2 -=proxi;
	System.out.print(prox + "/"+proxi + " = " );
}else{
	soma +=prox;
	soma2 +=proxi;
	System.out.print(prox + "/"+proxi + " = " );
	}
	

	
	}
		proxi +=2;
	
	
	}
	System.out.print(soma+ "/"+soma2);
}
}
