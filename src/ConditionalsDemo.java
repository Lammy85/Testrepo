import javax.swing.*;

public class ConditionalsDemo {
    public static void main(String[] args) {
        //if-else-Beispiel
        System.out.println("if-else Beispiel");
        int i = 3;
        if (i == 5 || i == 6) {
            System.out.println("Nicht bestanden!");
        } else if (i == 2) {
            System.out.println("Gut bestanden!");
        } else if (i == 1) {
            System.out.println("Sehr gut bestanden!");
        } else if (i == 3 || i == 4) {
            System.out.println("Bestanden!");
        } else {
            System.out.println("Note " + i + " ist unbekannt!");
        }
        //switch-Beispiel
        int day = 2;
        System.out.println("\n-------------------\nSwitch-Beispiel");
        switch (day) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ungültig");
        }
    }
}
