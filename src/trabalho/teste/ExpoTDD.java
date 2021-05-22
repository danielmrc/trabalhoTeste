package trabalho.teste;

public class ExpoTDD {


    public double exp (double base, double expoente){
        if(expoente == 0){
            return 1;
        }

        double resultado = 1;

        for(int i = 0; i < expoente; i++){
            resultado = resultado * base;
        }

        return  resultado;
    }

}
