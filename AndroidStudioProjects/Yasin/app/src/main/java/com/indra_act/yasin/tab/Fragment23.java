package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment23 extends Fragment {
    private TextView textCLick45;
    private TextView textCLick46;
    private MediaPlayer player;

    public Fragment23() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment23, container, false);

        textCLick45= (TextView) view.findViewById(R.id.ayat45_1);
        textCLick45  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(45);
            }
        });
        textCLick46 = (TextView) view.findViewById(R.id.ayat46_1);
        textCLick46.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(46);

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
        if (arg == 45){

            player = MediaPlayer.create(getActivity(), R.raw.ayat45);

        }else if (arg == 46){
            player = MediaPlayer.create(getActivity(), R.raw.ayat46);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

