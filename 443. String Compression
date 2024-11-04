class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0)
            return 0;
        if (chars.length == 1)
            return 1;

        StringBuilder sb = new StringBuilder(chars[0]);
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i])
                count++;
            else {
                sb.append(chars[i - 1]);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        sb.append(chars[chars.length - 1]);
        if (count > 1) {
            sb.append(count);
        }

        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
