package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //使用@SerializedName()注解的方法让JSON字段和Java之间建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
