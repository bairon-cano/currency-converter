package com.converter.classes;

import java.util.ArrayList;

public class LengthConverter extends Converter {

    private final String centimeter = "centimeter(cm)";
    private final String meter = "meter(m)";
    private final String yard = "yard(yd)";
    private final String kilometer = "kilometer(km)";
    private final String mile = "mile(mi)";

    private final Dactum miToKilometer = new Dactum(mile, 1.60934, kilometer);
    private final Dactum miToMeter = new Dactum(mile, 1609, meter);
    private final Dactum miToYard = new Dactum(mile, 1760, yard);
    private final Dactum miToCentimer = new Dactum(mile, 160900, centimeter);

    private final Dactum kmToMeter = new Dactum(kilometer, 1000, meter);
    private final Dactum kmToYard = new Dactum(kilometer, 1094, yard);
    private final Dactum kmToCentimer = new Dactum(kilometer, 100000, centimeter);

    private final Dactum meterToYard = new Dactum(meter, 1.094, yard);
    private final Dactum meterToCentimer = new Dactum(meter, 100, centimeter);

    private final Dactum yardToCentimer = new Dactum(yard, 91.44, centimeter);

    public LengthConverter(String nameConverter) {
        super.setNameConverter(nameConverter);
        addData();
    }

    @Override
    public void addData() {
        listData.add(miToKilometer);
        listData.add(miToMeter);
        listData.add(miToYard);
        listData.add(miToCentimer);

        listData.add(kmToMeter);
        listData.add(kmToYard);
        listData.add(kmToCentimer);

        listData.add(meterToYard);
        listData.add(meterToCentimer);

        listData.add(yardToCentimer);
    }

    @Override
    public ArrayList<String> addListItems() {
        listItems.add(centimeter);
        listItems.add(meter);
        listItems.add(yard);
        listItems.add(kilometer);
        listItems.add(mile);
        return listItems;
    }

}
