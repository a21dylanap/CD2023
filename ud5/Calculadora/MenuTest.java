package ud5.Calculadora;

public class MenuTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.getSeleccionValida();
        System.out.println("Opción: " + menu.getSeleccion());
    }
}
