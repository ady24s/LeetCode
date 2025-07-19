/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxlen = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(c);
            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }

        return maxlen;
    }
}

// @lc code=end

