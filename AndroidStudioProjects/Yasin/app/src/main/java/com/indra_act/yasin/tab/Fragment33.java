package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment33 extends Fragment {
    private TextView textCLick65;
    private TextView textCLick66;
    private MediaPlayer player;

    public Fragment33() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment33, container, false);

        textCLick65= (TextView) view.findViewById(R.id.ayat65_1);
        textCLick65  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(65);
            }
        });
        textCLick66 = (TextView) view.findViewById(R.id.ayat66_1);
        textCLick66.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(66);

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
        if (arg == 65){

            player = MediaPlayer.create(getActivity(), R.raw.ayat65);

        }else if (arg == 66){
            player = MediaPlayer.create(getActivity(), R.raw.ayat66);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

