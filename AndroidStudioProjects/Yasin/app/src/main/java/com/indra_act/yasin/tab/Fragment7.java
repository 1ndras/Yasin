package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment7 extends Fragment {
    private TextView textCLick13;
    private TextView textCLick14;
    private MediaPlayer player;

    public Fragment7() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment7, container, false);

        textCLick13 = (TextView) view.findViewById(R.id.ayat13_1);
        textCLick13  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(13);
            }
        });
        textCLick14 = (TextView) view.findViewById(R.id.ayat14_1);
        textCLick14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(14);

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
        if (arg == 13){

            player = MediaPlayer.create(getActivity(), R.raw.ayat13);

        }else if (arg == 14){
            player = MediaPlayer.create(getActivity(), R.raw.ayat14);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

