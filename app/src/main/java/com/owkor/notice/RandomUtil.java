/*
 * Created By WeihuaGu (email:weihuagu_work@163.com)
 * Copyright (c) 2017
 * All right reserved.
 */

package com.owkor.notice;
import java.util.Random;

public class RandomUtil {
    public static String  getRandomTaskNum(){
            Random rand = new Random();
            return String.valueOf(rand.nextInt(9000) + 1000);
    }
}
