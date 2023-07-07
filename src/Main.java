public class Main {
    public static void main(String[] args) {

        int temperature = 36;
        int numberOfStudents = 22;
        boolean isRainy = false;

        if (numberOfStudents == 22) { // true
            System.out.println("Play football!!!");
        }

        if (temperature < 0) { // false
            System.out.println("Play hockey!!!!");
        }

        if (temperature > 30) {
            System.out.println("Go swimming");
        } else {
            System.out.println("Stay at home");
        }

        if (numberOfStudents < 15) { // false
            System.out.println("Go to cinema");
        } else {
            System.out.println("Go to picnic");
        }

        temperature = 0;
        if (temperature > 0) {
            System.out.println("It is warm");
        } else if (temperature < 0) {
            System.out.println("It is cold");
        } else if (temperature == 0) {
            System.out.println("It zero degree");
        } else {
            System.out.println("Normal weather");
        }

        /*else{
            System.out.println("This");
        }*/
        if (temperature >= 5) {
            System.out.println("Hello");
            if (numberOfStudents > 10) {
                System.out.println("Java");
            } else {
                System.out.println("Programming");
            }
        }
    }
}
