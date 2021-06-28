package com.util;

import java.util.List;

/**
 * Created by koujx on 2016/1/22.
 * if n equals one of the number of the List l
 */
public class Loop {
    public static boolean isLoop(List<Integer> l, int n) {
        boolean result = false;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == n) {
                result = true;
                break;
            }
        }
        return result;
    }
}
