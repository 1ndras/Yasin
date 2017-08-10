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

public class Fragment3 extends Fragment {
    private TextView textCLick7;
    private TextView textCLick8;
    private MediaPlayer player;

    public Fragment3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);

        textCLick7 = (TextView) view.findViewById(R.id.ayat7_1);
        textCLick7   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(7);
            }
        });
        textCLick8 = (TextView) view.findViewById(R.id.ayat8_1);
        textCLick8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(8);

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
        if (arg == 7){

            player = MediaPlayer.create(getActivity(), R.raw.ayat7);

        }else if (arg == 8){
            player = MediaPlayer.create(getActivity(), R.raw.ayat8);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

