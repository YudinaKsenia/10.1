package ru.netology.qa;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    private int minVolume;
    private int maxVolume;

    private int minRadioStation;
    private int maxRadioStation;

    public Radio() {

        this.maxRadioStation = 9;
        this.minRadioStation = 0;

        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public Radio(int numberOfStations) {
        this.maxRadioStation = numberOfStations - 1;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void previousRadioStation() {

        if (currentRadioStation != minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
