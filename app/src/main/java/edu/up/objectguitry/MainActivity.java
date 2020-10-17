package edu.up.objectguitry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splendor_run_test);

        String test = readFile();

    }

    private String readFile() {
        File fileEvents = new File("edu/up/objectguitry/rank1");
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileEvents));
            String line;
            while ((line = br.readLine())!= null) {
                Log.i("",""+line);
            }
            br.close();
        } catch (IOException e) { }
        String result = text.toString();
        return result;

    }

    @Override
    public void onClick(View view) {
        updateText();
    }

    private void updateText() {
        //splGameState.toString();
    }
}