package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment36 extends Fragment {
    private TextView textCLick71;
    private TextView textCLick72;
    private MediaPlayer player;

    public Fragment36() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment36, container, false);

        textCLick71= (TextView) view.findViewById(R.id.ayat71_1);
        textCLick71  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(71);
            }
        });
        textCLick72 = (TextView) view.findViewById(R.id.ayat72_1);
        textCLick72.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(72);

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
        if (arg == 71){

            player = MediaPlayer.create(getActivity(), R.raw.ayat71);

        }else if (arg == 72){
            player = MediaPlayer.create(getActivity(), R.raw.ayat72);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

