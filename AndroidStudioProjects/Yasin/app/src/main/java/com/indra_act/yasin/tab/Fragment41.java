package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment41 extends Fragment {
    private TextView textCLick81;
    private TextView textCLick82;
    private MediaPlayer player;

    public Fragment41() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    
        View view = inflater.inflate(R.layout.fragment41, container, false);

        textCLick81= (TextView) view.findViewById(R.id.ayat81_1);
        textCLick81  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(81);
            }
        });
        textCLick82 = (TextView) view.findViewById(R.id.ayat82_1);
        textCLick82.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(82);

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
        if (arg == 81){

            player = MediaPlayer.create(getActivity(), R.raw.ayat81);

        }else if (arg == 82){
            player = MediaPlayer.create(getActivity(), R.raw.ayat82);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

