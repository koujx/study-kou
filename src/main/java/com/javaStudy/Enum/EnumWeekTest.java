package com.javaStudy.Enum;

/**
 * Created by 902 on 2016/4/8.
 */
public class EnumWeekTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(Week week : Week.values()){
            System.out.println("The order of "+week+" is "+week.ordinal());
            System.out.println("Compare to MONDAY : "+week.compareTo(Week.MONDAY));
            System.out.println("Equal to MONDAY ? "+week.equals(Week.MONDAY));
            System.out.println("Equal to MONDAY by == ?  "+ (week == Week.MONDAY));
            System.out.println("Name : "+week.name());
            System.out.println("Abbreviation : "+week.getAbbr());
            System.out.println("----------------------");
        }
        System.out.println(Week.MONDAY);
    }
}
