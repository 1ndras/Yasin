package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment40 extends Fragment {
    private TextView textCLick79;
    private TextView textCLick80;
    private MediaPlayer player;

    public Fragment40() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    
        View view = inflater.inflate(R.layout.fragment40, container, false);

        textCLick79= (TextView) view.findViewById(R.id.ayat79_1);
        textCLick79  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(79);
            }
        });
        textCLick80 = (TextView) view.findViewById(R.id.ayat80_1);
        textCLick80.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(80);

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
        if (arg == 79){

            player = MediaPlayer.create(getActivity(), R.raw.ayat79);

        }else if (arg == 80){
            player = MediaPlayer.create(getActivity(), R.raw.ayat80);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

