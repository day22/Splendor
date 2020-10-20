package edu.up.objectguitry;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.charset.Charset;

import com.opencsv.CSVReader;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textBox;
    private Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splendor_run_test);

        this.textBox = findViewById(R.id.printVals);
        this.testButton = findViewById(R.id.test_run);
        this.testButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        InputStream rank1 = getResources().openRawResource(R.raw.rank1);
        InputStream rank2 = getResources().openRawResource(R.raw.rank2);
        InputStream rank3 = getResources().openRawResource(R.raw.rank3);

        updateText();
        SplendorGameState firstInstance = new SplendorGameState(rank1, rank2, rank3);
        SplendorGameState secondInstance = new SplendorGameState(firstInstance);
        updateText(firstInstance.);
        //actions
//        SplendorGameState thirdInstance = new SplendorGameState(rank1, rank2, rank3);
//        SplendorGameState fourthInstance = new SplendorGameState(thirdInstance);
//        updateText(secondInstance);
//        updateText(fourthInstance);

    }

    private void updateText(SplendorGameState gameState) {
        textBox.setText(gameState.toString());
    }
    private void updateText() {
        this.textBox.setText("");
    }
    private void updateText(String text) {
        textBox.setText(""+text);
    }
}