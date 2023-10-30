package ud5.Calculadora;

public class CalculadoraTest {
 public static void main(String[] args) {


        Calculadora calc = new Calculadora();

        double valor = calc.getResultado();
        calc.setResultado(1000000);

        calc.sumar(5);
        calc.sumar(7);
        calc.imprimir();

        Calculadora calc2 = new Calculadora(1000);
        calc2.sumar(5);
        calc2.sumar(7);
        calc2.imprimir();
    }
}