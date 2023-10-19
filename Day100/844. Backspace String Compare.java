class Solution {
    public boolean backspaceCompare(String s, String t) {
        return hehe(s).equals(hehe(t));
    }
    public String hehe(String str){
        StringBuilder res= new StringBuilder();
        for(char c : str.toCharArray()){
            if(c=='#' && res.length()>0){
                res.deleteCharAt(res.length()-1);
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
