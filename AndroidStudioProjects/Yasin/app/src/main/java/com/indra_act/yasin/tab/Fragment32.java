package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment32 extends Fragment {
    private TextView textCLick63;
    private TextView textCLick64;
    private MediaPlayer player;

    public Fragment32() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment32, container, false);

        textCLick63= (TextView) view.findViewById(R.id.ayat63_1);
        textCLick63  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(63);
            }
        });
        textCLick64 = (TextView) view.findViewById(R.id.ayat64_1);
        textCLick64.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(64);

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
        if (arg == 63){

            player = MediaPlayer.create(getActivity(), R.raw.ayat63);

        }else if (arg == 64){
            player = MediaPlayer.create(getActivity(), R.raw.ayat64);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

