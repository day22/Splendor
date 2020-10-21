package edu.up.objectguitry;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splendor_run_test);

         this.textBox = findViewById(R.id.printVals);

        Button testButton = findViewById(R.id.test_run);
        testButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        InputStream rank1 = getResources().openRawResource(R.raw.rank1);
        InputStream rank2 = getResources().openRawResource(R.raw.rank2);
        InputStream rank3 = getResources().openRawResource(R.raw.rank3);
        updateText();
        SplendorGameState firstInstance = new SplendorGameState(rank1, rank2, rank3);
        SplendorGameState secondInstance = new SplendorGameState(firstInstance);
        updateText(firstInstance);

        textBox.append("\nPlayer 1 will take two Ruby Coins, is this action legal: " + firstInstance.coinAction(0)+"\n");
        textBox.append("Player 2 will take 1 Sapphire, Emerald, and Diamond coin, is this action legal: "+firstInstance.coinAction(1, 2, 3)+"\n");
        textBox.append("Player 3 will reserve a rank 1 card, is this action legal: "+firstInstance.reserveAction(firstInstance.getBoard(2,1))+"\n");
        textBox.append("Player 4 will buy a rank 1 card, is this action legal: "+firstInstance.cardAction(firstInstance.getBoard(2, 2))+"\n");

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
        this.textBox.append(gameState.toString());
    }
    private void updateText() {
        this.textBox.setText("");
        this.textBox.setText("For the sake of testing, all players will be given 4 coins to be able to buy cards");
    }
}