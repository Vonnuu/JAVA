public class YL21 {
 
    public static void main(String[] args) {
 
        minut_tund(519);
 
    }
    public static void minut_tund(double minute) {
        int tunnid = 0;
        for (int i = 0; i < minute / 60; i++) {
            tunnid = i;
        }
        double tund = minute / 60;
        //double minutes = minute % 60;
        System.out.println("Minutid tundideks: " + tunnid +"."+ minute);
    }
}