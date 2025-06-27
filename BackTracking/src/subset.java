public class subset {
    public static void findSubset(String str , String ans , int idx){
       if(idx == str.length() ){
           System.out.println(ans+" ");
           return;
       }
       findSubset(str , ans+str.charAt(idx),idx+1);
       findSubset(str,ans,idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str,"",0);
    }
}
