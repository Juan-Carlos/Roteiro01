package com.example.juan.roteiro01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextoBemVindo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mTextoBemVindo = (TextView) findViewById(R.id.textoBemVindo);
        Bundle bundle = getIntent().getExtras();
        String usuario = bundle.getString("usuario");

        mTextoBemVindo.setText("Bem vindo "+usuario);
    }
}

