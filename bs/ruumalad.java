public class ruumalad {
    public static double roopkylk(String u, String h) {
        float ppindala = Float.parseFloat(u);
        float korgus = Float.parseFloat(h);
        double s = ppindala * korgus;
        return s;
    }

    public static double risttah(String a, String h, String c) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        float laius = Float.parseFloat(c);
        double s = alus * korgus * laius;
        return s;
    }

    public static double kuup(String a) {
        float alus = Float.parseFloat(a);
        double s = alus * alus * alus;
        return s;
    }

}
