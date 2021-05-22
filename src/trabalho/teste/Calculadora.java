package trabalho.teste;

public class Calculadora {

    public double soma (double num1, double num2){ return num1 + num2; }

    public double subtrai (double num1, double num2){
        return num1 - num2;
    }

    public double divide (double num1, double num2){
        if(num2 == 0){
            return -1;
        }
        return num1 / num2;
    }

    public double multiplica (double num1, double num2){ return num1 * num2; }
}
