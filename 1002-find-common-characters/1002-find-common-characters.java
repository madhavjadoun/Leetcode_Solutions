class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();

        for (int j = 0; j < words[0].length(); j++) {
            char ch = words[0].charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> count = new HashMap<>();

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            }

            for (char f : map.keySet()) {
                map.put(f, Math.min(map.get(f), count.getOrDefault(f, 0)));
            }
        }

        for (char f : map.keySet()) {
            for (int k = 0; k < map.get(f); k++) {
                ans.add(String.valueOf(f));
            }
        }

        return ans;
    }
}