package com.problems.leetCode;

/**
 * Created by koujx  on 2016/1/22.
 * 7. Reverse Integer
 */
public class Reverse {
    public int reverse(int x) {
        final int INT_MAX = 0x7fffffff;
        final int INT_MIN = 0x80000000;
        long revx = 0;

        while (x != 0) {
            int temp = x % 10;
            revx = (revx * 10) + temp;
            x /= 10;
        }
        if (revx > INT_MAX || revx < INT_MIN) return 0;
        else return (int) revx;
//		ArrayList<Integer> n = new ArrayList<Integer>();
//		while(x >0) {
//			n.add(x%10);
//			x/=10;
//		}
//
//		for (int i = n.size(); i > 0; i--) {
//			int xx = (int) (n.get(n.size()-i)*Math.pow(10, i-1));
//			if (revx<=revx + xx) {
//				revx += xx;
//			}else{
//				revx = 0;
//				break;
//			}
//		}
    }
}
