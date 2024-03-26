//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String test1 = "a";
        String test2 = "d";
        String test3 = "m";
        String test4 = "M";
        String test5 = "aM";
        String test6 = "abcabc";
        String test7 = "";
        String test8 = "abcab";
        String test9 = "abcabcabc";
        String test10 = "abcabcabca";

        System.out.println("Match [abc]: " + test1.matches("^(?:[abc])+$"));
        System.out.println("Match [^abc]: " + test2.matches("^(?:[^abc])+$"));
        System.out.println("Match [a-z]: " + test3.matches("^[a-z]+$"));
        System.out.println("Match [a-zA-Z]: " + test4.matches("^[a-zA-Z]+$"));
        System.out.println("Match [a-z][A-Z]: " + test5.matches("^[a-z][A-Z]+$"));
        System.out.println("Match [abc]+: " + test6.matches("^[abc]+$"));
        System.out.println("Match [abc]*: " + test7.matches("^[abc]*$"));
        System.out.println("Match [abc]{5}: " + test8.matches("^(?:[abc]{5})$"));
        System.out.println("Match [abc]{5,}: " + test9.matches("^[abc]{5,}$"));
        System.out.println("Match [abc]{5,10}: " + test10.matches("^[abc]{5,10}$"));
    }
}