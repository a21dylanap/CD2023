package CD2023.ud5;

public class App {

    private Menu menu;
    private Calculadora calculadora;

    public App(){
        menu = new Menu();
        calculadora = new Calculadora();
    }

    public void start(){
        double numero = 0.0;

        while (true) {
            int seleccion = menu.getSeleccionValida();

            switch (seleccion) {
                case 0:
                    calculadora.reset();
                    break;

                case 1:
                    numero = menu.getNumeroValido();
                    calculadora.sumar(numero);
                    break;

                case 2:
                    numero = menu.getNumeroValido();
                    calculadora.restar(numero);
                    break;

                case 3:
                    numero = menu.getNumeroValido();
                    calculadora.multiplicar(numero);
                    break;
                
                case 4:
                    numero = menu.getNumeroValido();
                    calculadora.dividir(numero);
                    break;
                default:
                    break;
            }

            calculadora.imprimir();
        }
    }
}
