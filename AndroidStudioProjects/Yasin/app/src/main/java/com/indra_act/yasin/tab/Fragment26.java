package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment26 extends Fragment {
    private TextView textCLick50;
    private TextView textCLick51;
    private MediaPlayer player;

    public Fragment26() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment26, container, false);

        textCLick50= (TextView) view.findViewById(R.id.ayat50_1);
        textCLick50  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(50);
            }
        });
        textCLick51 = (TextView) view.findViewById(R.id.ayat51_1);
        textCLick51.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(51);

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
        if (arg == 50){

            player = MediaPlayer.create(getActivity(), R.raw.ayat50);

        }else if (arg == 51){
            player = MediaPlayer.create(getActivity(), R.raw.ayat51);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

