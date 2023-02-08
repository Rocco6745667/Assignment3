
public class Solver {
    public static void main(String[] args) {
        final int SIZE = 100;
        int[] array = new int[SIZE];

        Sort s = new Sort();

        s.initializeArray(array, SIZE);
        System.out.print("Initially, the array is:");
        s.displayArray(array, SIZE);

        System.out.println();
        System.out.print("After randomization, the array becomes:");

        s.randomizeArray(array, SIZE);
        s.displayArray(array, SIZE);

        System.out.println();
        System.out.print("The array is now sorted:");

        // All the below sortings will be tested

        s.insertionSort(array, SIZE);
        s.selectionSort(array, SIZE);
        //s.quickSort(array, SIZE);

        s.displayArray(array, SIZE);


    }
}
