class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        int n = arr.length;
        int cycle = (numRows - 1) * 2;

        int count = 0;

        while (count < numRows) {

            int i = count;
            int down = cycle - 2 * count;
            int up = 2 * count;
            boolean flag = true;

            while (i < n) {

                sb.append(arr[i]);

                if (count == 0 || count == numRows - 1) {
                    i += cycle;
                } else {
                    if (flag) {
                        i += down;
                    } else {
                        i += up;
                    }
                    flag = !flag;
                }
            }

            count++;
        }

        return sb.toString();
    }
}