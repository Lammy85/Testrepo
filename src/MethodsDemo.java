public class MethodsDemo {

    public static void printGreeting(){
        System.out.println("Hallo, ich bin die printGreeting-Methode");
    }

    public static int addNumbers(int a, int b){
        System.out.println("Hallo, ich bin die addNumbers-Methode für die Zahlen " + a + " und " + b);
        return a + b;
    }

    public static int square(int a){
        System.out.println("Hallo, ich bin die square-Methode für die Zahl " + a);
        int c = a * a;
        return c;
    }

    public static void main(String[] args) {
        printGreeting();
        int sum = addNumbers(4,5);
        System.out.println("Das Ergebnis ist " + sum);
        int sqr = square(5);
        System.out.println("Das Ergebnis ist " + sqr);

    }
}
