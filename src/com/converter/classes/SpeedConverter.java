package com.converter.classes;

import java.util.ArrayList;

public class SpeedConverter extends Converter {

    private final String milePerHour = "mile per hour(mi/h)";
    private final String footPerSecond = "foot per second(ft/s)";
    private final String meterPerSecond = "meter per second(m/s)";
    private final String kilometerPerHour = "kilometer per hour(km/h)";
    private final String yardPerHour = "yard per hour(yd/h)";

    //meter per second to mile per hour
    private final Dactum msToMih = new Dactum(meterPerSecond, 2.23694, milePerHour);
    //meter per second to foot per second
    private final Dactum msToFts = new Dactum(meterPerSecond, 3.281, footPerSecond);
    //meter per second to kilometer per hour
    private final Dactum msToKmh = new Dactum(meterPerSecond, 3.6, kilometerPerHour);
    //meter per second to yard per hour
    private final Dactum msToYdh = new Dactum(meterPerSecond, 3937.007874, yardPerHour);

    //mile per hour to foot per second
    private final Dactum mihToFts = new Dactum(milePerHour, 1.46667, footPerSecond);
    //mile per hour to kilometer per hour
    private final Dactum mihToKmh = new Dactum(milePerHour, 1.60934, kilometerPerHour);
    //mile per hour to yard per hour
    private final Dactum mihToYdh = new Dactum(milePerHour, 1760, yardPerHour);

    //foot per second to kilometer per hour
    private final Dactum ftsToKmh = new Dactum(footPerSecond, 1.09728, kilometerPerHour);
    //foot per second to yard per hour
    private final Dactum ftsToYdh = new Dactum(footPerSecond, 1200, yardPerHour);

    //kilometer per hour to yard per hour
    private final Dactum kmhToYdh = new Dactum(kilometerPerHour, 1094, yardPerHour);

    public SpeedConverter(String nameConverter) {
        super.setNameConverter(nameConverter);
        addData();
    }

    @Override
    public void addData() {
        listData.add(msToMih);
        listData.add(msToFts);
        listData.add(msToKmh);
        listData.add(msToYdh);

        listData.add(mihToFts);
        listData.add(mihToKmh);
        listData.add(mihToYdh);

        listData.add(ftsToKmh);
        listData.add(ftsToYdh);

        listData.add(kmhToYdh);
    }

    @Override
    public ArrayList<String> addListItems() {
        listItems.add(milePerHour);
        listItems.add(footPerSecond);
        listItems.add(meterPerSecond);
        listItems.add(kilometerPerHour);
        listItems.add(yardPerHour);
        return listItems;
    }

}
