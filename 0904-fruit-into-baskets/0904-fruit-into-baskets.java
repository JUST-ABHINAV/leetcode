class Solution {
    public int totalFruit(int[] fruits) {
        int a = 0;
        int b = 0;
        int total = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (b = 0; b < fruits.length; b++) {

            map.put(fruits[b], map.getOrDefault(fruits[b], 0) + 1);

            total++;

            while (map.size()> 2) {

                int fruit = fruits[a];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    // set.remove(fruit);
                    map.remove(fruit);
                }

                a++;
                total--;
            }

            max = Math.max(max, total);
        }

        return max;
    }
}