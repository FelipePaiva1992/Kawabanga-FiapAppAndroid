package com.example.felipe.kawabanga;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilLogin;
    private TextInputLayout tilSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tilLogin = (TextInputLayout) findViewById(R.id.tilLogin);
        tilSenha = (TextInputLayout) findViewById(R.id.tilSenha);
    }


    public void logar(View v){
        String login = tilLogin.getEditText().getText().toString();
        String senha = tilSenha.getEditText().getText().toString();

        if(login.equals("pato") && senha.equals("1234")){

        }else{
            Toast.makeText(this,"Você errou seu burro",Toast.LENGTH_SHORT);
        }
    }
}
