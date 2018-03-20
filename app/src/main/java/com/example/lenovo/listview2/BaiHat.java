package com.example.lenovo.listview2;

/**
 * Created by Lenovo on 07-Mar-18.
 */

public class BaiHat {
    private int imgSong, imgEye, imgLike, imgDisLike;
    private String nameSong, nameSinger, numberOfView, numberOfLike, numberOfDisLike;

    public BaiHat(int imgSong, int imgEye, int imgLike, int imgDisLike, String nameSong,
                  String nameSinger, String numberOfView, String numberOfLike, String numberOfDisLike) {
        this.imgSong = imgSong;
        this.imgEye = imgEye;
        this.imgLike = imgLike;
        this.imgDisLike = imgDisLike;
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.numberOfView = numberOfView;
        this.numberOfLike = numberOfLike;
        this.numberOfDisLike = numberOfDisLike;
    }

    public void setImgSong(int imgSong) {
        this.imgSong = imgSong;
    }

    public void setImgEye(int imgEye) {
        this.imgEye = imgEye;
    }

    public void setImgLike(int imgLike) {
        this.imgLike = imgLike;
    }

    public void setImgDisLike(int imgDisLike) {
        this.imgDisLike = imgDisLike;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public void setNumberOfView(String numberOfView) {
        this.numberOfView = numberOfView;
    }

    public void setNumberOfLike(String numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public void setNumberOfDisLike(String numberOfDisLike) {
        this.numberOfDisLike = numberOfDisLike;
    }

    public int getImgSong() {
        return imgSong;
    }

    public int getImgEye() {
        return imgEye;
    }

    public int getImgLike() {
        return imgLike;
    }

    public int getImgDisLike() {
        return imgDisLike;
    }

    public String getNameSong() {
        return nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public String getNumberOfView() {
        return numberOfView;
    }

    public String getNumberOfLike() {
        return numberOfLike;
    }

    public String getNumberOfDisLike() {
        return numberOfDisLike;
    }
}
