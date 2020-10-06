public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int count = 0;
        for (int j = 0; j < 10000; j++) {
            for (int i = 0; i < 6; i++) {
                if ((int) (Math.random() * 6) + 1 == 6) {
                    count++;
                    break; } }
        }
        return ((double) count / (double) 10000) * 100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int count = 0;
        int amount = 0;
        for (int i = 0; i < 10000; i++) {
            amount = 0;
            for (int j = 0; j < 12; j++) {
                if ((int) (Math.random() * 6) + 1 == 6)
                    amount++;
                if (amount == 2) {
                    count++;
                    break; }
            }
        }
        return ((double) count / (double) 10000) * 100;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int count = 0;
        int amount = 0;
        for (int i = 0; i < 10000; i++) {
            amount = 0;
            for (int j = 0; j < 18; j++) {
                if ((int) (Math.random() * 6) + 1 == 6)
                    amount++;
                if (amount == 3) {
                    count++;
                    break; }
            }
        }
        return ((double) count / (double) 10000) * 100;
    }


    public static void main(String[] args) {
        System.out.println("If you roll 6 dice you will get at least one 6 " + probabilityOneSix() + "% of the time");
        System.out.println("If you roll 12 dice you will get at least two 6's " + probabilityTwoSixes() + "% of the time");
        System.out.println("If you roll 18 dice you will get at least three 6's " + probabilityThreeSixes() + "% of the time");
    }
}
