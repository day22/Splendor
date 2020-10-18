package edu.up.objectguitry;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splendor_run_test);

        EditText textBox = findViewById(R.id.printVals);
        Button testButton = findViewById(R.id.test_run);
        testButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        updateText();
        SplendorGameState firstInstance = new SplendorGameState();
        SplendorGameState secondInstance = new SplendorGameState(firstInstance);
        updateText(firstInstance);
        //actions
        SplendorGameState thirdInstance = new SplendorGameState();
        SplendorGameState fourthInstance = new SplendorGameState(thirdInstance);
        updateText(secondInstance);
        updateText(fourthInstance);

    }

    private void updateText(SplendorGameState gameState) {
        textBox.append(gameState.toString());
    }
    private void updateText() {
        textBox.setText("");
    }
}