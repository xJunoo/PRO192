
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tung Duy
 */
class MyString implements IString {
    
    @Override
    public int f1(String str) {
        String[] words = str.split(" ");
        int sum = 0;
        for(String word : words) {
            if(!isPalindrome(word) && word.length() >= 2) {
              sum += word.length();
            }
        }

        return sum;
    }
    @Override
    public String f2(String str) {
        HashMap<Character, Boolean> map = new HashMap<>();
        String result = "";
        for(char c : str.toCharArray()) {
            if(!map.containsKey(c)) {
              map.put(c, true);
              result += c;  
            }
        }
        return result;
    }
    
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

}
