package com.example.ero.homework2222;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2ActivitySecond extends AppCompatActivity {

    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_second);

        String value = getIntent().getExtras().getString(MainActivity.KEY);

        editText1 = findViewById(R.id.edit1);
        final Button backButton = findViewById(R.id.backButton);
        editText1.setText(value);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("aaaa", editText1.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}