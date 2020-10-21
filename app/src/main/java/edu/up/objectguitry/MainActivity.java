package edu.up.objectguitry;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.io.InputStream;







public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textBox = findViewById(R.id.printVals);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splendor_run_test);
        Log.d("onCreate","here");
        Button testButton = findViewById(R.id.test_run);
        testButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        InputStream rank1 = getResources().openRawResource(R.raw.rank1);
        InputStream rank2 = getResources().openRawResource(R.raw.rank2);
        InputStream rank3 = getResources().openRawResource(R.raw.rank3);

        Log.d("onClick","here");
        updateText();
        SplendorGameState firstInstance = new SplendorGameState(rank1, rank2, rank3);
        SplendorGameState secondInstance = new SplendorGameState(firstInstance);
        updateText(firstInstance);

        textBox.append("Player 1 will take two Ruby Coins, is this action legal: " + firstInstance.coinAction(0));
        textBox.append("Player 2 will take 1 Sapphire, Emerald, and Diamond coin, is this action legal: "+firstInstance.coinAction(1, 2, 3));
        textBox.append("Player 3 will reserve a rank 1 card, is this action legal: "+firstInstance.reserveAction(firstInstance.getBoard(2,1)));
        textBox.append("Player 4 will reserve a rank 1 card, is this action legal: "+firstInstance.cardAction(firstInstance.getBoard(2, 4)));

        //actions

        InputStream rank11 = getResources().openRawResource(R.raw.rank1);
        InputStream rank22 = getResources().openRawResource(R.raw.rank2);
        InputStream rank33 = getResources().openRawResource(R.raw.rank3);
        SplendorGameState thirdInstance = new SplendorGameState(rank11, rank22, rank33);
        SplendorGameState fourthInstance = new SplendorGameState(thirdInstance);
        updateText(secondInstance);
        updateText(fourthInstance);
    }

    private void updateText(SplendorGameState gameState) {
        Log.d("update text 1 params","here");
        textBox.append(gameState.toString());
    }
    private void updateText() {
        textBox.setText("");
        textBox.setText("For the sake of testing, all players will be given 4 coins to be able to buy cards");
        Log.d("update text no params","here");
    }
}