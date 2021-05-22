package trabalho.teste;

public class ExpoTDD {


    public double exp (double base, double expoente){
        double resultado = 0;

        for(int i = 0; i < expoente; i++){
            resultado = resultado * base;
        }

        return  resultado;
    }

}
