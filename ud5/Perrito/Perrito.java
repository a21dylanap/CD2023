package CD2023.ud5;

/**
 * Perrito
 */
public class Perrito {

    // Atributos

    String nome;
    String raza;
    String color;
    boolean chip;
    int numeroChip;

    // Métodos

    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void durmir() {
        System.out.println("Marcho durmir");
    }

    public void pedirDeComer() {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            System.out.println("Guau Guau");
            i = i + 1;
        }
    }
}