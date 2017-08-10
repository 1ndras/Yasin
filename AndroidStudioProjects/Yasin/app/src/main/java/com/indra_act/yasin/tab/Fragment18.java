package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment18 extends Fragment {
    private TextView textCLick35;
    private TextView textCLick36;
    private MediaPlayer player;

    public Fragment18() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment18, container, false);

        textCLick35= (TextView) view.findViewById(R.id.ayat35_1);
        textCLick35  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(35);
            }
        });
        textCLick36 = (TextView) view.findViewById(R.id.ayat36_1);
        textCLick36.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(36);

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
        if (arg == 35){

            player = MediaPlayer.create(getActivity(), R.raw.ayat35);

        }else if (arg == 36){
            player = MediaPlayer.create(getActivity(), R.raw.ayat36);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

