
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}

// public class ValidPalindrome {
// public boolean isPalindrome(String s) {

// if (s.isEmpty()) {
// return false;
// }
// s = s.toLowerCase();

// int start = 0;
// int end = s.length() - 1;
// while (start < end) {

// while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
// start++;
// }

// while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
// end--;
// }
// if (s.charAt(start) != s.charAt(end)) {
// return false;
// }
// start++;
// end--;
// }
// return true;
// }
// }
