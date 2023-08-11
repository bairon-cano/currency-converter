package com.converter.classes;

import java.util.ArrayList;

public class TimeConverter extends Converter {

    private final String second = "second(s)";
    private final String minute = "minute(s)";
    private final String hour = "hour(s)";
    private final String day = "day(s)";

    private final Dactum dayToHour = new Dactum(day, 24, hour);
    private final Dactum dayToMinute = new Dactum(day, 1440, minute);
    private final Dactum dayToSecond = new Dactum(day, 86400, second);

    private final Dactum hourToMinute = new Dactum(hour, 60, minute);
    private final Dactum hourToSecond = new Dactum(hour, 3600, second);

    private final Dactum minuteToSecond = new Dactum(minute, 60, second);

    public TimeConverter(String nameConverter) {
        super.setNameConverter(nameConverter);
        addData();
    }

    @Override
    public void addData() {
        listData.add(dayToHour);
        listData.add(dayToMinute);
        listData.add(dayToSecond);

        listData.add(hourToMinute);
        listData.add(hourToSecond);

        listData.add(minuteToSecond);
    }

    @Override
    public ArrayList<String> addListItems() {
        listItems.add(second);
        listItems.add(minute);
        listItems.add(hour);
        listItems.add(day);
        return listItems;
    }

}
