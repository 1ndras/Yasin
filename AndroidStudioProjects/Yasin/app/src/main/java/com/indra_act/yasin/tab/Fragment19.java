package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment19 extends Fragment {
    private TextView textCLick37;
    private TextView textCLick38;
    private MediaPlayer player;

    public Fragment19() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment19, container, false);

        textCLick37= (TextView) view.findViewById(R.id.ayat37_1);
        textCLick37  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(37);
            }
        });
        textCLick38 = (TextView) view.findViewById(R.id.ayat38_1);
        textCLick38.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(38);

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
        if (arg == 37){

            player = MediaPlayer.create(getActivity(), R.raw.ayat37);

        }else if (arg == 38){
            player = MediaPlayer.create(getActivity(), R.raw.ayat38);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

