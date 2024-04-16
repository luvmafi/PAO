import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nume;
    private String prenume;
    private int varsta;
    private int suma;
    private String valuta;

    public Person(String nume, String prenume, int varsta, int suma, String valuta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.suma = suma;
        this.valuta = valuta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getSuma() {
        return suma;
    }


    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", suma=" + suma +
                ", valuta='" + valuta + '\'' +
                '}';
    }
}
