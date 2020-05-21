public class SquaringArrays {
    public static int[] squareArray(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) { // same way as i <= numbers.length - 1
            result[i] = numbers[i] * numbers[i];   // squaring
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] answer = squareArray(numbers);
        System.out.println(answer);             // only prints out the memory code
        for (int i = 0; i < answer.length; i++) {  // add this to print out the actual array one by one
            System.out.print(answer[i] + " ");       // print out array
        }
    }
}
