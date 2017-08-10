package com.indra_act.yasin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;
import android.view.Menu;

import android.support.v7.app.AlertDialog;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn1 = (Button) findViewById(R.id.btnstart);

        btn1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent a = new Intent(getApplicationContext(), MainActivity.class);


                startActivity(a);


            }

        });
        Button btn2 = (Button) findViewById(R.id.btninfo);

        btn2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), About.class);

                startActivity(i);


            }

        });
        Button btn3 = (Button) findViewById(R.id.btnexit);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                AlertDialog.Builder alertexit = new AlertDialog.Builder(
                        MenuActivity.this);

                alertexit
                        .setMessage("Apakah Anda Akan Keluar Dari Aplikasi YASIN?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Keluar")
                        .setCancelable(false)
                        .setPositiveButton("Ya",
                                new AlertDialog.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0,
                                                        int arg1) {
                                        System.exit(0);
                                    }
                                })
                        .setNegativeButton("Tidak",
                                new AlertDialog.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog a = alertexit.create();
                a.show();
            }
        });
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Keluar")
                .setMessage("Apakah Anda Akan Keluar Dari Aplikasi YASIN?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MenuActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }
}