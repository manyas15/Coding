
class ReverseWords {

    public String reverseWords(String s) {

        String[] word = s.split(" ");                                  //This splits the input string s into words using space " " as a separator.

        StringBuilder sb = new StringBuilder();                        //This is used to build the final reversed sentence efficiently.

        for (String words : word) {                                    //This is a for-each loop going through every word in the array.

            sb.append(new StringBuilder(words).reverse().append(" ")); //This reverses the current word and adds a space after it.

        }

        return sb.toString().trim();                                   //Converts StringBuilder to a string and trim() removes the last extra space at the end.
    }
}
