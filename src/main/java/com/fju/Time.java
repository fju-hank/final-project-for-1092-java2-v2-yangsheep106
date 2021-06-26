package com.fju;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Time {

    public int discount(int number) {

        try {
            URL url = new URL("https://www.youtube.com/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            Long mileSeconds = connection.getDate();
            Date date = new Date(mileSeconds);

            if(date.getHours() > 11 && date.getHours() < 18 ){
                if (number == 23 || number == 123 || number == 234) {
                    return -10;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
