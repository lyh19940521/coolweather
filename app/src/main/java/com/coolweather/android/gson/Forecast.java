package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by L on 2017/8/5.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("text_d")
        public String info;
    }
}
