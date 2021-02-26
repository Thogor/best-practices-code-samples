package com.realdolmen.samples.lennertVandenHerrewegen.creatingAndDestroying;

/*
Static factory method example
Takes different date inputs and returns a string
 */
public class HourFactory {

    private String hour;

    private HourFactory(int h, int m, int s) {
        hour = stringyfier(h, m, s);
    }

    public String getHour() {
        return hour;
    }

    public static HourFactory fromSeconds(int s) {
        return new HourFactory(0, 0, s);
    }

    public static HourFactory fromMinutes(int m) {
        return new HourFactory(0, m, 0);
    }

    public static HourFactory fromHours(int h) {
        return new HourFactory(h, 0, 0);
    }

    private static String stringyfier(int h, int m, int s) {
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}

class main {
    public static void mainHour(String[] args) {
        HourFactory h = HourFactory.fromHours(1);
        System.out.println(h.getHour());
    }
}

