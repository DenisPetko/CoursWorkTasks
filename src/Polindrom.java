public class Polindrom {
    public static boolean isPolindrom(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
