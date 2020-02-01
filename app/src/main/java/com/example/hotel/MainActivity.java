package com.example.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText username = findViewById(R.id.email);
        final TextView message = findViewById(R.id.msg);
        final EditText password = findViewById(R.id.password);
        final Button login = findViewById(R.id.login);
        final Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {

                                         if (username.getText().toString().equals("krishna") && password.getText().toString().equals("abc")) {
                                             myIntent.putExtra("id", username.getText().toString());
                                             startActivity(myIntent);

                                         } else {
                                             message.setText("incorrect username or password");
                                         }

                                     }

                                 }


        );
    }
}
