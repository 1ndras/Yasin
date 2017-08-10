package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment28 extends Fragment {
    private TextView textCLick54;
    private TextView textCLick55;
    private MediaPlayer player;

    public Fragment28() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment28, container, false);

        textCLick54= (TextView) view.findViewById(R.id.ayat54_1);
        textCLick54  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(54);
            }
        });
        textCLick55 = (TextView) view.findViewById(R.id.ayat55_1);
        textCLick55.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(55);

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
        if (arg == 54){

            player = MediaPlayer.create(getActivity(), R.raw.ayat54);

        }else if (arg == 55){
            player = MediaPlayer.create(getActivity(), R.raw.ayat55);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

