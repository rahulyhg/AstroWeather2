package com.example.dawid.astro.data;

import org.json.JSONException;
import org.json.JSONObject;

public class Units implements JSONPopulator {
    private String temperature;
    private String pressure;
    private String speed;


    public String getTemperature() {
        return temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public String getSpeed() {
        return speed;
    }

    @Override
    public void populate(JSONObject data) {
        temperature = data.optString("temperature");
        pressure = data.optString("pressure");
        speed = data.optString("speed");
    }

    @Override
    public JSONObject toJSON() {
        JSONObject data = new JSONObject();


        return data;
    }
}
