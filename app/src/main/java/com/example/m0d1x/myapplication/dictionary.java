package com.example.m0d1x.myapplication;


public class dictionary {
    private String Word, Translate;
    private int PicID, SoundID;

    public String getWord() {
        return Word;
    }

    public dictionary(String word, String translate, int picID, int soundID) {
        Word = word;
        Translate = translate;
        PicID = picID;
        SoundID = soundID;
    }

    private void setWord(String word) {
        Word = word;
    }

    public String getTranslate() {
        return Translate;
    }

    public void setTranslate(String translate) {
        Translate = translate;
    }

    public int getPicID() {
        return PicID;
    }

    private void setPicID(int picID) {
        PicID = picID;
    }

    public int getSoundID() {
        return SoundID;
    }

    public void setSoundID(int soundID) {
        SoundID = soundID;
    }
}
