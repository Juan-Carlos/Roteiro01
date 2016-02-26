package com.example.juan.roteiro01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

    private EditText mNome;
    private EditText mSobrenome;
    private EditText mUsuario;
    private EditText mSenha;
    private EditText mConfirmarSenha;
    private Button mBotao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        this.mNome = (EditText) findViewById(R.id.nome);
        this.mSobrenome = (EditText) findViewById(R.id.sobrenome);
        this.mUsuario = (EditText) findViewById(R.id.usuario);
        this.mSenha = (EditText) findViewById(R.id.senha);
        this.mConfirmarSenha = (EditText) findViewById(R.id.confirmar_senha);
        this.mBotao = (Button) findViewById(R.id.botão);

        this.mBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrar();
            }

        });


    }

    private void cadastrar(){
        String nome = this.mNome.getText().toString();
        String sobrenome = this.mSobrenome.getText().toString();
        String usuario = this.mUsuario.getText().toString();
        String senha = this.mSenha.getText().toString();
        String confirmarSenha = this.mConfirmarSenha.getText().toString();

        View focus = null;
        boolean exibir = false;
        if (TextUtils.isEmpty(nome)) {
            mNome.setError("Campo Obrigatório");
            focus = mNome;
            exibir = true;
        }
        if(TextUtils.isEmpty(sobrenome)){
            mSobrenome.setError("Campo Obrigatório");
            focus = mSobrenome;
            exibir = true;
        }
        if (TextUtils.isEmpty(usuario)) {
            mUsuario.setError("Campo Obrigatório");
            focus = mUsuario;
            exibir = true;
        }
        if (TextUtils.isEmpty(senha)) {
            mSenha.setError("Campo Obrigatório");
            focus = mSenha;
            exibir = true;
        }
        if (TextUtils.isEmpty(confirmarSenha)) {
            mConfirmarSenha.setError("Campo Obrigatório");
            focus = mConfirmarSenha;
            exibir = true;
        }
        if(exibir){
            focus.requestFocus();
        }else{

            Intent intent = new Intent(this, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("usuario", usuario);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }

    }
}
