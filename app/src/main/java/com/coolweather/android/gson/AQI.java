package com.coolweather.android.gson;

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;//aqi指数
        public String pm25;//pm2.5指数
    }
}
