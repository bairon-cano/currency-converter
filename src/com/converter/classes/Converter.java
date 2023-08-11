package com.converter.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public abstract class Converter {

    private String nameConverter;
    protected ArrayList<Dactum> listData; // data array, where each object contains 
                                              // important information for the conversion
    protected ArrayList<String> listItems = new ArrayList<>(); //list of items to convert

    public Converter() {
        this.nameConverter = "";
        this.listData = new ArrayList<>();
    }

    public abstract void addData(); //abstract method to add the data to "listData"

    public abstract ArrayList<String> addListItems(); //abstract method to add the data to "listItems"

    protected double roundResult(double value, int numDecimals) {
        return new BigDecimal(value).setScale(numDecimals, RoundingMode.HALF_UP).doubleValue();
    }

    public double calculateValue(double valueToConvert, String converterName, String convertedName) throws ImpossibleConversion {
        for (Dactum dactum : listData) {
            if (converterName.equals(convertedName)) {
                throw new ImpossibleConversion("The value is the same");
            }
            if (converterName.equals(dactum.getName()) && convertedName.equals(dactum.getReferenceName())) {
                return roundResult(valueToConvert * dactum.getValue(), 3);
            }
            if (converterName.equals(dactum.getReferenceName()) && convertedName.equals(dactum.getName())) {
                return roundResult(valueToConvert / dactum.getValue(), 3);
            }
        }
        throw new ImpossibleConversion("Conversion may not be possible");
    }

    public String getNameConverter() {
        return nameConverter;
    }

    public void setNameConverter(String nameConverter) {
        this.nameConverter = nameConverter;
    }

}
