package com.converter.classes;

import java.util.ArrayList;

public final class TemperatureConverter extends Converter {

    private final String celsiusDegree = "°C(Celsius)";
    private final String fahrenheitDegrees = "°F(Fahrenheit)";
    private final String kelvinDegrees = "K(Kelvin)";

    private final Dactum celsiusToFahrenheit = new Dactum(celsiusDegree, 32, fahrenheitDegrees);
    private final Dactum celsiusToKelvin = new Dactum(celsiusDegree, 273.15, kelvinDegrees);
    private final Dactum fahrenheitToKelvin = new Dactum(fahrenheitDegrees, 273.15, kelvinDegrees);

    public TemperatureConverter(String nameConverter) {
        super.setNameConverter(nameConverter);
        addData();
    }

    @Override
    public double calculateValue(double valueToConvert, String converterName, String convertedName) throws ImpossibleConversion {
        if (converterName.equals(convertedName)) {
            throw new ImpossibleConversion("The value is the same");
        }

        //this conditions are the formulas to know the result depending of the entries
        if (converterName.equals((this.celsiusDegree)) && convertedName.equals(this.fahrenheitDegrees)) {
            return super.roundResult((valueToConvert * 9 / 5) + this.celsiusToFahrenheit.getValue(), 2);
        }

        if (converterName.equals((this.fahrenheitDegrees)) && convertedName.equals(this.celsiusDegree)) {
            return super.roundResult(((valueToConvert - this.celsiusToFahrenheit.getValue()) * 5 / 9), 2);
        }

        if (converterName.equals((this.celsiusDegree)) && convertedName.equals(this.kelvinDegrees)) {
            return super.roundResult(valueToConvert + this.celsiusToKelvin.getValue(), 2);
        }

        if (converterName.equals((this.kelvinDegrees)) && convertedName.equals(this.celsiusDegree)) {
            return super.roundResult(valueToConvert - this.celsiusToKelvin.getValue(), 2);
        }

        if (converterName.equals((this.fahrenheitDegrees)) && convertedName.equals(this.kelvinDegrees)) {
            return super.roundResult((valueToConvert - 32) * (5 / 9) + this.fahrenheitToKelvin.getValue(), 2);
        }

        if (converterName.equals((this.kelvinDegrees)) && convertedName.equals(this.fahrenheitDegrees)) {
            return super.roundResult((valueToConvert - this.fahrenheitToKelvin.getValue()) * 9 / 5 + 32, 2);
        }

        throw new ImpossibleConversion("Conversion may not be possible");
    }

    @Override
    public void addData() {
        listData.add(celsiusToFahrenheit);
        listData.add(celsiusToKelvin);
        listData.add(fahrenheitToKelvin);
    }

    @Override
    public ArrayList<String> addListItems() {
        listItems.add(celsiusDegree);
        listItems.add(fahrenheitDegrees);
        listItems.add(kelvinDegrees);
        return listItems;
    }
}
