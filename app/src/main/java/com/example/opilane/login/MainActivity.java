package com.example.opilane.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button buttonRegister;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView  textViewSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonRegister = (Button) findViewById(R.id.buttonRegister);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextEmail = (EditText) findViewById(R.id.editTextPassword);

        textViewSignup = (TextView) findViewById(R.id.textViewSignin);

        buttonRegister.setOnClickListener(this);
        textViewSignup.setOnClickListener(this);
    }

    private void  registerUser () {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            //email is empty
            Toast.makeText(this, "Pleas enter email", Toast.LENGTH_SHORT).show();
            //stopping the function execution further

            return;
        }

        if(TextUtils.isEmpty(password)){
            //password is empty
            Toast.makeText(this,"Pleas enter password" , Toast.LENGTH_SHORT).show();
            //stoping the fiunction execution further
            return;
        }


        }



    @Override
    public void onClick (View view) {
        if (view == buttonRegister) {
            registerUser ();
        }
        if (view == textViewSignup){
            //will open login activity here



   }
    }
}

