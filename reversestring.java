public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        char[] param_1 = {'h', 'e', 'l', 'l', 'o'};
        new Solution().reverseString(param_1);
        System.out.println(param_1);
    }
}
