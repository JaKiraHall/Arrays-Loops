public class Increment {
    // Write a function that takes and array of ints
    // and returns a new array with 1 added to each element
    // { 1, 2, 3 } --> { 2, 3, 4 }
    public static int[] increment(int[] numbers) {
        // declare new array of size numbers.length
        int[] result = new int[numbers.length];
        // for loops
        for (int i = 0; i <= numbers.length - 1; i ++) {
            int eltPlusOne = numbers[i] + 1;
            result[i] = eltPlusOne;
        }
        return result;
    }
}
