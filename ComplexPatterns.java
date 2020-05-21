public class ComplexPatterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //System.out.println(i);
            
            for (int j = 4; j >= i; j--) {
                System.out.print(".");
            }
            System.out.println(i);
        }
        System.out.println();
    }
}
