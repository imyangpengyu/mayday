package javaPart.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ypy
 * @date 2018/1/16 19:55
 */
public class MyRandom {

    public static int getOneRandomNum(int begin, int end){
        int size = end-begin+1;
        int x ;
        Random random = new Random();
        x = random.nextInt(size)+begin;
        return x;
    }

    public static List<Integer> getManyRandomNum(int begin, int end, int num) {
        int size = end-begin+1;
        int[] all = new int[size];
        Random random = new Random();
        List<Integer> result = new ArrayList<Integer>();
        int x;
        if (size < num) {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        } else if (size == num ) {
            for (int i = 0; i < num; i++) {
                result.add(begin++);
            }
        } else {
            for(int i=0;i<size;i++){
                all[i] = begin++;
            }
            for(int i = 0;i<num;i++){
                x = random.nextInt(size);
                //获得坐标
                result.add(all[x]);
                all[x] = all[size-1];
                size--;
            }
        }
        return result;
    }
}
