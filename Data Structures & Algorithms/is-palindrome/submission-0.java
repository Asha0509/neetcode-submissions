class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String a = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder(a);
        return a.equals(sb.reverse().toString());
        
        
    }
}
