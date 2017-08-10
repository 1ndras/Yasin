package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment14 extends Fragment {
    private TextView textCLick27;
    private TextView textCLick28;
    private MediaPlayer player;

    public Fragment14() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment14, container, false);

        textCLick27= (TextView) view.findViewById(R.id.ayat27_1);
        textCLick27  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(27);
            }
        });
        textCLick28 = (TextView) view.findViewById(R.id.ayat28_1);
        textCLick28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(28);

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
        if (arg == 27){

            player = MediaPlayer.create(getActivity(), R.raw.ayat27);

        }else if (arg == 28){
            player = MediaPlayer.create(getActivity(), R.raw.ayat28);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

