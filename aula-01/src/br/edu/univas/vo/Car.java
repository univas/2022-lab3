package br.edu.univas.vo;

public class Car {

    private String color;
    private int modelYear;
    private int yearRelease;
    private int currentSpeed;

    public void accelerate(int factor) {
        currentSpeed += factor;
    }

    public void toBreak(int factor) {
        if (factor <= currentSpeed) {
            currentSpeed -= factor;
        } else {
            currentSpeed = 0;
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
