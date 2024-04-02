import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ShoppingMall mall = new ShoppingMall();

        Proprietar proprietar1 = new Proprietar("Popescu", "Ion", 45);
        Proprietar proprietar2 = new Proprietar("Ionescu", "Vasile", 50);

        Magazin magazinAlimentar = new MagazinAlimentar(1, "Alimentara 1", proprietar1, 10000, 100);
        magazinAlimentar.calculeazaChirie(suprafata -> suprafata * 2);

        Magazin magazinHaine = new MagazinHaine(2, "Haine de Vis", proprietar1, 20000, 150);
        magazinHaine.calculeazaChirie(suprafata -> suprafata * 3);

        Magazin magazinChimicale = new MagazinChimicale(3, "Chimicale Plus", proprietar2, 15000, 120);
        magazinChimicale.calculeazaChirie(suprafata -> suprafata * 4);

        mall.adaugaMagazin(magazinAlimentar);
        mall.adaugaMagazin(magazinHaine);
        mall.adaugaMagazin(magazinChimicale);

        mall.getMagazine().sort(Comparator.comparing((Magazin m) -> m.getProprietar().getNume())
                .thenComparing(m -> m.getProprietar().getPrenume())
                .thenComparingDouble(Magazin::getChirie));
        mall.getMagazine().forEach(m -> System.out.println(m.getNumeMagazin() + " - Chirie: " + m.getChirie()));

        System.out.println("Venit proprietar1: " + mall.venitTotalProprietar(proprietar1));

        System.out.println("Chirie proprietar1: " + mall.chirieTotalaProprietar(proprietar1));
    }
}
