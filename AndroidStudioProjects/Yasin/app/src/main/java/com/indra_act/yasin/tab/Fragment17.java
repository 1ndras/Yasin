package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment17 extends Fragment {
    private TextView textCLick33;
    private TextView textCLick34;
    private MediaPlayer player;

    public Fragment17() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment17, container, false);

        textCLick33= (TextView) view.findViewById(R.id.ayat33_1);
        textCLick33  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(33);
            }
        });
        textCLick34 = (TextView) view.findViewById(R.id.ayat34_1);
        textCLick34.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(34);

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
        if (arg == 33){

            player = MediaPlayer.create(getActivity(), R.raw.ayat33);

        }else if (arg == 34){
            player = MediaPlayer.create(getActivity(), R.raw.ayat34);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

