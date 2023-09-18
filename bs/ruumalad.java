public class ruumalad {
    public static double roopkylk(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        flaot pohjapindala = Float.parseFloat();
        double s = alus * korgus / 2;
        return s;
    }

    public static double risttah(String a, String h, String c) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        float laius = Float.parseFloat(c);
        double s = alus * korgus * laius;
        return s;
    }

    public static double pyrmid(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus;
        return s;
    }

}
