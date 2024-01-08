package ud5.Abstracción;

public class Gato extends Animal implements Imprimible{

    @Override
    public void animalSound() {
        System.out.println("miauuuuuuu");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("rrrrrrrrrr");
    }

    @Override
    public String toString() {
        
        return "Soy un gato";
    }

    @Override
    public void println() {
        System.out.println("Imprimindo gatooooo...");
    }
    
    

}
