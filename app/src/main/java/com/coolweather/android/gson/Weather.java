package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;//请求状态,OK表示成功
    public Basic basic;//城市的一些基本信息
    public AQI aqi;//当前空气质量的情况
    public Now now;//当前天气的信息
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;//未来几天的天气的信息,为阿里天气
}