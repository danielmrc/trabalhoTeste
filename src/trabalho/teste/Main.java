package trabalho.teste;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        ExpoTDD ex = new ExpoTDD();

        int op = 0;
        double num1, num2, resultado = 0;
        int continua;

        do{
            System.out.println("Informe o número correspondente a operação que deseja fazer!\n" +
                    "1 - Soma\n" +
                    "2 - Subtrai\n" +
                    "3 - Divisão\n" +
                    "4 - Multiplicação\n" +
                    "5 - Exponenciação");
            op = ler.nextInt();

            System.out.println("Informe o primeiro valor: ");
            num1 = ler.nextDouble();
            System.out.println("Informe o segundo valor: ");
            num2 = ler.nextDouble();

            switch (op){
                case 1: resultado = calc.soma(num1, num2);
                break;
                case 2: resultado = calc.subtrai(num1,num2);
                break;
                case 3: resultado = calc.divide(num1, num2);
                    if(resultado == -1){
                        System.out.println("Não existe divisão por zero!!");
                     }
                break;
                case 4: resultado = calc.multiplica(num1, num2);
                break;
                case 5: resultado = ex.exp(num1, num2);
                break;
                default: System.out.println("Opção inválida!!");
                break;
            }

            if(resultado != -1 || op != 3) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("Deseja fazer outra operação?\n" +
                    "1 - Sim\n" +
                    "2 - Não");
            continua = ler.nextInt();

            op = continua == 2 ? 6 : 0;

        }while(op !=6);

    }
}
