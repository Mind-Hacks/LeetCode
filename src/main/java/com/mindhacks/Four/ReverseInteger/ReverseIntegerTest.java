package com.mindhacks.Four.ReverseInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 测试整数反转
 * @User MindHacks
 * @Date 2017/8/9 11:41
 * @Version 1.0.0
 */
public class ReverseIntegerTest {
    private static Logger logger = LoggerFactory.getLogger(ReverseIntegerTest.class);

    public static void main(String[] args) {
        Solution solution = new Solution();
        //logger.info("将整数反转的结果{}", solution.reverse(111111111));
        logger.info("将整数反转的结果{}", solution.reverse(123321321));

       /* Solution solution1 = new Solution();
        logger.info("将整数反转的结果{}", solution1.reverse(-123));*/
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
