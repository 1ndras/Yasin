package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment10 extends Fragment {
    private TextView textCLick19;
    private TextView textCLick20;
    private MediaPlayer player;

    public Fragment10() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment10, container, false);

        textCLick19= (TextView) view.findViewById(R.id.ayat19_1);
        textCLick19  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(19);
            }
        });
        textCLick20 = (TextView) view.findViewById(R.id.ayat20_1);
        textCLick20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(20);

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
        if (arg == 19){

            player = MediaPlayer.create(getActivity(), R.raw.ayat19);

        }else if (arg == 20){
            player = MediaPlayer.create(getActivity(), R.raw.ayat20);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

