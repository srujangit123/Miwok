package com.example.android.miwokapp;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    private int mAudioResourceId;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image for the miwok and default word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @return boolean to check if object has image.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioId;
    }



    //Constructor overloading
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioId;
    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image of the word.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getAudioResourceId(){ return mAudioResourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}