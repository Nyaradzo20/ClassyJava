public class PrintReverse {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50, 99, 77};
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
