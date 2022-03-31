import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema2 {
    @Test
    public void crea_clase(){
        Problema2 problema = new Problema2();
        Assertions.assertNotNull(problema);
    }

    @Test
    public void test_multiplo_de_tres(){
        Problema2 problema = new Problema2();
        String expected = "Fizz";
        String actual = problema.FizzBuzz(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_5(){
        Problema2 problema = new Problema2();
        String expected = "Buzz";
        String actual = problema.FizzBuzz(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_no_multiplo(){
        Problema2 problema = new Problema2();
        String expected = "2";
        String actual = problema.FizzBuzz(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_3_y_5(){
        Problema2 problema = new Problema2();
        String expected = "FizzBuzz";
        String actual = problema.FizzBuzz(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_convierte_del_1_al_20(){
        Problema2 problema = new Problema2();
        String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";
        String actual = problema.convierteRango(1,20);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_convierte_del_30_al_35(){
        Problema2 problema = new Problema2();
        String expected = "FizzBuzz3132Fizz34Buzz";
        String actual = problema.convierteRango(30, 35);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_convierte_del_67_al_74(){
        Problema2 problema = new Problema2();
        String expected = "6768FizzBuzz71Fizz7374";
        String actual = problema.convierteRango(67, 74);
        Assertions.assertEquals(expected, actual);
    }
}