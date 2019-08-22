package com.unava.dia.espresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtClick(View view) {
        TextView tv = findViewById(R.id.tv);
        EditText et = findViewById(R.id.et);
        tv.setText(et.getText().toString());
    }
}
