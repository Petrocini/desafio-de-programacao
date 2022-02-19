import java.util.Scanner;


public class Questao1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int n;
        StringBuilder esc = new StringBuilder();
        
        System.out.printf("Informe o número para criação da escada:\n");
        n = s.nextInt();
        
        if (n != 0 ){
            for (int i = 0; i < n; i++) {
                esc.append("*");
                System.out.println(esc.toString());
            }    
        } else {
            System.out.printf("O número informado não pode ser 0 ou nulo.");
        }
    }
}