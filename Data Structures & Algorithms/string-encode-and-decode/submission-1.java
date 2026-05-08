class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(String a : strs){
            ans += a.length()+"#"+a;
        }
        return ans;

    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> r = new ArrayList<>();
        while(i<str.length()){

            int hash = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,hash));
            String ans = str.substring(hash+1,hash+1+len);
            r.add(ans);
            i = hash+1+len;
        }
        return r;

    }
}
