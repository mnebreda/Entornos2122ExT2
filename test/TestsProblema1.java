import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema1 {
    @Test
    public void crea_clase(){
        Problema1 problema = new Problema1();
        Assertions.assertNotNull(problema);
    }

    @Test
    public void test_multiplo_de_tres(){
        Problema1 problema = new Problema1();
        String expected = "Fizz";
        String actual = problema.FizzBuzz(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_5(){
        Problema1 problema = new Problema1();
        String expected = "Buzz";
        String actual = problema.FizzBuzz(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_no_multiplo(){
        Problema1 problema = new Problema1();
        String expected = "2";
        String actual = problema.FizzBuzz(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_3_y_5(){
        Problema1 problema = new Problema1();
        String expected = "FizzBuzz";
        String actual = problema.FizzBuzz(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_convierte_del_1_al_20(){
        Problema1 problema1 = new Problema1();
        String expected = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";
        String actual = problema1.convierteRango();
        Assertions.assertEquals(expected, actual);
    }
}