package com.problems.jianZhiOffer;

import java.util.Scanner;

/**
 * Created by 902 on 2016/3/22.
 * 炮台攻击
 * 兰博教训提莫之后,然后和提莫讨论起约德尔人,谈起约德尔人,自然少不了一个人,那就是黑默丁格------约德尔人历史上最伟大的科学家.
 * 提莫说,黑默丁格最近在思考一个问题:黑默丁格有三个炮台,炮台能攻击到距离它R的敌人 (两点之间的距离为两点连续的距离,例如(3,0),(0,4)之间的距离是5),
 * 如果一个炮台能攻击到敌人,那么就会对敌人造成1×的伤害.黑默丁格将三个炮台放在N*M方格中的点上,并且给出敌人的坐标.
 * 问:那么敌人受到伤害会是多大?
 * <p/>
 * 输入描述:
 * 第一行9个整数,R,x1,y1,x2,y2,x3,y3,x0,y0.R代表炮台攻击的最大距离,(x1,y1),(x2,y2),
 * (x3,y3)代表三个炮台的坐标.(x0,y0)代表敌人的坐标.
 * <p/>
 * 输出描述:
 * 输出一行,这一行代表敌人承受的最大伤害,(如果每个炮台都不能攻击到敌人,输出0×)
 * <p/>
 * 输入例子:
 * 1 1 1 2 2 3 3 1 2
 * <p/>
 * 输出例子:
 * 2x
 */
public class TurretAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int range = input.nextInt();
            int[][] turrets = new int[3][2];
            for (int i = 0; i < 3; i++) {
                turrets[i][0] = input.nextInt();
                turrets[i][1] = input.nextInt();
            }
            int[] enemy = {input.nextInt(), input.nextInt()};
            TurretAttack.solution(range, turrets, enemy);
        }

    }

    public static void solution(int range, int[][] turrets, int[] enemy) {
        int attack = 0;
        for (int i = 0; i < 3; i++) {
            double l1 = Math.pow(turrets[i][0] - enemy[0], 2);
            double l2 = Math.pow(turrets[i][1] - enemy[1], 2);
            double l3 = Math.pow(range, 2);
            if (l1 + l2 <= l3) attack++;
        }
        System.out.println(attack + "x");
    }
}
