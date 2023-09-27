public class karl2 {
    public static void main(String args[]) {
        tollid(89);
        ellips(5,4);
        tund(395);
        double[] list = sport(23, 67, 52, 78);
        sportlastevahe(list[0],list[1]);
    }
    public static void tollid(double toll) {
        double meetrid= toll * 0.0254;
        System.out.println("Tollid meetrites: " + meetrid);
    }
    public static void ellips(double a, double b) {
        double pindala= Math.PI * a * b;
        pindala = Math.round(pindala*100)/100;
        System.out.println("Ellipsi pindala on : " + pindala);
    }
    public static void tund(double minute) {
        double tund= minute / 60;
        double minut= minute % 60;
        System.out.println("tunnid: " + tund + " ja minutid: " + minut + "");
    }
    public static double[] sport(int km, int v, int km1, int v2) {  
        double sport= km / v;
        double sport1= km1 / v2;
        System.out.println("Sportlane 1 jookseb: "+sport+"km/h");
        System.out.println("Sportlane 2 jookseb: "+sport1+"km/h");
        double[] midagi= {sport, sport1};
        return midagi;
    }
    public static void sportlastevahe(double sport2, double sport3) {
        double vahe = sport2%sport3;
        System.out.println("sportlaste vahe on: "+vahe+"km/h");
    }
}
