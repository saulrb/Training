package com.letcode.problems;

public class Farm {


    double wheat;
    double corn;
    double sorghum;
    double soy;
    String name;

    public Farm(String name,double wheat,double corn,double sorghum,double soy){
        this.wheat = wheat;
        this.corn = corn;
        this.soy = soy;
        this.sorghum = sorghum;
        this.name = name;
    }
    public double getWheat() {
        return wheat;
    }

    public void setWheat(double wheat) {
        this.wheat = wheat;
    }

    public double getCorn() {
        return corn;
    }

    public void setCorn(double corn) {
        this.corn = corn;
    }

    public double getSorghum() {
        return sorghum;
    }

    public void setSorghum(double sorghum) {
        this.sorghum = sorghum;
    }

    public double getSoy() {
        return soy;
    }

    public void setSoy(double soy) {
        this.soy = soy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "wheat=" + wheat +
                ", corn=" + corn +
                ", sorghum=" + sorghum +
                ", soy=" + soy +
                ", name='" + name + '\'' +
                '}';
    }

}
