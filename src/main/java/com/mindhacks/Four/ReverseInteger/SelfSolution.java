package com.mindhacks.Four.ReverseInteger;

public class SelfSolution {

    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        if (x > 0) {
            char[] inputArray = String.valueOf(x).toCharArray();
            char[] outArray = new char[inputArray.length];
            JavaStack<Character> stack = new JavaStack<Character>(inputArray.length);
            for (int n = 0; n < inputArray.length; n++) {
                stack.push(inputArray[n]);
            }
            for (int n = 0; n < inputArray.length; n++) {
                outArray[n] = stack.pop();
            }
            String strValue = String.valueOf(outArray);
            Long y=Long.parseLong(strValue);
            if (y >= Integer.MAX_VALUE) {
                return 0;
            }
              return Integer.parseInt(strValue);
        }
        if (x < 0) {
            char[] inputArray = String.valueOf(x).toCharArray();
            char[] outArray = new char[inputArray.length];
            JavaStack<Character> stack = new JavaStack<Character>(inputArray.length-1);
            for (int n = 1; n < inputArray.length; n++) {
                stack.push(inputArray[n]);
            }
            outArray[0] = '-';
            for (int n = 1; n < inputArray.length; n++) {
                outArray[n] = stack.pop();
            }
            String strValue = String.valueOf(outArray);
            Long y=Long.parseLong(strValue);
            if (y <= Integer.MIN_VALUE) {
                return 0;
            }
            return Integer.parseInt(strValue);
        }
        return 0;
    }


    class JavaStack<E> {
        private Object[] datas;
        private int maxSize = 0;
        private int point=-1;

        public JavaStack(int size) {
            datas = new Object[size];
            maxSize=size;
        }

        public void push(Object obj) {
            if (point==maxSize-1){
                throw new RuntimeException("不能再放数据了，状态下了！");
            }
            datas[++point] = obj;
        }

        public E pop() {
            if (point == -1) {
                throw new RuntimeException("栈已经为空，没有数据了！");
            }
            return (E) datas[point--];
        }
    }
}