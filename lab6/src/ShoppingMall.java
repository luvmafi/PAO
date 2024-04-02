import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingMall {
    private List<Magazin> magazine;

    public ShoppingMall() {
        this.magazine = new ArrayList<>();
    }

    public void adaugaMagazin(Magazin magazin) {
        magazine.add(magazin);
    }

    public List<Magazin> getMagazine() {
        return magazine;
    }

    public List<Magazin> getMagazineDupaProprietar(Proprietar proprietar) {
        return magazine.stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .collect(Collectors.toList());
    }

    public double venitTotalProprietar(Proprietar proprietar) {
        return getMagazineDupaProprietar(proprietar).stream()
                .mapToDouble(Magazin::getVenit)
                .sum();
    }

    public double chirieTotalaProprietar(Proprietar proprietar) {
        return getMagazineDupaProprietar(proprietar).stream()
                .mapToDouble(Magazin::getChirie)
                .sum();
    }
}
