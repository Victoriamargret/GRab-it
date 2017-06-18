package com.example.vik.grabbit;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class Gameover extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);


        TextView tv3 = (TextView) findViewById(R.id.textView5);

        TextView tv1 = (TextView) findViewById(R.id.textView6);

        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton4);

        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton5);


        int score = getIntent().getIntExtra("Score", 0);

        tv3.setText(score + " ");

        SharedPreferences settings = getSharedPreferences("GAME_DATA", Context.MODE_PRIVATE);

        int highScore = settings.getInt("HIGH SCORE", 0);


        if (score > highScore) {

            tv1.setText(" " + score);

            SharedPreferences.Editor editor = settings.edit();

            editor.putInt("HIGH SCORE", score);

            editor.commit();
        } else {

            tv1.setText(" " + highScore);

        }


        button3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(Gameover.this);

                alertDialogbuilder.setMessage("Are you sure, You wanted to Quit?");

                alertDialogbuilder.setCancelable(false);

                alertDialogbuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int id) {


                        Intent intent = new Intent(getApplicationContext(), Start.class);


                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                        intent.putExtra("EXIT", true);

                        startActivity(intent);
                        Start.mp1.stop();

                        finish();


                    }
                });


                alertDialogbuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();


                    }
                });


                AlertDialog alertDialog = alertDialogbuilder.create();

                alertDialog.setTitle("QUIT?");

                alertDialog.show();

            }

            ;

        });


        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(i);
                Start.mp1.start();
                finish();


            }

        });

    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == android.view.KeyEvent.KEYCODE_BACK) {
            exitByBackKey();
            return true;
        } else if (keyCode == android.view.KeyEvent.KEYCODE_HOME) {
           back();
            return true;
        } else {
            return false;

        }
    }


    protected boolean exitByBackKey() {


                Intent intent = new Intent(getApplicationContext(), Start.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
                finish();
                MainActivity.th.cancel();
        return true;
            }

    protected void back() {

        Start.mp1.stop();
        MainActivity.th.cancel();
        finish();

    }

}
























