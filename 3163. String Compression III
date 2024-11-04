class Solution {
    public String compressedString(String word) {
        if (word == null)
            return null;

        char[] wordChar = word.toCharArray();

        StringBuilder sb = new StringBuilder(wordChar[0]);
        int count = 1;

        for (int i = 1; i < wordChar.length; i++) {
            if (wordChar[i - 1] == wordChar[i]) {
                if (count == 9) {
                    sb.append(count);
                    sb.append(wordChar[i]);
                    count = 1;
                } else {
                    count++;
                }
            } else {
                sb.append(count);
                sb.append(wordChar[i - 1]);
                count = 1;
            }
        }

        sb.append(count);
        sb.append(wordChar[wordChar.length - 1]);

        return sb.toString();

    }
}
