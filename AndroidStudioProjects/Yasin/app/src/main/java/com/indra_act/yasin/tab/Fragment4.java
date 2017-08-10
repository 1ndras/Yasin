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

public class Fragment4 extends Fragment {
    private TextView textCLick9;
    private TextView textCLick10;
    private MediaPlayer player;

    public Fragment4() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4, container, false);

        textCLick9 = (TextView) view.findViewById(R.id.ayat9_1);
        textCLick9   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(9);
            }
        });
        textCLick10 = (TextView) view.findViewById(R.id.ayat10_1);
        textCLick10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(10);

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
        if (arg == 9){

            player = MediaPlayer.create(getActivity(), R.raw.ayat9);

        }else if (arg == 10){
            player = MediaPlayer.create(getActivity(), R.raw.ayat10);

        }
        player.setLooping(false); // Set looping
        player.start();

    }
}