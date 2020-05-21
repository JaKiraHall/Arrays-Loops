public class Erasure {
    public static String eraseCharacter(String s, char c) {
        String result = "";
        for (c = 0; c < s.length(); c++) {
            char p = s.charAt(c);
            if (p == c) {
                p = '_';
                result += p;
            } 
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(eraseCharacter("bananas", 'n'));
    }
}
