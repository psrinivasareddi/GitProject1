package edu.vidyanikethan.test05101531;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clkmethod(View view) {
        Toast.makeText(this,"Hai Srinivasa Reddi",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Great",Toast.LENGTH_LONG).show();

    }
}