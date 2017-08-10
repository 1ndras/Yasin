package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment8 extends Fragment {
    private TextView textCLick15   ;
    private TextView textCLick16;
    private MediaPlayer player;

    public Fragment8() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment8, container, false);

        textCLick15 = (TextView) view.findViewById(R.id.ayat15_1);
        textCLick15   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(15);
            }
        });
        textCLick16 = (TextView) view.findViewById(R.id.ayat16_1);
        textCLick16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(16);

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
        if (arg == 15){

            player = MediaPlayer.create(getActivity(), R.raw.ayat15);

        }else if (arg == 16){
            player = MediaPlayer.create(getActivity(), R.raw.ayat16);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

