package com.simplefactory;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        JiShuA jiShuA = Entity.getJS(YunShuFu2.ADD);
        System.out.println(jiShuA.jiShu(a,b));
    }
}
