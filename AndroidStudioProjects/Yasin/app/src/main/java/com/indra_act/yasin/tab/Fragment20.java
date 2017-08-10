package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment20 extends Fragment {
    private TextView textCLick39;
    private TextView textCLick40;
    private MediaPlayer player;

    public Fragment20() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment20, container, false);

        textCLick39= (TextView) view.findViewById(R.id.ayat39_1);
        textCLick39  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(39);
            }
        });
        textCLick40 = (TextView) view.findViewById(R.id.ayat40_1);
        textCLick40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(40);

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
        if (arg == 39){

            player = MediaPlayer.create(getActivity(), R.raw.ayat39);

        }else if (arg == 40){
            player = MediaPlayer.create(getActivity(), R.raw.ayat40);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

