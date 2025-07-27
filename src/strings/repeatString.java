package strings;

public class repeatString {
    public static void main(String[] args) {
        String str = "hello";
        int times = 4;
        System.out.println(repeatTimes(str, times));
    }
    private static String repeatTimes(String str, int times){
        if(times <= 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<times; i++){
            result.append(str);
        }
        return result.toString();
//        return String.valueOf(str).repeat(times);
    }
}
