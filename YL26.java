import java.util.Scanner;

class RoomCarpet {
    private double length;
    private double width;
    private double carpetCost;

    // Konstruktor
    public RoomCarpet(double length, double width, double carpetCost) {
        this.length = length;
        this.width = width;
        this.carpetCost = carpetCost;
    }

    // Meetod ruumi suuruse saamiseks
    public double getRoomSize() {
        return length * width;
    }

    // Meetod vaiba maksumuse saamiseks
    public double getCarpetCost() {
        return getRoomSize() * carpetCost;
    }
}

public class CarpetCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Küsi ruumi mõõtmeid
        System.out.print("Sisesta ruumi pikkus (meetrites): ");
        double length = scanner.nextDouble();

        System.out.print("Sisesta ruumi laius (meetrites): ");
        double width = scanner.nextDouble();

        // Küsi vaiba meetrihind
        System.out.print("Sisesta vaiba meetrihind (eurodes): ");
        double carpetCost = scanner.nextDouble();

        // Loo RoomCarpet objekt
        RoomCarpet roomCarpet = new RoomCarpet(length, width, carpetCost);

        // Arvuta ja kuvada vaiba hinna
        System.out.println("Ruumi suurus: " + roomCarpet.getRoomSize() + " ruutmeetrit");
        System.out.println("Vaiba maksumus: " + roomCarpet.getCarpetCost() + " eurot");

        scanner.close();
    }
}

