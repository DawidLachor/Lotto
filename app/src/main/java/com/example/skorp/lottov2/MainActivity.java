package com.example.skorp.lottov2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<Integer> list = new ArrayList<Integer>();

                for (int i = 1; i <= 49; i++){
                    list.add(i);
                }

                Collections.shuffle(list);

                ArrayList<Integer> chosen = new ArrayList<Integer>();

                for (int i = 0; i < 6; i++){
                    chosen.add(list.get(i));
                }

                Collections.sort(chosen);

                StringBuilder stringBuilder = new StringBuilder();
                for (int i: chosen){
                    stringBuilder.append(String.valueOf(i));
                    stringBuilder.append(", ");
                }

                textView.setText(stringBuilder.toString().replaceAll(", $", ""));
            }
        });
    }
}
