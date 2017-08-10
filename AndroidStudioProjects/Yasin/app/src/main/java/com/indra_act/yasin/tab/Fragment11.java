package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment11 extends Fragment {
    private TextView textCLick21;
    private TextView textCLick22;
    private MediaPlayer player;

    public Fragment11() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment11, container, false);

        textCLick21= (TextView) view.findViewById(R.id.ayat21_1);
        textCLick21  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(21);
            }
        });
        textCLick22 = (TextView) view.findViewById(R.id.ayat22_1);
        textCLick22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(22);

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
        if (arg == 21){

            player = MediaPlayer.create(getActivity(), R.raw.ayat21);

        }else if (arg == 22){
            player = MediaPlayer.create(getActivity(), R.raw.ayat22);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

