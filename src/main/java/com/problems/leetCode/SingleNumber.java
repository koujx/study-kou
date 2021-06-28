package com.problems.leetCode;

/**
 * Created by koujx on 2016/4/12.
 * #136. Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p/>
 * #137. Single Number II
 * Given an array of integers, every element appears three times except for one. Find that single one.
 * <p/>
 * #260. Single Number III
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 * For example:
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {-2, -2, 1, 1, -3, 1, -3, -3, -4, -2};
        int singles = singleNumber2(nums);
        System.out.println(singles);
    }

    //#260. Single Number III
    public static int[] singleNumber3(int[] nums) {
        if (nums.length < 3) return nums;
        else {
            int single = singleNumber1(nums);
            int x = 0;
            while ((single & 1) == 0) {
                single >>= 1;
                x++;
            }
            int[] nums1 = new int[nums.length];
            int[] nums2 = new int[nums.length];
            int i1 = 0;
            int i2 = 0;
            for (int i = 0; i < nums.length; i++) {
                int ni = nums[i];
                ni >>= x;
                if ((ni & 1) == 1) {
                    nums1[i1] = nums[i];
                    i1++;
                } else {
                    nums2[i2] = nums[i];
                    i2++;
                }
            }
            int[] singles = {singleNumber1(nums1), singleNumber1(nums2)};
            return singles;
        }
    }

    //#137. Single Number II
    /**
     * 模拟三进制，ones、twos、threes分别表示当前是否已经出现了3个1， 2个1, 1个1
     * 0       0   0       表示没有出现1
     * 0       0   1       表示出现了1个1
     * 0       1   0       表示出现了2个1
     * 0       1   1       表示出现了3个1，这时我们需要把它转化成
     * 1       0   0       也就是3进制计算的结果，我们得到three=1，然后把two和one清0
     * 各位的迭代关系如下：
     * two = (one & A[i]) | two    已经出现了一个1，这次又出现了一个1 或者 这次出现的不是1，但是本来就已经有两个1了
     * one = one ^ A[i]            如果本来就有一个1了，这次又出现一个1，那么这我们需要向two进一位（也就是上一步，将two设成1），这是我们需要将one清为0
     * three = two & one           如果已经出现了3个1，则three为1，此时需要将two和one清0
     */
    public static int singleNumber2(int[] A) {
        int ones = 0, twos = 0, threes = 0;
        for (int i = 0; i < A.length; i++) {
            twos |= ones & A[i];
            ones ^= A[i];
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }

    //#136. Single Number
    //XOR
    public static int singleNumber1(int[] A) {
        int single = 0;
        for (int a : A) {
            single = single ^ a;
        }
        return single;
    }
/*
    //HashSet
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i])) {
                hs.add(nums[i]);
            }else {
                hs.remove(nums[i]);
            }
        }
        int single = hs.iterator().next();
        return single;
    }
*/
/*
    public static int singleNumber(int[] nums) {
        int single = 0;
        for(int i=0;i<nums.length-1;i+=2){
            single = nums[i];
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]==nums[j]){
                    int temp = nums[j];
                    nums[j]=nums[i+1];
                    nums[i+1]=temp;
                    break;
                }
            }
            if (nums[i]!=nums[i+1]) return single;
        }
        return nums[nums.length-1];
    }
*/
}
