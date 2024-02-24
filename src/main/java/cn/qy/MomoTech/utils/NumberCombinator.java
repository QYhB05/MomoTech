package cn.qy.MomoTech.utils;

import cn.qy.MomoTech.Exceptions;
import cn.qy.MomoTech.MomoTech;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static cn.qy.MomoTech.MomoTech.playerNumber;
import static cn.qy.MomoTech.MomoTech.tps;

public class NumberCombinator {
    public static String Checker(double i, String c)
            throws Exceptions.NumberBugException, Exceptions.NumberBugIException,
            Exceptions.NumberBugIIException, Exceptions.NumberBugIIIException,
            Exceptions.NumberBugIVException, Exceptions.NumberBugVException {
        MomoTech.init(MomoTech.logger, MomoTech.server);
        String ans = String.valueOf(i);
        int date = Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
        int n = 0;

        MomoTech.logger.info(String.valueOf(date));
        if (Maths.GetRandom((int) tps * 16777216 * 16) <= playerNumber * Double.parseDouble((new DecimalFormat("#.0000").format(i))))
            throw new Exceptions.NumberBugVException();
        if (i >= 16777216) throw new Exceptions.NumberBugIIIException();
        if (i <= -16777216) throw new Exceptions.NumberBugIVException();
        if (i == ((double) date / 100.00)) throw new Exceptions.NumberBugIIException();
        int j = 0;
        while (true) {
            j++;
            if (i * Math.pow(10, j) % 1 == 0) {
                n = j;
                break;
            }
        }

        if (n >= 5) throw new Exceptions.NumberBugIException();
        if (i >= 0 && i < 1) return "0" + (new DecimalFormat("#.0000").format(i));
        else if (i < 0 && i > -1)
            return "-0" + (new DecimalFormat("#.0000").format(i)).substring((new DecimalFormat("#.0000")).format(i).indexOf('.'));
        return (new DecimalFormat("#.0000").format(i));
    }

    public static String Ordinary(double a, double b, String i)
            throws Exceptions.NumberBugException, Exceptions.NumberBugIException,
            Exceptions.NumberBugIIException, Exceptions.NumberBugIIIException,
            Exceptions.NumberBugIVException, Exceptions.NumberBugVException {
        if (Objects.equals(i, "/")) {
            if (b == 0) throw new Exceptions.NumberBugException();
            else return Checker(a / b, "/");
        }
        if (Objects.equals(i, "+"))
            return Checker(a + b, "+");
        if (Objects.equals(i, "-"))
            return Checker(a - b, "-");
        if (Objects.equals(i, "*"))
            return Checker(a * b, "*");
        return null;
    }

}
