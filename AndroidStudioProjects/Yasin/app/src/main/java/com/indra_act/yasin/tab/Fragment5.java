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


import java.io.IOException;
import com.indra_act.yasin.R;

public class Fragment5 extends Fragment {
    private TextView textCLick11;
    private TextView textClick12;
    private MediaPlayer player;

    public Fragment5() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment5, container, false);

        textCLick11 = (TextView) view.findViewById(R.id.ayat11_1);
        textCLick11 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(11);
            }
        });

        textClick12 = (TextView) view.findViewById(R.id.ayat12_1);
        textClick12 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(12);
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
        if (arg == 11){

            player = MediaPlayer.create(getActivity(), R.raw.ayat11);

        }

        else if (arg == 12){
            player = MediaPlayer.create(getActivity(), R.raw.ayat12);
        }

        player.setLooping(false); // Set looping
        player.start();
    }
}

