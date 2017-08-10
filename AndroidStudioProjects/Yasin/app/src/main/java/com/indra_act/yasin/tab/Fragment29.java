package com.indra_act.yasin.tab;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.indra_act.yasin.R;

public class Fragment29 extends Fragment {
    private TextView textCLick56;
    private TextView textCLick57;
    private TextView textCLick58;
    private MediaPlayer player;

    public Fragment29() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment29, container, false);

        textCLick56= (TextView) view.findViewById(R.id.ayat56_1);
        textCLick56  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(56);
            }
        });
        textCLick57 = (TextView) view.findViewById(R.id.ayat57_1);
        textCLick57.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(57);

            }
        });


        textCLick58 = (TextView) view.findViewById(R.id.ayat58_1);
        textCLick58.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(58);

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
        if (arg == 56){

            player = MediaPlayer.create(getActivity(), R.raw.ayat56);

        }else if (arg == 57){
            player = MediaPlayer.create(getActivity(), R.raw.ayat57);

        }else if (arg == 58) {
            player = MediaPlayer.create(getActivity(), R.raw.ayat58);

        }
        player.setLooping(false); // Set looping
        player.start();
    }
}

