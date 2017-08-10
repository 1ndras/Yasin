package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment35 extends Fragment {
    private TextView textCLick69;
    private TextView textCLick70;
    private MediaPlayer player;

    public Fragment35() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment35, container, false);

        textCLick69= (TextView) view.findViewById(R.id.ayat69_1);
        textCLick69  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(69);
            }
        });
        textCLick70 = (TextView) view.findViewById(R.id.ayat70_1);
        textCLick70.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(70);

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
        if (arg == 69){

            player = MediaPlayer.create(getActivity(), R.raw.ayat69);

        }else if (arg == 70){
            player = MediaPlayer.create(getActivity(), R.raw.ayat70);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

