package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment9 extends Fragment {
    private TextView textCLick17;
    private TextView textCLick18;
    private MediaPlayer player;

    public Fragment9() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment9, container, false);

        textCLick17 = (TextView) view.findViewById(R.id.ayat17_1);
        textCLick17   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(17);
            }
        });
        textCLick18 = (TextView) view.findViewById(R.id.ayat18_1);
        textCLick18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(18);

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
        if (arg == 17){

            player = MediaPlayer.create(getActivity(), R.raw.ayat17);

        }else if (arg == 18){
            player = MediaPlayer.create(getActivity(), R.raw.ayat18);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

