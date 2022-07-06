import java.util.Scanner;
class Ex11{
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int na;
int media = 0;
int nta;
System.out.println("Escreva a quantidade de alunos na turma: ");
na = leia.nextInt();

for(int i = 1; i<=na;i++){
System.out.println("Escreva a nota do aluno: ");
nta = leia.nextInt();
media +=nta;
}
System.out.println("Media dos alunos: " + media/na);

}
}
