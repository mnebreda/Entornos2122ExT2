public class Problema1{
    public String FizzBuzz(Integer i){
        String resultado = "";

        if (i % 3 == 0){resultado += "Fizz";}
        if (i % 5 == 0){resultado += "Buzz";}

        if (resultado == "")
            resultado += i.toString();
        return resultado;
    }

    public String convierteRango(){
        String resultado = "";
        for (int i = 1; i <= 20; i++){
            resultado += FizzBuzz(i);
        }
        return resultado;
    }
}