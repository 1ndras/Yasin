package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment27 extends Fragment {
    private TextView textCLick52;
    private TextView textCLick53;
    private MediaPlayer player;

    public Fragment27() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment27, container, false);

        textCLick52= (TextView) view.findViewById(R.id.ayat52_1);
        textCLick52  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(52);
            }
        });
        textCLick53 = (TextView) view.findViewById(R.id.ayat53_1);
        textCLick53.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(53);

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
        if (arg == 52){

            player = MediaPlayer.create(getActivity(), R.raw.ayat52);

        }else if (arg == 53){
            player = MediaPlayer.create(getActivity(), R.raw.ayat53);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

