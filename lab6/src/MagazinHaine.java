import Interfaces.CalculChirie;
public class MagazinHaine extends Magazin {
    public MagazinHaine(int id, String numeMagazin, Proprietar proprietar, double venit, double suprafata) {
        super(id, numeMagazin, proprietar, venit, suprafata);
    }

    @Override
    public void calculeazaChirie(CalculChirie callback) {
        setChirie(callback.calculeaza(this.getSuprafata()));
    }
}
