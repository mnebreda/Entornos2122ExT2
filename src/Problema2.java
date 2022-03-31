public class Problema2{
    public String FizzBuzz(Integer i){
        String resultado = "";

        if (i % 3 == 0){resultado += "Fizz";}
        if (i % 5 == 0){resultado += "Buzz";}

        if (resultado == "")
            resultado += i.toString();
        return resultado;
    }

    public String convierteRango(int desde, int hasta){
        String resultado = "";
        for (int i = desde; i <= hasta; i++){
            resultado += FizzBuzz(i);
        }
        return resultado;
    }
}