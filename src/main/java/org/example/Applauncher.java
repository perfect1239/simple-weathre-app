package org.example;

import javax.swing.*;

public class Applauncher {
    public static void main(String[] args) {
        SwingUtilities .invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherGuiApi().setVisible(true);
               // System.out.println(Weatherapp.getLocationData("Tokyo"));
                //new WeatherGuiApi().setVisible(true);
                //System.out.println(WeatherApp.getCurrentTime());
            }
        });
    }
}
