class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> result = solve(expression, 0, expression.length() - 1);
        List<String> ans = new ArrayList<>(result);
        Collections.sort(ans);
        return ans;
    }

    private Set<String> solve(String s, int l, int r) {

        Set<String> result = new HashSet<>();

        int level = 0;
        int start = l;

        for (int i = l; i <= r; i++) {

            if (s.charAt(i) == '{') {
                level++;
            } 
            else if (s.charAt(i) == '}') {
                level--;
            }

            // Union: expression contains comma at current level
            if (s.charAt(i) == ',' && level == 0) {
                result.addAll(solve(s, start, i - 1));
                start = i + 1;
            }
        }

        if (start != l) {
            result.addAll(solve(s, start, r));
            return result;
        }

        // Remove outer braces
        if (s.charAt(l) == '{' && s.charAt(r) == '}') {
            int level2 = 0;
            boolean outer = true;

            for (int i = l; i <= r; i++) {
                if (s.charAt(i) == '{') level2++;
                else if (s.charAt(i) == '}') level2--;

                if (level2 == 0 && i < r) {
                    outer = false;
                    break;
                }
            }

            if (outer) {
                return solve(s, l + 1, r - 1);
            }
        }

        // Concatenation
        List<Set<String>> parts = new ArrayList<>();

        int i = l;

        while (i <= r) {

            if (s.charAt(i) == '{') {
                int level3 = 1;
                int j = i + 1;

                while (level3 > 0) {
                    if (s.charAt(j) == '{') level3++;
                    else if (s.charAt(j) == '}') level3--;
                    j++;
                }

                parts.add(solve(s, i + 1, j - 2));
                i = j;
            } 
            else {
                Set<String> single = new HashSet<>();
                single.add(String.valueOf(s.charAt(i)));
                parts.add(single);
                i++;
            }
        }

        result.add("");

        for (Set<String> part : parts) {
            Set<String> next = new HashSet<>();

            for (String a : result) {
                for (String b : part) {
                    next.add(a + b);
                }
            }

            result = next;
        }

        return result;
    }
}