package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment16 extends Fragment {
    private TextView textCLick31;
    private TextView textCLick32;
    private MediaPlayer player;

    public Fragment16() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment16, container, false);

        textCLick31= (TextView) view.findViewById(R.id.ayat31_1);
        textCLick31  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(31);
            }
        });
        textCLick32 = (TextView) view.findViewById(R.id.ayat32_1);
        textCLick32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(32);

            }
        });

        return view;
    }

    @Override
    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }


    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
        }
        if (arg == 31){

            player = MediaPlayer.create(getActivity(), R.raw.ayat31);

        }else if (arg == 32){
            player = MediaPlayer.create(getActivity(), R.raw.ayat32);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

