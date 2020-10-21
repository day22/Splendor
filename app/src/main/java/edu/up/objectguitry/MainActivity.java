package edu.up.objectguitry;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.io.InputStream;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splendor_run_test);
        Log.d("onCreate","here");
        TextView textBox = findViewById(R.id.printVals);
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

        //actions

        SplendorGameState thirdInstance = new SplendorGameState(rank1, rank2, rank3);
        SplendorGameState fourthInstance = new SplendorGameState(thirdInstance);
        updateText(secondInstance);
        updateText(fourthInstance);
    }

    private void updateText(SplendorGameState gameState) {
        TextView textBox = findViewById(R.id.printVals);
        Log.d("update text 1 params","here");
        textBox.append(gameState.toString());
    }
    private void updateText() {
        TextView textBox = findViewById(R.id.printVals);
        textBox.setText("");
        Log.d("update text no params","here");
    }
}