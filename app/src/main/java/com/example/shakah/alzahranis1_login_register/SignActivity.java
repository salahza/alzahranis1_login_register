package com.example.shakah.alzahranis1_login_register;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.shakah.alzahranis1_login_register.R;

public class SignActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_screen);
        Bundle i = getIntent().getExtras();
        String text = i.getString ( "name" );
        final TextView text1 = (TextView) findViewById(R.id.textView7);
// Now set this value to EditText
       text1.setText ( text );

    }
}
