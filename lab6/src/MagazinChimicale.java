import Interfaces.CalculChirie;
public class MagazinChimicale extends Magazin {
    public MagazinChimicale(int id, String numeMagazin, Proprietar proprietar, double venit, double suprafata) {
        super(id, numeMagazin, proprietar, venit, suprafata);
    }

    @Override
    public void calculeazaChirie(CalculChirie callback) {
        setChirie(callback.calculeaza(this.getSuprafata()));
    }
}
