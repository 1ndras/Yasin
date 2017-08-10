package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment38 extends Fragment {
    private TextView textCLick75;
    private TextView textCLick76;
    private MediaPlayer player;

    public Fragment38() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment38, container, false);

        textCLick75= (TextView) view.findViewById(R.id.ayat75_1);
        textCLick75  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(75);
            }
        });
        textCLick76 = (TextView) view.findViewById(R.id.ayat76_1);
        textCLick76.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(76);

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
        if (arg == 75){

            player = MediaPlayer.create(getActivity(), R.raw.ayat75);

        }else if (arg == 76){
            player = MediaPlayer.create(getActivity(), R.raw.ayat76);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

