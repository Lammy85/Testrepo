public class LoopsDemo {
    public static void main(String[] args) {
        //For-Schleife
        System.out.println("For-Schleife Beispiel");
        for(int i = 0;i<=10;i++){
            System.out.println("Durchlauf Nummer: " + i);
        }
        //While-Schleife
        System.out.println("While-Schleife Beispiel");

        int i = 0;

        while(i <= 10){
            System.out.println("Durchlauf Nummer: " + i);
            i++;
        }
        //Do-While-Schleife
        System.out.println("Do-While-Schleife Beispiel");
        int j = 10;
        do{
            System.out.println("Durchlauf Nummer " + j);
            j--;
        }while(j > 0);
    }
}
