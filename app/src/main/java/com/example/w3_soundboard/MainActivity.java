package com.example.w3_soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button workwork = (Button) this.findViewById(R.id.buttonWorkWork);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.workwork3);
        Button yesmlord = (Button) this.findViewById(R.id.buttonYesMLord);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.yesmlord);
        Button whatisit = (Button) this.findViewById(R.id.buttonWhatIsIt);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.whaisit);
        Button moarwork = (Button) this.findViewById(R.id.buttonMoarWork);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.moarwork);
        Button wha = (Button) this.findViewById(R.id.buttonWhu);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.wha);

        Button yesmlord2 = (Button) this.findViewById(R.id.buttonYesMLord2);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.yesmlord2);
        Button allright = (Button) this.findViewById(R.id.buttonAllRight);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.allright);
        Button offigo = (Button) this.findViewById(R.id.buttonOffIGoThen);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.offigothen);
        Button iguess = (Button) this.findViewById(R.id.buttonIGuessICan);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.iguessican);
        Button ifyouwant = (Button) this.findViewById(R.id.buttonIfYouWant);
        final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.ifyouwant);

        Button nooneelse = (Button) this.findViewById(R.id.buttonNooneElse);
        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.nooneelseavailable);
        Button thatsit = (Button) this.findViewById(R.id.buttonThatsIt);
        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.thatsitimdead);
        Button readytowork = (Button) this.findViewById(R.id.buttonReadyToWork);
        final MediaPlayer mp13 = MediaPlayer.create(this, R.raw.readytowork);
        Button aaaaahia = (Button) this.findViewById(R.id.buttonAaaaahia);
        final MediaPlayer mp14 = MediaPlayer.create(this, R.raw.aahaiai);
        Button youaretheking = (Button) this.findViewById(R.id.buttonYouAreTheKing);
        final MediaPlayer mp15 = MediaPlayer.create(this, R.raw.yoadakingididntvoreforyou);

        Button wefound = (Button) this.findViewById(R.id.buttonWeFoundAWitch);
        final MediaPlayer mp16 = MediaPlayer.create(this, R.raw.wefoundawitchmayweburnher);
        Button repressed = (Button) this.findViewById(R.id.buttonRepressed);
        final MediaPlayer mp17 = MediaPlayer.create(this, R.raw.helphelpimbeingrepressed);
        Button ahorsekickedme = (Button) this.findViewById(R.id.buttonAHorseKickedMe);
        final MediaPlayer mp18 = MediaPlayer.create(this, R.raw.ahorsekickemeoneithurt);
        Button dooh = (Button) this.findViewById(R.id.buttonDooh);
        final MediaPlayer mp19 = MediaPlayer.create(this, R.raw.dooh);


        //event listeners section one------------------------------------------------
        workwork.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp1.start();
            }
        });
        yesmlord.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp2.start();
            }
        });
        whatisit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp3.start();
            }
        });
        moarwork.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp4.start();
            }
        });
        wha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp5.start();
            }
        });

        //event listeners section two------------------------------------------------
        yesmlord2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp6.start();
            }
        });
        allright.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp7.start();
            }
        });
        offigo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp8.start();
            }
        });
        iguess.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp9.start();
            }
        });
        ifyouwant.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp10.start();
            }
        });

        //event listeners section three------------------------------------------------
        nooneelse.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp11.start();
            }
        });
        thatsit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp12.start();
            }
        });
        readytowork.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp13.start();
            }
        });
        aaaaahia.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp14.start();
            }
        });
        youaretheking.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp15.start();
            }
        });

        //event listeners section four------------------------------------------------
        wefound.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp16.start();
            }
        });
        repressed.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp17.start();
            }
        });
        ahorsekickedme.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp18.start();
            }
        });
        dooh.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp19.start();
            }
        });





    }


}


