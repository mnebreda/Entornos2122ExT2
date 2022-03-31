public class Problema4{
    public String FizzBuzz(Integer i){
        String resultado = "";

        resultado = CambioPalabras(i, resultado);

        if (resultado == "")
            resultado += i.toString();
        return resultado;
    }

    private String CambioPalabras(Integer i, String resultado) {
        resultado = Compruebamultiplo3(i, resultado);
        resultado = Compruebamultiplo5(i, resultado);
        resultado = CompruebaMultiplo7(i, resultado);
        resultado = Compruenamultiplo11(i, resultado);
        return resultado;
    }

    private String Compruenamultiplo11(Integer i, String resultado) {
        if (i % 11 == 0){
            resultado += "Boo";
        }
        return resultado;
    }

    private String CompruebaMultiplo7(Integer i, String resultado) {
        if (i % 7 == 0){
            resultado += "Foo";
        }
        return resultado;
    }

    private String Compruebamultiplo5(Integer i, String resultado) {
        if (i % 5 == 0){
            resultado += "Buzz";
        }
        return resultado;
    }

    private String Compruebamultiplo3(Integer i, String resultado) {
        if (i % 3 == 0){
            resultado += "Fizz";
        }
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