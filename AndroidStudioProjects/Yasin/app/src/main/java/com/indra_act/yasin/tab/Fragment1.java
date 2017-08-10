package com.indra_act.yasin.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.net.Uri;

import java.io.IOException;

import com.indra_act.yasin.tab.Fragment2;

import com.indra_act.yasin.R;

public class Fragment1 extends Fragment {
    private TextView textCLick1;
    private TextView textCLick2;
    private TextView textCLick3;
    private TextView textCLick4;

    //private TextView snackbar1;

    private MediaPlayer player;

    public Fragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        textCLick1 = (TextView) view.findViewById(R.id.bismillah);
        textCLick1   .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);
            }
        });

        textCLick2 = (TextView) view.findViewById(R.id.ayat1_1);
        textCLick2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);

            }
        });

        textCLick3 = (TextView) view.findViewById(R.id.ayat2_1);
        textCLick3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });

        textCLick4 = (TextView) view.findViewById(R.id.ayat3_1);
        textCLick4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);

            }
        });

        //jika menggunakan Scnakbar pada bagian text bismillah
      //  snackbar1 = (TextView) view.findViewById(R.id.text1);
        //snackbar1.setOnClickListener(new View.OnClickListener() {

//            @Override
  //          public void onClick(View arg0) {
    //            Toast.makeText(getContext(), "Dengan menyebut nama Allah Yang Maha Pemurah lagi Maha Penyayang",Toast.LENGTH_LONG).show();
      //      }
        //});

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
                player.start();
                player.release();
            }
        }catch(Exception e){
        }

        if (arg == 1){

            player = MediaPlayer.create(getActivity(), R.raw.bismillah);

        }else if (arg == 2){

            player = MediaPlayer.create(getActivity(), R.raw.ayat1);

        }else if (arg == 3){
            player = MediaPlayer.create(getActivity(), R.raw.ayat2);

        }else if (arg == 4){
            player = MediaPlayer.create(getActivity(), R.raw.ayat3);
        }
        player.setLooping(false); // Set looping
        player.start();


    }
}

