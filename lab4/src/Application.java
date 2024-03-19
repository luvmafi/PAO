import Shapes.Cerc;
import Shapes.Patrulater;

public class Application {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(5);
        Patrulater patrulater = new Patrulater(10,11,12,13);

        System.out.println("Perimetrul cercului este: " + cerc.calculPerimetru());
        System.out.println("Perimetrul patrulaterului este: " + patrulater.calculPerimetru());
    }
}