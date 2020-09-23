package com.example.shakah.alzahranis1_login_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shakah.alzahranis1_login_register.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends AppCompatActivity {
    String name,familyname,Email,Password,DOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_screen);
    }
    //Registration button
    public void userRegistration(View v){
        final EditText text = (EditText)findViewById(R.id.editText);
        final EditText text1 = (EditText)findViewById(R.id.editText2);
        final EditText text2 = (EditText)findViewById(R.id.editText3);
        final EditText text3 = (EditText)findViewById(R.id.editText4);
        final EditText text4 = (EditText)findViewById(R.id.editText5);
        name=text.getText().toString();
        familyname=text1.getText().toString();
        Email=text3.getText().toString().trim();
        Password=text4.getText().toString();
        DOB=text2.getText().toString();
        //validation checks
        if(TextUtils.isEmpty(name)||TextUtils.isEmpty(familyname)||TextUtils.isEmpty(Email)||TextUtils.isEmpty(Password)||TextUtils.isEmpty(DOB)) {
            Toast.makeText(Register.this, "Enter all information", Toast.LENGTH_SHORT).show();

        }
else if
             (name.length()<3||name.length()>30){Toast.makeText(Register.this,"First name should be greter value than3 and less than 30", Toast.LENGTH_SHORT).show();
           }
            else
        {
//email validation check
            String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
            //date check
            String regEx ="^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d{2}$";
            Matcher matcherObj = Pattern.compile(regEx).matcher(DOB);
            if (matcherObj.matches())
            {
                if (Email.matches(emailPattern)) {
                    Toast.makeText(Register.this, "Register Successfull", Toast.LENGTH_SHORT).show();

                    Intent in = new Intent(Register.this, MainActivity.class);
                    in.putExtra("name", name);
                    setResult(RESULT_OK, in);
                    finish();

                } else
                    Toast.makeText(Register.this, "Email not correct", Toast.LENGTH_SHORT).show();


            }
            else

                Toast.makeText(Register.this, "Date not correct", Toast.LENGTH_SHORT).show();

                 }


    }
}
