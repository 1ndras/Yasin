package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment12 extends Fragment {
    private TextView textCLick23;
    private TextView textCLick24;
    private MediaPlayer player;

    public Fragment12() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment12, container, false);

        textCLick23= (TextView) view.findViewById(R.id.ayat23_1);
        textCLick23  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(23);
            }
        });
        textCLick24 = (TextView) view.findViewById(R.id.ayat24_1);
        textCLick24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(24);

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
        if (arg == 23){

            player = MediaPlayer.create(getActivity(), R.raw.ayat23);

        }else if (arg == 24){
            player = MediaPlayer.create(getActivity(), R.raw.ayat24);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

