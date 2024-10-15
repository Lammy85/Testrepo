public class Car {

    //Eigenschaften

    String hersteller;
    String modell;
    int baujahr;

    //Konstruktor

    public Car(String hersteller, String modell, int baujahr) {
        this.hersteller = hersteller;
        this.baujahr = baujahr;
        this.modell = modell;
    }

    //Getter und Setter

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }


    //Methoden

    public void fahren() {
        System.out.println(modell + " macht BRUUUUMMM");
    }

    public void infos() {
        System.out.println("Hersteller: " + hersteller + ", Modell: " + modell + ", Baujahr: " + baujahr);
    }
}
