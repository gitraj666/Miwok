package com.example.prithviraj.miwok;

/**
 * Created by PRITHVIRAJ on 08-01-2017.
 */

public class Word {

    public String mDefaultTranslation;

    public String mMiwoktranslation;

    public int mImageResourceId;

    public int mAudioResourceId;

    public Word(String DefaultTranslation,String MiwokTranslation,int image,int audio) {
        mDefaultTranslation = DefaultTranslation;
        mMiwoktranslation = MiwokTranslation;
        mImageResourceId = image;
        mAudioResourceId = audio;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation()
    {
        return mMiwoktranslation;
    }
    public int getImageResourceId() {return mImageResourceId;}
    public int getSoundResourceId(){return mAudioResourceId;}

}
