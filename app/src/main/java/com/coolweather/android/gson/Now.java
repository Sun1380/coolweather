package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;//当前气温
    @SerializedName("cond")//当前天气概况
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
