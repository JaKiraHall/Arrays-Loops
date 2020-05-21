public class Loop {
    public static void main(String[] args) {
        String[] students = { "Kira", "Ky", "Michael", "Nia" };
        System.out.println(students);
        
        int i = students.length - 1;
        while (i <= 0) {
            System.out.println(i + " " + students[i]);
            i = i - 1;
        }
    }
    
    public static void printArray(String[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i = i + 1;
        }
    }
}
