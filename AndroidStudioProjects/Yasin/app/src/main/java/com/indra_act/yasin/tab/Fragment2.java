package com.indra_act.yasin.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.net.Uri;

import com.indra_act.yasin.tab.Fragment1;


import java.io.IOException;
import com.indra_act.yasin.R;

public class Fragment2 extends Fragment {
    private TextView textCLick4;
    private TextView textCLick5;
    private TextView textCLick6;
    private MediaPlayer player;

    public Fragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        textCLick4 = (TextView) view.findViewById(R.id.ayat4_1);
        textCLick4   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);
            }
        });
        textCLick5 = (TextView) view.findViewById(R.id.ayat5_1);
        textCLick5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });
        textCLick6 = (TextView) view.findViewById(R.id.ayat6_1);
        textCLick6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

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
        if (arg == 4){

            player = MediaPlayer.create(getActivity(), R.raw.ayat4);

        }else if (arg == 5){
            player = MediaPlayer.create(getActivity(), R.raw.ayat5);

        }else if (arg == 6){
            player = MediaPlayer.create(getActivity(), R.raw.ayat6);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

