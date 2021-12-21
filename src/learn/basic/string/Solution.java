package learn.basic.string;

/**
 * 字符串练习题
 */
public class Solution {

    /**
     * 题目：给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * 示例 2:
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     *
     * 示例 3:
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * 示例4：
     * 输入: s = ""
     * 输出: 0
     *
     * 转载：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {

        return 0;
    }

    /**
     * 题目：寻找两个正序数组的中位数
     * 示例 1：
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     *
     * 示例 2：
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     *
     * 示例 3：
     * 输入：nums1 = [0,0], nums2 = [0,0]
     * 输出：0.00000
     *
     * 示例 4：
     * 输入：nums1 = [], nums2 = [1]
     * 输出：1.00000
     *
     * 示例 5：
     * 输入：nums1 = [2], nums2 = []
     * 输出：2.00000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0.00;
    }

    /**
     *题目：给你一个字符串 s，找到 s 中最长的回文子串。
     *
     * 示例 1：
     * 输入：s = "babad"
     * 输出："bab"
     * 解释："aba" 同样是符合题意的答案。
     *
     * 示例 2：
     * 输入：s = "cbbd"
     * 输出："bb"
     *
     * 示例 3：
     * 输入：s = "a"
     * 输出："a"
     *
     * 示例 4：
     * 输入：s = "ac"
     * 输出："a"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        return null;
    }

    /**
     * 题目：将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
     * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
     *
     * 请你实现这个将字符串进行指定行数变换的函数：
     * string convert(string s, int numRows);
     *
     * 示例 1：
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     *
     * 示例 2：
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * 解释：
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     *
     * 示例 3：
     * 输入：s = "A", numRows = 1
     * 输出："A"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zigzag-conversion
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     */
    public String convert(String s, int numRows) {

        return null;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.lengthOfLongestSubstring()
//        solution.findMedianSortedArrays()
//        solution.longestPalindrome()
    }

}
