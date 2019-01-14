package com.modules;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties({"height", "weight"})
public class Vitals {

    private String date;
    private String height;
    private String weight;

    @JsonSetter("bodyIndex")
    private String bmi;
    private String a1c;

    @JsonIgnore
    private String bpSystolic;
    private String bpDiastolic;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getA1c() {
        return a1c;
    }

    public void setA1c(String a1c) {
        this.a1c = a1c;
    }

    public String getBpSystolic() {
        return bpSystolic;
    }

    public void setBpSystolic(String bpSystolic) {
        this.bpSystolic = bpSystolic;
    }

    public String getBpDiastolic() {
        return bpDiastolic;
    }

    public void setBpDiastolic(String bpDiastolic) {
        this.bpDiastolic = bpDiastolic;
    }

    @Override
    public String toString() {
        return "Vitals{" +
                "date='" + date + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", bmi='" + bmi + '\'' +
                ", a1c='" + a1c + '\'' +
                ", bpSystolic='" + bpSystolic + '\'' +
                ", bpDiastolic='" + bpDiastolic + '\'' +
                '}';
    }
}
