package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment25 extends Fragment {
    private TextView textCLick48;
    private TextView textCLick49;
    private MediaPlayer player;

    public Fragment25() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment25, container, false);

        textCLick48= (TextView) view.findViewById(R.id.ayat48_1);
        textCLick48  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(48);
            }
        });
        textCLick49 = (TextView) view.findViewById(R.id.ayat49_1);
        textCLick49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(49);

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
        if (arg == 48){

            player = MediaPlayer.create(getActivity(), R.raw.ayat48);

        }else if (arg == 49){
            player = MediaPlayer.create(getActivity(), R.raw.ayat49);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

