import java.util.Random;
class AprovadoReprovadoRandom{
	
public static void main(String[] args) {
Random rd = new Random();

        int nota = rd.nextInt(11);
       
            System.out.println("Nota do aluno: " + nota);
        if(nota< 6){
			System.out.println("REPROVADO");
		}else{
			System.out.println("APROVADO");
			}
}
}
