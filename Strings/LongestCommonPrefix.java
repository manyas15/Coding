
class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the initial prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        // If any string does not start with the prefix, shorten the prefix
        // until it matches or becomes empty
        // We use startsWith to check if the current string starts with the prefix
        // and substring to shorten the prefix
        // We iterate through the array starting from the second string
        // because the first string is already considered as the initial prefix
        // If at any point the prefix becomes empty, we return an empty string
        for (int i = 1; i < strs.length; i++) {

            // keep shortening the prefix (remove last character)
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, that means there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // After checking all strings, whatever prefix is left is the longest common prefix
        return prefix;
    }
}
