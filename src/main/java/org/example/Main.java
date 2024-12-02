package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new Main().romanToInteger("LXXXIX"));
    }
    private int romanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cur = map.get(c);
            if (i < s.length() - 1 && map.get(s.charAt(i+1)) > cur)
                ans -= cur;
            else ans += cur;
        }
        return ans;
    }
}