package test;

import com.util.MyQueue;

import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by koujx on 2016/1/22.
 * com OJ problems test
 */

public class test {
    private static Date date = new Date();
    private static Calendar calendar;
    private static MyQueue queue = new MyQueue();

    public static void main(String[] args) {
        WeakReference<String> reference=new WeakReference<String>(new String("zhangsan"));
        System.out.println(reference.get());
        System.gc();//通知JVM回收资源
        System.out.println(reference.get());
    }

    public static void main1(String[] args) {

        int a = 5;
        int b = 8;
        int c = 5&8;
        System.out.println(8&1);

        String s1 = "123";
        String s2 = new String("123");
        String s3 = "1"+"2"+"3";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
/*        ListNode head = new ListNode(1);
        ListNode r = re.removeElements(head, 1);
        String s = "aaa";
        String t = "";
        System.out.println(ana.isAnagram(s, t));*/

/*		long start1 = System.currentTimeMillis();
		new ClimbingStairs().climbStairs1(43);
		long stop1 = System.currentTimeMillis();
		long start2 = System.currentTimeMillis();
		new ClimbingStairs().climbStairs2(43);
		long stop2 = System.currentTimeMillis();
		System.out.println(stop1-start1);
		System.out.println(stop2-start2);*/

//        int[] nums = {};
//        System.out.println(cd.containsDuplicate(nums));
//        while (r != null) System.out.println(r.val + "->");
//        int[] num = {0, 0, 4, 0, 2, 1, 0, 3, 12};
//        mz.moveZeroes(num);
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]+" ");
//        }

//        System.out.println(nimGame.canWinNim(1348820612));
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i + ":" + sheet.convertToTitle(i));
//        }
//        System.out.println(sheet.titleToNumber("s"));

        //        //66. Plus One
//        int[] num = new int[10];
//        for (int i = 0; i < 10; i++) {
//            num[i] = (int) (Math.random() * 10);
//        }
//
//        //67. Add Binary
//        String a = "110";
//        String b = "1";
//        System.out.println(code.addBinary(a, b));

/*		//Add Two Number ListNode
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode p1 = new ListNode(0);
		ListNode p2 = new ListNode(0);
		ListNode temp1 = new ListNode(0);
		ListNode temp2 = new ListNode(0);
		int d1 = 55;
		int d2 = 45;

		l1 = p1;
		l2 = p2;
		while ((d1 / 10) != 0)
			ListNode l = addTwoNumbers(l1, l2);

		p1.val = d1 % 10;
		while ((d2 / 10) != 0)

		{
			p1.val = d1 % 10;
			p1.next = new ListNode(0);
			temp1.val = p1.val;
			p1 = p1.next;
			d1 /= 10;
		}

		p2.val = d2 % 10;

		{
			p2.val = d2 % 10;
			p2.next = new ListNode(0);
			temp2.val = p2.val;
			p2 = p2.next;
			d2 /= 10;
		}
		while (l.next != null)

		{
			System.out.print(l.val + "->");
			l = l.next;
		}

		System.out.println(l.val);*/

//        String s = "  ";
//        System.out.println(ojtest.lengthOfLongestSubstring(s));
//
//        int[] nums = new int[10000];
//        System.out.println(ojtest.reverse(-1000000004));
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = -i;
//            System.out.println(-i + ":" + ojtest.reverse(-i));
//            String string = null;
//            if (ojtest.isPowerofThree(i)) {
//                string = "true";
//                System.out.println(i + ":" + string);
//            } else {
//                string = "false";
//            }
//            System.out.println(i + ":" + string);
//        }
    }
}