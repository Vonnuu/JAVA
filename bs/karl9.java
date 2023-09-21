//Karl Robert Masing

import java.util.Date;

// Klass tsiklite haldamiseks
class tsikkel {
    private String brand;

    public tsikkel(String brand) {
        this.brand = brand;

    }
    
    public String getBrand() {
        return brand;
    }

}
// Klass sõitjate haldamiseks
class soitja {
    private String name;
    
    public soitja(String name) {
        this.name = name;

    }
    
    public String getName() {
        return name;
    }

}

// Klass treeningradade haldamiseks
class rada {
    private String name;
    
    public rada(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

}

// Klass treeningute haldamiseks, mis ühendab tsiklid, sõitjad ja treeningradad
class Training {
    private tsikkel motorcycle;
    private soitja rider;
    private rada track;
    private Date date;

    public Training(tsikkel motorcycle, soitja rider, rada track, Date date) {
        this.motorcycle = motorcycle;
        this.rider = rider;
        this.track = track;
        this.date = date;
    }

    public tsikkel getMotorcycle() {
        return motorcycle;
    }

    public soitja getRider() {
        return rider;
    }

    public rada getTrack() {
        return track;
    }

    public Date getDate() {
        return date;
    }
}

public class karl9 {
    public static void main(String[] args) {
        // Loome näidisobjektid
        tsikkel bike1 = new tsikkel("Honda");
        soitja rider1 = new soitja("John Doe");
        rada track1 = new rada("Track A");
        Date date1 = new Date();
        
        tsikkel bike2 = new tsikkel("Kawasaki");
        soitja rider2 = new soitja("Jane Smith");
        rada track2 = new rada("Track B");
        Date date2 = new Date();
        
        // Loome treeningud
        Training training1 = new Training(bike1, rider1, track1, date1);
        Training training2 = new Training(bike2, rider2, track2, date2);
        
        // Näitame treeningute andmeid
        System.out.println("Treening 1:");
        System.out.println("Sõitja: " + training1.getRider().getName());
        System.out.println("Tsikkel: " + training1.getMotorcycle());
        System.out.println("Treeningrada: " + training1.getTrack().getName() + " (" + training1.getTrack() + ")");
        System.out.println("Treeningu kuupäev: " + training1.getDate());

        System.out.println("\nTreening 2:");
        System.out.println("Sõitja: " + training2.getRider().getName());
        System.out.println("Tsikkel: " + training2.getMotorcycle().getBrand() + " " + training2.getMotorcycle());
        System.out.println("Treeningrada: " + training2.getTrack().getName() + " (" + training2.getTrack() + ")");
        System.out.println("Treeningu kuupäev: " + training2.getDate());
    }
}
