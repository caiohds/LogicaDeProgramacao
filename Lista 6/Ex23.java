import java.util.Scanner;
class Ex23{
public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
	double media= 0;
	double salario;
	double maior = 0;
	int filhos;
	int media_filhos= 0;
	int tot= 0;
	double perc = 0;
	do{
	System.out.println("Escreva o salario: ");
	salario = leia.nextDouble();
	if(salario <0){
		break;
		}
	System.out.println("Escreva a quantidade de filhos: ");
	filhos = leia.nextInt();
	media+=salario;
	media_filhos+=filhos;
	tot++;
	if(maior< salario){
		maior = salario;
		}
	if(salario < 150){
		perc++;
		}
	}while(salario>=0.00);
	System.out.println("media salarial da populacao: " + media/tot);
	System.out.println("media  do numero de filhos: " + media_filhos/tot);
	System.out.println("Maior salario : " + maior);
	System.out.println("Porcentagem de salario menor que R$150.00 : " + (perc/tot) * 100 +"%");
}
}
