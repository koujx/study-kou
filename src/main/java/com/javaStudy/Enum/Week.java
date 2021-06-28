package com.javaStudy.Enum;

/**
 * Created by 902 on 2016/4/8.
 */
public enum Week {
    MONDAY("MON"),
    TUESDAY("TUES"),
    WEDNESDAY("WED"),
    THURSDAY("THUR"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private String abbr;

    private Week(String abbr){
        this.abbr = abbr;
        System.out.println(this.abbr);
    }

    public String getAbbr(){
        return abbr;
    }
}
