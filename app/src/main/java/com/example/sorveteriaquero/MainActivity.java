package com.example.sorveteriaquero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //Criando instâncias dos componentes da tela:
    private EditText editNome;
    private EditText editEmail;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    editNome = findViewById(R.id.editNome);
    editEmail = findViewById(R.id.editEmail);
    txtResultado = findViewById(R.id.txtResultado);

}
    //Criando o método responsável por capturar o que o usuário digitou nos inputs:
    public void recuperar(View view){
        String emailDigitado = editEmail.getText().toString();
        String nomeDigitado = editNome.getText().toString();

        txtResultado.setText("Cadastro Efetuado com Sucesso!" + "\n" + "Confira os dados cadastrados abaixo: "+ "\n" + "Nome: " + nomeDigitado + "\n" + "E-mail: " + emailDigitado + "\n" + "Você receberá nossas promoções no seu e-mail, fique atento(a) :)");

    }


}