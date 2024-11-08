class Solution {
    public int minChanges(String s) {
        int count = 0;
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length - 1; i+=2) {
            if (charArray[i] != charArray[i + 1])
                count++;
        }

        return count;
    }
}
