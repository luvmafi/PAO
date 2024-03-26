//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        // cerinta1
        System.out.println("lungimea este: " + text.length());

        // cerinta2
        boolean onlyLetters = text.matches("[a-zA-Z\\s\\.]+");
        System.out.println("are doar litere mari si mici?  " + onlyLetters);

        // cerinta3
        String[] words = text.split("\\s+");
        if (words.length % 2 == 0) {
            // daca lungimea sirului este para
            System.out.println("cuvintele situate la mijloc sunt:  " + words[words.length / 2 - 1] + " " + words[words.length / 2]);
        } else { // daca lungimea sirului este impara
            System.out.println("cuvantul situat la mijloc este: " + words[words.length / 2]);
        }

        // cerinta4
        StringBuilder reverseText = new StringBuilder(text);
        reverseText.reverse();
        System.out.println("sirul invers este: " + reverseText.toString());
    }
}