import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qdtnota = 0;
        double nota, notaTotal = 0;
        
        while(qdtnota < 3){
            System.out.println("Digite a nota do aluno:");
            nota = s.nextDouble();
            if (nota <= 10 && nota >= 0) {
                notaTotal = nota + notaTotal;
                qdtnota++;
            } else {
               while(nota < 0 || nota > 10){
                   System.out.println("Digite uma nota valida:");
                   nota = s.nextDouble();
                   notaTotal = nota + notaTotal;
                   qdtnota++;
               }
            }
        }
        s.close();
        System.out.println(notaTotal / qdtnota);
    }
}
