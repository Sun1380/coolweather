package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;//未来某天日期
    @SerializedName("tmp")
    public Temperature temperature;//未来某天气温

    @SerializedName("cond")
    public More more;//未来某天天气概况

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
