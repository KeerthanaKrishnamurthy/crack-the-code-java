package arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) {
        String str = "kerthna";
        System.out.println(uniqueCheck(str));
    }

    // 1. Brute Force
    private static boolean uniqueCheck(String str){
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++){
            for(int j=i+1; j< chars.length; j++){
                if(chars[i] == chars[j]){
                    return false;
                }
            }
        }
        return true;
    }

    // 2. Sorting
//    private static boolean uniqueCheck(String str){
//        char[] chars = str.toCharArray();
//        Arrays.sort(chars);
//        //String sortedString = new String(chars);
//        for(int i=1; i<chars.length; i++){
//            if(chars[i] == chars[i-1]){
//                return false;
//            }
//        }
//        return true;
//    }

    // 3. HashSet
//    private static boolean uniqueCheck(String str){
//        Set<Character> uniqueChars = new HashSet<>();
//        for(char c:str.toCharArray()){
//            if(uniqueChars.contains(c)){
//                return false;
//            }
//            uniqueChars.add(c);
//        }
//        return true;
//    }
}
