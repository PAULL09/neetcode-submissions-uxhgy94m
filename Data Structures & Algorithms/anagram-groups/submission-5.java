

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Map: character frequency map -> list of anagrams
        HashMap<HashMap<Character, Integer>, List<String>> bmap = new HashMap<>();

        for (String str : strs) {
            
            // Count frequency of each character
            HashMap<Character, Integer> fmap = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
            }

            // Add string to corresponding group
            if (!bmap.containsKey(fmap)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                bmap.put(fmap, list);
            } else {
                bmap.get(fmap).add(str);
            }
        }

        // Prepare result
        List<List<String>> res = new ArrayList<>();

        for (List<String> val : bmap.values()) {
            res.add(val);
        }

        return res;
    }
}
