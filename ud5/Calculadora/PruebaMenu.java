package ud5.Calculadora;

public class PruebaMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.getSeleccionValida();
        System.out.println("Opción: " + menu.getSeleccion());
    }
}