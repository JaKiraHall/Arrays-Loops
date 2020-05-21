import java.util.Scanner;

public class NiceRegularBox {
    public static int lengthOfLongestLine(String[] s) {
        String result = "";
        for (int i = 0; i <= s.length - 1; i++) {
            if (result.length() < s[i].length()) {
                result = s[i];
            }
        }
    
        int longestLine = result.length();
        return longestLine;
    }
    
    public static String repeatCharacter(char c, int j) {
        String result = "";
        for (int i = 1; i <= j; i++) {
            result += c;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        String[] words = new String[num];
        for (int i = 0; i <= words.length - 1; i++) {
            words[i] = scan.nextLine();
        }
        
        int crazy = lengthOfLongestLine(words);
        System.out.print("+" + "+" + repeatCharacter('+',crazy));
        System.out.println("+" + "+" + "+");
        
        for (int j = 0; j <= words.length - 1; j++) {
            System.out.print("+" + " " + words[j]);
            System.out.println(repeatCharacter(' ',crazy - words[j].length()) + " " + "+");
        }
        System.out.print("+" + "+" + repeatCharacter('+',crazy));
        System.out.print("+" + "+" + "+");
    }


}

 
