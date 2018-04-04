package com.offer;

/**
 * @Description: 单例设计模式
 * @Author:MindHacks
 * @Date:2018-04-04 10:38:51
 * @wiki:
 */
public class No02 {

}

//饿汉式
class SingleTionA {
    private static SingleTionA singleTionA = new SingleTionA();

    private SingleTionA() {
    }

    public static SingleTionA getInstance() {
        return singleTionA;
    }
}

//懒汉式
class SingleTionB {
    private static SingleTionB singleTionB;

    private SingleTionB() {
    }

    public static SingleTionB getInstance() {
        if (singleTionB == null) {
            synchronized (SingleTionB.class) {
                if (singleTionB == null) {
                    singleTionB = new SingleTionB();
                }
            }
        }
        return singleTionB;
    }

}
