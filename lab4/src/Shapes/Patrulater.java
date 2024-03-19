package Shapes;

import Interface.Calcul;

public class Patrulater implements Calcul {
    private double latura;

    public Patrulater(double latura) {
        this.latura = latura;
    }

    @Override
    public double calculPerimetru() {
        return 4 * latura;
    }
}
