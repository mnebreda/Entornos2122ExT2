import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema4 {
    @Test
    public void crea_clase(){
        Problema4 problema = new Problema4();
        Assertions.assertNotNull(problema);
    }

    @Test
    public void test_multiplo_de_tres(){
        Problema4 problema = new Problema4();
        String expected = "Fizz";
        String actual = problema.FizzBuzz(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_5(){
        Problema4 problema = new Problema4();
        String expected = "Buzz";
        String actual = problema.FizzBuzz(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_no_multiplo(){
        Problema4 problema = new Problema4();
        String expected = "2";
        String actual = problema.FizzBuzz(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_3_y_5(){
        Problema4 problema = new Problema4();
        String expected = "FizzBuzz";
        String actual = problema.FizzBuzz(15);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_convierte_del_1_al_20(){
        Problema4 problema = new Problema4();
        String expected = "12Fizz4BuzzFizzFoo8FizzBuzzBooFizz13FooFizzBuzz1617Fizz19Buzz";
        String actual = problema.convierteRango(1,20);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_convierte_del_30_al_35(){
        Problema4 problema = new Problema4();
        String expected = "FizzBuzz3132FizzBoo34BuzzFoo";
        String actual = problema.convierteRango(30, 35);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test_convierte_del_67_al_74(){
        Problema4 problema = new Problema4();
        String expected = "6768FizzBuzzFoo71Fizz7374";
        String actual = problema.convierteRango(67, 74);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_de_siete(){
        Problema4 problema = new Problema4();
        String expected = "Foo";
        String actual = problema.FizzBuzz(7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplo_de_once(){
        Problema4 problema = new Problema4();
        String expected = "Boo";
        String actual = problema.FizzBuzz(11);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_multiplos_comunes_7_11(){
        Problema4 problema = new Problema4();
        String expected = "FizzBuzz3132FizzBoo34BuzzFooFizz3738FizzBuzz";
        String actual = problema.convierteRango(30, 40);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_convierte_20_a_25(){
        Problema4 problema = new Problema4();
        String expected = "BuzzFizzFooBoo23FizzBuzz";
        String actual = problema.convierteRango(20, 25);
        Assertions.assertEquals(expected, actual);
    }
}