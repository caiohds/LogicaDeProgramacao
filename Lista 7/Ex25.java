import java.util.Scanner;
class Ex25{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
	
	
	
	
	
	int aprovar = 0;
	do{
	System.out.print("Digite uma senha: ");
	String senha = leia.nextLine();
	int tamanho = senha.length();
	int letra = 0;
	int especial = 0;
	int numero = 0;
	
	for(int i = 0; i<tamanho;i++){
		for(int i2 =97;i2<=122;i2++){
			if(senha.charAt(i) == i2){
				letra++;
				}
			}
		for(int i2 =65;i2<=90;i2++){
			if(senha.charAt(i) == i2){
				letra++;
				}
			}
			for(int i2 =48;i2<=57;i2++){
			if(senha.charAt(i) == i2){
				numero++;
				}
			}
		if(senha.charAt(i) == 40 || senha.charAt(i) == 33 || senha.charAt(i) == 41 || senha.charAt(i) == 35 || senha.charAt(i) == 36 || senha.charAt(i) == 37 || senha.charAt(i) == 38 || senha.charAt(i) == 43 || senha.charAt(i) == 64 || senha.charAt(i) == 42){
			especial++;
			}        	 
		}
		if(tamanho>= 10){
			aprovar++;
			System.out.println("Tamanho : " + tamanho + "(ok)");
			}else{
				System.out.println("Tamanho : " + tamanho + "(X)");
				}
		if(letra>= 3){
			aprovar++;
			System.out.println("Letras : " + letra + "(ok)");
			}else{
				System.out.println("Letras : " + letra + "(X)");
				}
		if(numero>= 3){
			aprovar++;
			System.out.println("Numeros : " + numero + "(ok)");
		}else{
			System.out.println("Numero : " + numero + "(X)");
			}
		if(especial>= 2){
			aprovar++;
			System.out.println("Caracter especial : " + especial + "(ok)");
			}else{
				System.out.println("Especial : " + especial + "(X)");
				}
	if(aprovar<4){
		System.out.println("Senha reprovada!Tente novamente");
		
		}
	}while(aprovar<4);
	System.out.println("Senha Aprovada!");
		
}
}
