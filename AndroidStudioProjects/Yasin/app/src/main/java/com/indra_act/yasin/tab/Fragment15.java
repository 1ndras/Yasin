package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment15 extends Fragment {
    private TextView textCLick29;
    private TextView textCLick30;
    private MediaPlayer player;

    public Fragment15() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment15, container, false);

        textCLick29= (TextView) view.findViewById(R.id.ayat29_1);
        textCLick29  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(29);
            }
        });
        textCLick30 = (TextView) view.findViewById(R.id.ayat30_1);
        textCLick30.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(30);

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
        if (arg == 29){

            player = MediaPlayer.create(getActivity(), R.raw.ayat29);

        }else if (arg == 30){
            player = MediaPlayer.create(getActivity(), R.raw.ayat30);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

