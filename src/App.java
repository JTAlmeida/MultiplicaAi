import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int number = num.nextInt();

        System.out.println("Tabela de multiplicação de " + number);
        for(int i = 0; i <= 10; i++){
            System.out.println(number + "*" + i + "=" + number*i);
        }
        
    }
}
