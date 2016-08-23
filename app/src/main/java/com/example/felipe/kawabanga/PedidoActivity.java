package com.example.felipe.kawabanga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class PedidoActivity extends AppCompatActivity {

    private TextView    tvUsuario;
    private CheckBox    cbAtum;
    private CheckBox    cbBacon;
    private CheckBox    cbMussarela;
    private CheckBox    cbCalabresa;

    private RadioGroup  rgTamanhoPizza;
    private Spinner     spPagamentos;
    private CheckBox    cbBordaRecheada;
    private CheckBox    cbRecheioExtra;
    private CheckBox    cbRefrigerante;
    private CheckBox    cbSobremesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        tvUsuario = (TextView) findViewById(R.id.tvUsuario);
        tvUsuario.setText(getIntent().getStringExtra("usuario"));

        cbAtum = (CheckBox) findViewById(R.id.cbAtum);
        cbBacon = (CheckBox) findViewById(R.id.cbBacon);
        cbMussarela = (CheckBox) findViewById(R.id.cbMussarela);
        cbCalabresa = (CheckBox) findViewById(R.id.cbCalabresa);
        rgTamanhoPizza = (RadioGroup) findViewById(R.id.rgTamanhoPizza);
        spPagamentos = (Spinner) findViewById(R.id.spPagamentos);
        cbBordaRecheada = (CheckBox) findViewById(R.id.cbBordaRecheada);
        cbRecheioExtra = (CheckBox) findViewById(R.id.cbRecheioExtra);
        cbRefrigerante = (CheckBox) findViewById(R.id.cbRefrigerante);
        cbSobremesa = (CheckBox) findViewById(R.id.cbSobremesa);


    }
}
