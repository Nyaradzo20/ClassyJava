public class ReverseArray {
    public static void main(String[] args) {
        double[] numbers = {10, 20, 30, 40, 50, 99, 77};
        
        // Print original array
        System.out.println("Original array: ");
        for (double num : numbers) {
            System.out.print((int) num + " ");
        }
        
        // Reverse the array using two-pointer swapping
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            double temp = numbers[left];  // Swap
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        // Print reversed array
        System.out.println("\nReversed array: ");
        for (double num : numbers) {
            System.out.print((int) num + " ");
        }
    }
}
