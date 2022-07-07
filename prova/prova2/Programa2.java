import java.util.ArrayList;
import java.util.Scanner;
class Programa2{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
char resposta;

int acentos[] = new int[50];
int acento;
int ingressos;
int fileira;
int valor;
int total = 0;
int meia = 0;
String dia_de_meia[] = {"segunda","terca","quinta"};

int cont1 = 0;
int cont2 = 0;
int cont3 = 0;
int cont4 = 0;
int cont5 = 0;

System.out.println("Que dia e hoje?");
	String dia = leia.nextLine();
	dia = dia.toLowerCase();

do{
	
	valor = 0;
	do{
	System.out.println("Quantos ingressos voce deseja comprar?");
	ingressos = leia.nextInt();
}while (ingressos<=0);
for(int i = 0; i<3;i++){
		if(dia_de_meia[i].equals(dia)){
			meia = ingressos;
			}
		}
if(meia != ingressos){
do{
	System.out.println("Quantos ingressos sao meia?");
	meia = leia.nextInt();
	}while (meia<0 || meia>ingressos);
}	
	
	System.out.print("Fileira 1: ");
	for(int i = 0;i<10;i++){
		if(acentos[i] != 1){
		System.out.print((i+1)+ " ");
	}else{
		System.out.print("X" + " ");
		}
		}
		System.out.println();
		System.out.print("Fileira 2: ");
	for(int i = 10;i<20;i++){
		if(acentos[i] != 1){
		System.out.print((i+1)+ " ");
	}else{
		System.out.print("X" + " ");
		}
		}
		System.out.println();
		
		System.out.print("Fileira 3: ");
		for(int i = 20;i<30;i++){
		if(acentos[i] != 1){
		System.out.print((i+1)+ " ");
	}else{
		System.out.print("X" + " ");
		}
		}
		System.out.println();
		System.out.print("Fileira 4: ");
	for(int i = 30;i<40;i++){
		if(acentos[i] != 1){
		System.out.print((i+1)+ " ");
	}else{
		System.out.print("X" + " ");
		}
		}
		System.out.println();
		System.out.print("Fileira 5: ");
		for(int i = 40;i<50;i++){
		if(acentos[i] != 1){
		System.out.print((i+1)+ " ");
	}else{
		System.out.print("X" + " ");
		}
		}
		System.out.println();
			
		for(int i = 0;i<ingressos;i++){
		do{
		System.out.println("Qual fileira voce deseja?");
		fileira = leia.nextInt();
		if(fileira == 1){
		if(cont1 == 10){
			System.out.println("Todos os lugares desta fileira estao ocupados");
			fileira = 6;
			}
			
			}
		if(fileira == 2){
		if(cont2 == 10){
			System.out.println("Todos os lugares desta fileira estao ocupados");
			fileira = 6;
			}
			
			}
		if(fileira == 3){
		if(cont3 == 10){
			System.out.println("Todos os lugares desta fileira estao ocupados");
			fileira = 6;
			}
			
			}
		if(fileira == 4){
		if(cont4 == 10){
			System.out.println("Todos os lugares desta fileira estao ocupados");
			fileira = 6;
			}
			
			}
		if(fileira == 5){
		if(cont5 == 10){
			System.out.println("Todos os lugares desta fileira estao ocupados");
			fileira = 6;
			}
			
			}
		
	}while(fileira<=0 || fileira>5);
		switch(fileira){
			case 1:
			
			System.out.println("Qual acento voce deseja?");
			acento = leia.nextInt()-1;
			if(acento>=10){
				System.out.println("Acento invalido!");
				i--;
				}else{
			if(acentos[acento] == 1){
			System.out.println("Acento vago!");
			i-=1;
			
			}else{ 
		acentos[acento] = 1;
		cont1++;
				 }				
			 }
			  break;
			 case 2:
			System.out.println("Qual acento voce deseja?");
			acento = leia.nextInt()-1;
			if(acento<10 || acento >=20){
				System.out.println("Acento invalido!");
				i--;
				}else{
			if(acentos[acento] == 1){
			System.out.println("Acento vago!");
			i-=1;
			}else{ 
		acentos[acento] = 1;
		cont2++;
				 } 
			 }
			 break;
			 case 3:
			System.out.println("Qual acento voce deseja?");
			acento = leia.nextInt()-1;
			if(acento<20 || acento >=30){
				System.out.println("Acento invalido!");
				i--;
				}else{
			if(acentos[acento] == 1){
			System.out.println("Acento vago!");
			i-=1;
			}else{ 
		acentos[acento] = 1;
		cont3++;
				 }
			 }
			 break;
			 case 4:
			System.out.println("Qual acento voce deseja?");
			acento = leia.nextInt()-1;
			if(acento<30 || acento >=40){
				System.out.println("Acento invalido!");
				i--;
				}else{
			if(acentos[acento] == 1){
			System.out.println("Acento vago!");
			i-=1;
			}else{ 
		acentos[acento] = 1;
		cont4++;
				 }
			 }
			  break;
			 case 5:
			System.out.println("Qual acento voce deseja?");
			acento = leia.nextInt()-1;
			if(acento<40 || acento >=50){
				System.out.println("Acento invalido!");
				i--;
				}else{
			if(acentos[acento] == 1){
			System.out.println("Acento vago!");
			i-=1;
			}else{ 
		acentos[acento] = 1;
		cont5++;
				 }
			 }
			  break;		 
		}
			}
		
			
		valor = (meia * 10) + (ingressos-meia) *20;
		total += valor;
		System.out.println("Valor final: "+ valor);
		
	System.out.println("Deseja finalizar?(Digite 's' se deseja finalizar)");
	resposta = leia.next().charAt(0);	
}while(resposta != 's');
System.out.println("Valor total arrecadado com  a sessao : " + total);
}
}
