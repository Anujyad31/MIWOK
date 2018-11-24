package com.example.anujyadav.resfolderki;

public class word {
    private String miwok_word;
    private String eng_word;
    private int img1=0;
    private int img2;
    private int sound;



    public word(String miwok_word, String eng_word) {
        this.miwok_word = miwok_word;
        this.eng_word = eng_word;
    }

    public word(String miwok, String eng,int photo1,int photo2,int music){

        miwok_word=miwok;
        eng_word=eng;
        img1=photo1;
        img2=photo2;
        sound=music;
    };

    public int getImg2() {
        return img2;
    }

    public String getEng_word() {
        return eng_word;
    }

    public String getMiwok_word() {
        return miwok_word;
    }

    public int getSound() {
        return sound;
    }
    public int getImg() {
        return img1;
    }
    public boolean hasimg(){
        return img1 != 0;
    }
}
