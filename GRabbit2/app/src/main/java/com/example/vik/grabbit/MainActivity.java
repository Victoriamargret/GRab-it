package com.example.vik.grabbit;

import android.support.v7.app.AlertDialog;


        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.CountDownTimer;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.view.KeyEvent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;

        import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    ImageButton b;
    public TextView ts, tk;
    int n = 0;
    public int k;
    public static int count = 0;
    Random rnd;
    public static CountDownTimer th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b = (ImageButton) findViewById(R.id.imageButton8);
        b1 = (ImageButton) findViewById(R.id.i1);
        b2 = (ImageButton) findViewById(R.id.i2);
        b3 = (ImageButton) findViewById(R.id.i3);
        b4 = (ImageButton) findViewById(R.id.i4);
        b5 = (ImageButton) findViewById(R.id.i5);
        b6 = (ImageButton) findViewById(R.id.i6);
        b7 = (ImageButton) findViewById(R.id.i7);
        b8 = (ImageButton) findViewById(R.id.i8);
        b9 = (ImageButton) findViewById(R.id.i9);
        ts = (TextView) findViewById(R.id.time);
        tk = (TextView) findViewById(R.id.score);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        th = new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                ts.setText(" " + millisUntilFinished / 1000);
            }

            public void onFinish() {

                final int score1 = count;
                Intent i = new Intent(MainActivity.this, Gameover.class);
                i.putExtra("Score", score1);
                startActivity(i);

            }


        };


    }


    public void startRand(View view) {
        b1.setImageResource(R.drawable.carrot8);
        b2.setImageResource(R.drawable.carrot2);
        b3.setImageResource(R.drawable.carrot4);
        b4.setImageResource(R.drawable.carrot6);
        b5.setImageResource(R.drawable.carrot8);
        b6.setImageResource(R.drawable.carrot5);
        b7.setImageResource(R.drawable.carrot4);
        b8.setImageResource(R.drawable.carrot2);
        b9.setImageResource(R.drawable.carrot8);
        count = 0;
        rd();
        th.start();

    }

    public int randomNumber(int a, int b) {
        rnd = new Random();
        int n = rnd.nextInt(9) + 1;
        return n;
    }

    public void rd() {

        randomNumber(1, 9);
        n = randomNumber(1, 9);
        k = 0;

        switch (n) {
            case 1:

                b1.setImageResource(R.drawable.bunny2);
                k = 1;

                break;


            case 2:
                b2.setImageResource(R.drawable.bunny2);
                k = 2;
                break;

            case 3:
                b3.setImageResource(R.drawable.bunny2);
                k = 3;
                break;

            case 4:
                b4.setImageResource(R.drawable.bunny2);
                k = 4;

                break;

            case 5:
                b5.setImageResource(R.drawable.bunny2);
                k = 5;

                break;

            case 6:


                b6.setImageResource(R.drawable.bunny2);
                k = 6;
                break;

            case 7:
                b7.setImageResource(R.drawable.bunny2);
                k = 7;
                break;

            case 8:


                b8.setImageResource(R.drawable.bunny2);
                k = 8;
                break;
            case 9:


                b9.setImageResource(R.drawable.bunny2);
                k = 9;
                break;


        }
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.i1:
                if (k == 1) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b1.setImageResource(R.drawable.carrot8);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i2:
                if (k == 2) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b2.setImageResource(R.drawable.carrot2);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i3:
                if (k == 3) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b3.setImageResource(R.drawable.carrot4);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i4:
                if (k == 4) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b4.setImageResource(R.drawable.carrot6);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i5:
                if (k == 5) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b5.setImageResource(R.drawable.carrot8);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i6:
                if (k == 6) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b6.setImageResource(R.drawable.carrot5);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i7:
                if (k == 7) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b7.setImageResource(R.drawable.carrot4);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i8:
                if (k == 8) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b8.setImageResource(R.drawable.carrot2);
                    k = 0;
                    rd();
                } else {

                }
                break;
            case R.id.i9:
                if (k == 9) {
                    count = count + 1;
                    tk.setText(String.valueOf(count));
                    b9.setImageResource(R.drawable.carrot8);
                    k = 0;
                    rd();
                } else {

                }
                break;


        }


    }

    protected void onDestroy() {
        super.onDestroy();


    }

    @Override

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            exitByBackKey();
            return true;
        }
        else if(keyCode == KeyEvent.KEYCODE_HOME){
            back();
            return true;
        }

        else{
            return false;

        }
    }


    protected boolean exitByBackKey() {

        AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogbuilder.setMessage("Are you sure, You wanted to quit");
        alertDialogbuilder.setCancelable(false);
        alertDialogbuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent(getApplicationContext(), Start.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
                finish();
                th.cancel();


            }
        });

        alertDialogbuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();


            }
        });


        AlertDialog alertDialog = alertDialogbuilder.create();
        alertDialog.setTitle("You pressed Back button");
        alertDialog.show();

        return false;
    }

    public void back()
    {
        Start.mp1.stop();
        finish();
        th.cancel();
    }
}








