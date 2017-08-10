package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment21 extends Fragment {
    private TextView textCLick41;
    private TextView textCLick42;
    private MediaPlayer player;

    public Fragment21() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment21, container, false);

        textCLick41= (TextView) view.findViewById(R.id.ayat41_1);
        textCLick41  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(41);
            }
        });
        textCLick42 = (TextView) view.findViewById(R.id.ayat42_1);
        textCLick42.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(42);

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
        if (arg == 41){

            player = MediaPlayer.create(getActivity(), R.raw.ayat41);

        }else if (arg == 42){
            player = MediaPlayer.create(getActivity(), R.raw.ayat42);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

