import java.util.Scanner;
class Ex5{
	
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        
        
		System.out.println("Digite seu ano de nascimento: ");
        int nas= leia.nextInt();
        System.out.println("Digite o ano atual: ");
        int at= leia.nextInt();
       int votar = at - nas;
if(votar >= 18){
	System.out.println("VOTO OBRIGATORIO " );
	
	}else if(votar>=16){
	System.out.println("VOTO OPICIONAL " );
	
	}else{
		System.out.println("NAO PODE VOTAR");
		}
			
	
        
}
}
