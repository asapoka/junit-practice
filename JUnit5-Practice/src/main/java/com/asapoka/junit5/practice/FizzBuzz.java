package com.asapoka.junit5.practice;

/**
 * Hello world!
 *
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    /**
     * FizzBuzz
     * 3の倍数のときはFizz,5の倍数のときはBuzz、3の倍数かつ5の倍数のときはFizzBuzz、それ以外の場合は引数の数値を返すメソッド
     * 
     * @param i 条件判定に利用する数値
     * @return 判定結果から得た文字列
     */
    static String fizzBuzz(int i) {
        String out = "";
        if (i % 3 == 0) {
            out += "Fizz";
        }
        if (i % 5 == 0) {
            out += "Buzz";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            out += i;
        }
        return out;
    }
}
