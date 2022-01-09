package com.domain.common;

/**
 * @author: xielongfei
 * @date: 2022/01/09
 * @description: 转换字符串工具类
 */
public class ConvertTool {

    /**
     * 参考Integer.toString();
     * {@link Integer#toString(int, int)}
     */

    static final char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9' , 'a' , 'b' ,
            'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
            'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
            'o' , 'p' , 'q' , 'r' , 's' , 't' ,
            'u' , 'v' , 'w' , 'x' , 'y' , 'z' ,
            'A' , 'B' , 'C' , 'D' , 'E' , 'F' ,
            'G' , 'H' , 'I' , 'J' , 'K' , 'L' ,
            'M' , 'N' , 'O' , 'P' , 'Q' , 'R' ,
            'S' , 'T' , 'U' , 'V' , 'W' , 'X' ,
            'Y' , 'Z'
    };

    /**
     * hashcode转string
     * @param i
     * @return
     */
    public static String toString(int i) {
        int radix = 30;
        char[] buf = new char[12];
        boolean negative = (i < 0);
        int charPos = 11;

        if (!negative) {
            i = -i;
        }

        while (i <= -radix) {
            buf[charPos--] = digits[-(i % radix)];
            i = i / radix;
        }
        buf[charPos] = digits[-i];

        if (negative) {
            buf[--charPos] = '-';
        }

        return String.valueOf(buf, charPos, 12 - charPos);
    }

    /**
     * 计算字符串
     * @param s
     * @return
     */
    public static String toString(String s){
        int hash = Math.abs(s.hashCode());
        return toString(hash);
    }
}
