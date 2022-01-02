package learn.basic.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 字符串练习题
 */
public class Solution {

    /**
     * 551. 学生出勤记录 I
     * 给你一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
     * <p>
     * 'A'：Absent，缺勤
     * 'L'：Late，迟到
     * 'P'：Present，到场
     * 如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
     * <p>
     * 按 总出勤 计，学生缺勤（'A'）严格 少于两天。
     * 学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
     * 如果学生可以获得出勤奖励，返回 true ；否则，返回 false 。
     * <p>
     * 示例 1：
     * 输入：s = "PPALLP"
     * 输出：true
     * 解释：学生缺勤次数少于 2 次，且不存在 3 天或以上的连续迟到记录。
     * <p>
     * 示例 2：
     * 输入：s = "PPALLL"
     * 输出：false
     * 解释：学生最后三天连续迟到，所以不满足出勤奖励的条件。
     * <p>
     * 提示：
     * 1 <= s.length <= 1000
     * s[i] 为 'A'、'L' 或 'P'
     */
    public boolean checkRecord(String s) {
        char[] str = s.toCharArray();
        int lateTimes1 = 0, lateTimes2 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'L')
                lateTimes1++;
            if (str[i] == 'A')
                lateTimes2++;
        }
        if (lateTimes1 < 3 && lateTimes2 < 2)
            return true;
        return false;
    }

    /**
     * 520. 检测大写字母
     * 我们定义，在以下情况时，单词的大写用法是正确的：
     * 示例 1：
     * 输入：word = "USA"
     * 输出：true
     * <p>
     * 示例 2：
     * 输入：word = "FlaG"
     * 输出：false
     * <p>
     * 提示：
     * 1 <= word.length <= 100
     * word 由小写和大写英文字母组成
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/detect-capital
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i]))
                return false;
        }
        return true;
    }

    /**
     * 1071. 字符串的最大公因子
     * 对于字符串 S 和 T，只有在 S = T + ... + T（T 自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
     * <p>
     * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
     * <p>
     * 示例 1：
     * 输入：str1 = "ABCABC", str2 = "ABC"
     * 输出："ABC"
     * <p>
     * 示例 2：
     * 输入：str1 = "ABABAB", str2 = "ABAB"
     * 输出："AB"
     * <p>
     * 示例 3：
     * 输入：str1 = "LEET", str2 = "CODE"
     * 输出：""
     *
     * @param str1
     * @param str2
     * @return
     */
    public String gcdOfStrings(String str1, String str2) {
        int str1Length = str1.length(), str2Length = str2.length();
        int publicLength = mod(str1Length, str2Length);
        if (!(str1.contains(str2) || str2.contains(str1)))
            return "";
        return str1.substring(0, publicLength);
    }

    public final int mod(int s1, int s2) {
        if (s1 < s2) {
            int temp = s1;
            s1 = s2;
            s2 = temp;
        }
        if (s1 % s2 == 0) {
            return s2;
        } else {
            return mod(s2, s1 % s2);
        }
    }

    /**
     * 720. 词典中最长的单词
     * 给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返回答案中字典序最小的单词。
     * 若无答案，则返回空字符串。
     * <p>
     * 示例 1：
     * 输入：
     * words = ["w","wo","wor","worl", "world"]
     * 输出："world"
     * 解释：
     * 单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
     * <p>
     * 示例 2：
     * 输入：
     * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
     * 输出："apple"
     * 解释：
     * "apply"和"apple"都能由词典中的单词组成。但是"apple"的字典序小于"apply"。
     * <p>
     * 提示：
     * 所有输入的字符串都只包含小写字母。
     * words数组长度范围为[1,1000]。
     * words[i]的长度范围为[1,30]。
     *
     * @param words
     * @return
     */
    public String longestWord(String[] words) {
        
        return null;
    }

    /**
     * 1360. 日期之间隔几天
     * 请你编写一个程序来计算两个日期之间隔了多少天。
     * <p>
     * 日期以字符串形式给出，格式为 YYYY-MM-DD，如示例所示。
     * <p>
     * 示例 1：
     * 输入：date1 = "2019-06-29", date2 = "2019-06-30"
     * 输出：1
     * <p>
     * 示例 2：
     * 输入：date1 = "2020-01-15", date2 = "2019-12-31"
     * 输出：15
     * <p>
     * 提示：
     * 给定的日期是 1971 年到 2100 年之间的有效日期。
     * 思路：根据SimpleFormat的格式进行传入，然后根据DateFormat中的一个parse方法进行解析字符串为时间，然后通过getTime进行转换成毫秒数
     *
     * @param date1
     * @param date2
     * @return
     */
    public long daysBetweenDates(String date1, String date2) {
        SimpleDateFormat sDT1 = new SimpleDateFormat("yyyy-MM-dd"),
                sDT2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date start = sDT1.parse(date1),
                    end = sDT2.parse(date2);
            long startTime = start.getTime();
            long endTime = end.getTime();
            long num = endTime - startTime;
            if (num < 0)
                num = -num;
            return num / 24 / 60 / 60 / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 796. 旋转字符串
     * 给定两个字符串, A 和 B。
     * <p>
     * A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。
     * <p>
     * 示例 1:
     * 输入: A = 'abcde', B = 'cdeab'
     * 输出: true
     * <p>
     * 示例 2:
     * 输入: A = 'abcde', B = 'abced'
     * 输出: false
     * 注意：
     * A 和 B 长度不超过 100。
     *
     * @param s
     * @param goal
     * @return
     */
    public boolean rotateString(String s, String goal) {
        char fir = s.charAt(0);
        int go = goal.indexOf(fir);
        char[] chars1 = s.toCharArray();
        char[] chars2 = goal.toCharArray();

        for (int i = 0; i <s.length(); i++) {
            if(chars1[i]!=chars2[go])
                return false;
            go++;
            if(go>s.length()-1)
                go=0;
        }
        return true;
    }

    /**
     * 1002. 查找共用字符
     * 给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答案。
     * <p>
     * <p>
     * 示例 1：
     * 输入：words = ["bella","label","roller"]
     * 输出：["e","l","l"]
     * <p>
     * 示例 2：
     * 输入：words = ["cool","lock","cook"]
     * 输出：["c","o"]
     * 提示：
     * 1 <= words.length <= 100
     * 1 <= words[i].length <= 100
     * words[i] 由小写英文字母组成
     *
     * @param words
     * @return
     */
    public List<String> commonChars(String[] words) {

        return null;
    }

    /**
     * 1108. IP 地址无效化
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     * 示例 1：
     * 输入：address = "1.1.1.1"
     * 输出："1[.]1[.]1[.]1"
     * <p>
     * 示例 2：
     * 输入：address = "255.100.50.0"
     * 输出："255[.]100[.]50[.]0"
     * 提示：
     * 给出的 address 是一个有效的 IPv4 地址
     *
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        return null;
    }

    /**
     * 1154. 一年中的第几天
     * 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
     * <p>
     * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
     * <p>
     * 示例 1：
     * 输入：date = "2019-01-09"
     * 输出：9
     * <p>
     * 示例 2：
     * 输入：date = "2019-02-10"
     * 输出：41
     * <p>
     * 示例 3：
     * 输入：date = "2003-03-01"
     * 输出：60
     * <p>
     * 示例 4：
     * 输入：date = "2004-03-01"
     * 输出：61
     * <p>
     * 提示：
     * date.length == 10
     * date[4] == date[7] == '-'，其他的 date[i] 都是数字
     * date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日
     *
     * @param date
     * @return
     */
    public int dayOfYear(String date) {

        return 0;
    }

    /**
     * 14. 最长公共前缀
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     * 示例 1：
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     * <p>
     * 示例 2：
     * 输入：strs = ["dog","racecar","car"]
     * 输出：""
     * <p>
     * 解释：输入不存在公共前缀。
     * 提示：
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] 仅由小写英文字母组成
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {

        return null;
    }

    /**
     * 题目：给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * <p>
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * <p>
     * 示例 2:
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * <p>
     * 示例 3:
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * <p>
     * 示例4：
     * 输入: s = ""
     * 输出: 0
     * <p>
     * 转载：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     *
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
     * <p>
     * 示例 2：
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     * <p>
     * 示例 3：
     * 输入：nums1 = [0,0], nums2 = [0,0]
     * 输出：0.00000
     * <p>
     * 示例 4：
     * 输入：nums1 = [], nums2 = [1]
     * 输出：1.00000
     * <p>
     * 示例 5：
     * 输入：nums1 = [2], nums2 = []
     * 输出：2.00000
     * <p>
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
     * 题目：给你一个字符串 s，找到 s 中最长的回文子串。
     * <p>
     * 示例 1：
     * 输入：s = "babad"
     * 输出："bab"
     * 解释："aba" 同样是符合题意的答案。
     * <p>
     * 示例 2：
     * 输入：s = "cbbd"
     * 输出："bb"
     * <p>
     * 示例 3：
     * 输入：s = "a"
     * 输出："a"
     * <p>
     * 示例 4：
     * 输入：s = "ac"
     * 输出："a"
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
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
     * <p>
     * 请你实现这个将字符串进行指定行数变换的函数：
     * string convert(string s, int numRows);
     * <p>
     * 示例 1：
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     * <p>
     * 示例 2：
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * 解释：
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     * <p>
     * 示例 3：
     * 输入：s = "A", numRows = 1
     * 输出："A"
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zigzag-conversion
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public String convert(String s, int numRows) {

        return null;
    }

    /**
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
     * <p>
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     * <p>
     * 示例 1：
     * 输入：s = ["h","e","l","l","o"]
     * 输出：["o","l","l","e","h"]
     * <p>
     * 示例 2：
     * 输入：s = ["H","a","n","n","a","h"]
     * 输出：["h","a","n","n","a","H"]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-string
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     */
    public void reverseString(char[] s) {

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.lengthOfLongestSubstring()
//        solution.findMedianSortedArrays()
//        solution.longestPalindrome()
        System.out.println(solution.checkRecord("PPAALLP"));
        System.out.println(solution.detectCapitalUse("GHGHjG"));
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));
        System.out.println(solution.daysBetweenDates("2021-12-25", "2022-12-23"));
        System.out.println(solution.rotateString("abcde","bcdae"));
    }

}
