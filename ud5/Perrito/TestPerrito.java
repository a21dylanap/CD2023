package ud5.Perrito;

public class TestPerrito {
    
 public static void main(String[] args) {
        
    //Creo el objeto toby
    Perrito toby = new Perrito();
    
    toby.nombre = "Toby";
    toby.raza = "Pastor Alemán";
    toby.color = "Marrón";
    toby.chip = true;
    toby.num_chip =  "21232425";

    toby.ladrar();
    toby.dormir();
    toby.hambre();

        
    //Creo el objeto max
    Perrito max = new Perrito();

    max.nombre = "Max";
    max.raza = "Rottweiler";
    max.color = "Negro";
    max.chip = true;
    max.num_chip =  "21232426";

    max.ladrar();
    max.dormir();
    max.hambre();

        
    //Creo el objeto rex
    Perrito rex = new Perrito();

    rex.nombre = "Rex";
    rex.raza = "Pastor Aleman";
    rex.color = "Marrón";
    rex.chip = true;
    rex.num_chip =  "21232427";

    rex.ladrar();
    rex.dormir();
    rex.hambre();



    }
}
