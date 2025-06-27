package basic;

public class RemoveDuplicate {
     public static void removeduplicate(String str , int idx, StringBuilder newstring , boolean[] map){
         if (idx == str.length()){
             System.out.println(newstring);
             return;
         }
         char currchar = str.charAt(idx);
         if(map[currchar-'a']==true){
             removeduplicate(str,idx+1,newstring,map);
         }else {
             map[currchar-'a'] = true;
             removeduplicate(str,idx+1,newstring.append(currchar),map);
         }
     }

    public static void main(String[] args) {
        String str = "sudadgshakar";
        removeduplicate(str,0,new StringBuilder(),new boolean[26] );
    }
}
