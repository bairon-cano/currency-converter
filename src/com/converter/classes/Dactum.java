package com.converter.classes;

public class Dactum {
   private final String name; //name of the value to convert
   private final double value; //this is the value of the "name" that has as reference "referenceName"
   private final String referenceName; //name of the value that will be converted


    public Dactum(String name, double value, String referenceCode) {
        this.name = name;
        this.referenceName = referenceCode;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getReferenceName() {
        return referenceName;
    }
   
}
