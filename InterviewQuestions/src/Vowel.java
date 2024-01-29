import java.util.Set;
import java.util.SortedMap;

public class Vowel {
    public static void main(String[] args) {
        String result;
        System.out.println(removeVowel("salam_dostlar"));
    }
    public static String removeVowel(String string) {
        Set<Character>vowels=Set.of('a','e','i','o','u');
        StringBuilder sb=new StringBuilder();
        char[] charArray=string.toCharArray();
        for(Character ch:charArray){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }

        return sb.toString();

    }
}
