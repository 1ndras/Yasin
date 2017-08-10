package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment13 extends Fragment {
    private TextView textCLick25;
    private TextView textCLick26;
    private MediaPlayer player;

    public Fragment13() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment13, container, false);

        textCLick25= (TextView) view.findViewById(R.id.ayat25_1);
        textCLick25  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(25);
            }
        });
        textCLick26 = (TextView) view.findViewById(R.id.ayat26_1);
        textCLick26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(26);

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
        if (arg == 25){

            player = MediaPlayer.create(getActivity(), R.raw.ayat25);

        }else if (arg == 26){
            player = MediaPlayer.create(getActivity(), R.raw.ayat26);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

