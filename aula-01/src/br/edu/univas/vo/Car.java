package br.edu.univas.vo;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(color, modelYear, yearRelease);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return Objects.equals(color, other.color) &&
                modelYear == other.modelYear &&
                yearRelease == other.yearRelease;
    }
}
