import java.util.Scanner;
class palindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("Palindrome word");
        } else {
            System.out.println("Not a palindrome word");
        }
    }
}
