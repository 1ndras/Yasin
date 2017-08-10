package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment30 extends Fragment {
    private TextView textCLick59;
    private TextView textCLick60;
    private MediaPlayer player;

    public Fragment30() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment30, container, false);

        textCLick59= (TextView) view.findViewById(R.id.ayat59_1);
        textCLick59  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(59);
            }
        });
        textCLick60 = (TextView) view.findViewById(R.id.ayat60_1);
        textCLick60.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(60);

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
        if (arg == 59){

            player = MediaPlayer.create(getActivity(), R.raw.ayat59);

        }else if (arg == 60){
            player = MediaPlayer.create(getActivity(), R.raw.ayat60);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

