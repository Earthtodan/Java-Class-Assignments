public class WeekFive_Assignment {
    public static void main(String[] args) {

        int[] numbers = {42, 20, 1, 13};

        int smallNumber;
        int bigNumber;

        for (int j : numbers) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    bigNumber = numbers[i];
                    smallNumber = numbers[i + 1];
                } else {
                    bigNumber = numbers[i + 1];
                    smallNumber = numbers[i];
                }
                numbers[i] = smallNumber;
                numbers[i + 1] = bigNumber;
            }
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
