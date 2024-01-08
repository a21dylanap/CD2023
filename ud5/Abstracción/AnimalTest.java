package ud5.Abstracción;



public class AnimalTest {
    
    public static void probarImpresion (Imprimible imp) {
        imp.println();
    }
    
    public static void main(String[] args) {
    
    

    
    //al estar usando en concepto abstracto se escribe así
    Animal gato = new Gato();
    gato.animalSound();
    gato.sleep();
    gato.toString();
    probarImpresion((Gato) gato);

    Animal perro = new Perro();
    perro.animalSound();

    }
}
