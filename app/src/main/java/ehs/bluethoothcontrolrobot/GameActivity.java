package ehs.bluethoothcontrolrobot;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView txtView;

    MediaPlayer myPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        myPlayer = MediaPlayer.create(this, R.raw.bottle);
        txtView= (TextView) findViewById(R.id.textresult);
      /*  Button button = (Button) findViewById(R.id.butplay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(View v);
            }
        });*/


    ImageButton img1 = (ImageButton) findViewById(R.id.butbottle);
    img1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            result(1);
        }
    });

    ImageButton img2 = (ImageButton) findViewById(R.id.butpencil);
    img2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        result(2);
        }
        });
        }





    void result(int x){
        txtView.setEnabled(true);
        if(x==1){
            txtView.setText("Correct");
        }
       else if(x==2){
            txtView.setText("Incorrect");

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        myPlayer.release();
    }

    public void playMusic(View view) {
        myPlayer.start();

    }
}
