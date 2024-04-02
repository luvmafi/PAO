import Interfaces.CalculChirie;
public abstract class Magazin {
    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private double venit;
    private double suprafata;
    private double chirie;

    public Magazin(int id, String numeMagazin, Proprietar proprietar, double venit, double suprafata) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
    }

    public abstract void calculeazaChirie(CalculChirie callback);
    protected void setChirie(double chirie) {
        this.chirie = chirie;
    }

    public int getId() {
        return id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public double getVenit() {
        return venit;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public double getChirie() {
        return chirie;
    }
}
