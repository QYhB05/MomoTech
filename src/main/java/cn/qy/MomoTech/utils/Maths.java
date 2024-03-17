package cn.qy.MomoTech.utils;

import java.util.Random;

public class Maths {

    public static int GetRandom(int end) {
        return Math.abs(new Random().nextInt()) % (end + 1);
    }

    public static boolean isDigital(String i) {
        if (i.charAt(0) == '.' || i.charAt(i.length() - 1) == '.') return false;
        boolean check = true;
        for (int j = 0; j < i.length(); j++) {
            if (i.charAt(j) >= '0' && i.charAt(j) <= '9') continue;
            if (i.charAt(j) == '.' && check) {
                check = false;
                continue;
            }
            return false;
        }
        return true;
    }
}
