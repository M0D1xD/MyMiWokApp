package com.example.m0d1x.myapplication;


import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DictionaryAdapter extends ArrayAdapter<dictionary> {
    static class ViewHolder {
        ImageView picID;
        ImageView Play;
        TextView Word;
        TextView Transtation;

    }

//    private final int NR_OF_SIMULTANEOUS_SOUNDS = 15;
//    private final float LEFT_VOLUME = 1.0f;
//    private final float RIGHT_VOLUME = 1.0f;
//    private final int NO_LOOP = 0;
//    private final int PRIORITY = 0;
//    private final float NORMAL_PLAY_RATE = 1.0f;

    public static final String tag = "DictionaryAdapter";
    private Context mcontext;
    private int mResource;
    SoundPool mSoundPool;
    int mCSoundId;

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS =1;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;


    public DictionaryAdapter(Context context, int resource, ArrayList<dictionary> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mResource = resource;
    }

    @Override
    public View getView(int i, View converView, ViewGroup parent) {


        // Member Variables


        String aword = getItem(i).getWord();
        String atranstation = getItem(i).getTranslate();
        int picid = getItem(i).getPicID();
        int sound = getItem(i).getSoundID();

        dictionary d = new dictionary(aword, atranstation, picid, sound);

        //create the view result for showing the animation
        final View result;

        LayoutInflater infuLayoutInflater = LayoutInflater.from(mcontext);
        converView = infuLayoutInflater.inflate(mResource, parent, false);
        ViewHolder holder = new ViewHolder();
        holder.picID = (ImageView) converView.findViewById(R.id.img_pic);
        holder.Play = (ImageView) converView.findViewById(R.id.img_play);
        holder.Word = (TextView) converView.findViewById(R.id.txt_word);
        holder.Transtation = (TextView) converView.findViewById(R.id.txt_translation);

        converView.setTag(holder);
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        // Get the resource IDs to identify the sounds and store them in variables
        mCSoundId = mSoundPool.load(mcontext, d.getSoundID(), 1);
        holder.picID.setImageResource(d.getPicID());

        holder.Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });

        holder.Word.setText(d.getWord());
        holder.Transtation.setText(d.getTranslate());

        return converView;
    }
}
