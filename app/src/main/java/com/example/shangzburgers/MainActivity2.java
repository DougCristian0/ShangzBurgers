package com.example.shangzburgers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    int precoTotal = 0;
    String Lanche = "";
    String Batata = "";
    String Coca = "";
    int valorCoca = 0;
    int valorBatata  = 0;
    int valorLanche = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final RadioGroup grupoCoca = (RadioGroup)findViewById(R.id.radioGroup);
        final RadioGroup grupoBatata = (RadioGroup)findViewById(R.id.radioGroup2);

        Bundle b = getIntent().getExtras();
        int cod = b.getInt("cod");
        final ImageView img = (ImageView) findViewById(R.id.imageView8);
        final TextView texto1 = (TextView) findViewById(R.id.textView3);
        final TextView texto2 = (TextView) findViewById(R.id.textView4);
        final TextView preco = (TextView)  findViewById(R.id.textView2);
        final Button botao = (Button) findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        switch (cod) {
            case 1:
                img.setImageResource(R.drawable.shangzbbqsuculento1);
                texto1.setText(R.string.c1);
                Lanche = "Shangz BBQ Suculento";
                texto2.setText(R.string.sin01);
                valorLanche = getResources().getInteger(R.integer.val1);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 2:
                img.setImageResource(R.drawable.dougdelicia);
                texto1.setText(R.string.c2);
                Lanche = "Doug Delícia";
                texto2.setText(R.string.sin02);
                valorLanche = getResources().getInteger(R.integer.val2);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 3:
                img.setImageResource(R.drawable.suculenciapicante1);
                texto1.setText(R.string.c3);
                Lanche = "Suculencia Picante";
                texto2.setText(R.string.sin03);
                valorLanche = getResources().getInteger(R.integer.val3);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 4:
                img.setImageResource(R.drawable.suculenciaabsurda1);
                texto1.setText(R.string.c4);
                Lanche = "Suculencia Absurda";
                texto2.setText(R.string.sin04);
                valorLanche = getResources().getInteger(R.integer.val4);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 5:
                img.setImageResource(R.drawable.shangzjr1);
                texto1.setText(R.string.c5);
                Lanche = "Shangz Jr";
                texto2.setText(R.string.sin05);
                valorLanche = getResources().getInteger(R.integer.val5);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 6:
                img.setImageResource(R.drawable.suculenciadecarne1);
                texto1.setText(R.string.c6);
                Lanche = "Suculencia de Carne";
                texto2.setText(R.string.sin06);
                valorLanche = getResources().getInteger(R.integer.val6);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 7:
                img.setImageResource(R.drawable.shangzsupreme);
                texto1.setText(R.string.c7);
                Lanche = "Shang Supreme";
                texto2.setText(R.string.sin07);
                valorLanche = getResources().getInteger(R.integer.val7);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 8:
                img.setImageResource(R.drawable.juniorcheese);
                texto1.setText(R.string.c8);
                Lanche = "Junior Cheese";
                texto2.setText(R.string.sin08);
                valorLanche = getResources().getInteger(R.integer.val8);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 9:
                img.setImageResource(R.drawable.podraosuculento);
                texto1.setText(R.string.c9);
                Lanche = "Podrão Suculento";
                texto2.setText(R.string.sin09);
                valorLanche = getResources().getInteger(R.integer.val9);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
            case 10:
                img.setImageResource(R.drawable.shangzcheese1);
                texto1.setText(R.string.c10);
                Lanche = "Shangz Cheese";
                texto2.setText(R.string.sin10);
                valorLanche = getResources().getInteger(R.integer.val10);
                preco.setText("R$ "+valorLanche);
                precoTotal += valorLanche;
                break;
        }

        grupoCoca.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (grupoCoca.getCheckedRadioButtonId() == R.id.radioButtonCoca1){
                    valorCoca = getResources().getInteger(R.integer.coca1);
                    precoTotal += valorCoca;
                    Coca = "200ml";
                }
                else if (grupoCoca.getCheckedRadioButtonId() == R.id.radioButtonCoca2){
                    valorCoca = getResources().getInteger(R.integer.coca2);
                    precoTotal += valorCoca;
                    Coca = "500ml";
                }
                else if (grupoCoca.getCheckedRadioButtonId() == R.id.radioButtonCoca3){
                    valorCoca = getResources().getInteger(R.integer.coca3);
                    precoTotal += valorCoca;
                    Coca = "700ml";
                }
                else{

                }

            }
        });

        grupoBatata.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (grupoBatata.getCheckedRadioButtonId() == R.id.radioButtonBatata1){
                    valorBatata = getResources().getInteger(R.integer.batata1);
                    precoTotal += valorBatata;
                    Batata = "Pequena";
                }
                else if (grupoBatata.getCheckedRadioButtonId() == R.id.radioButtonBatata2){
                    valorBatata = getResources().getInteger(R.integer.batata2);
                    precoTotal += valorBatata;
                    Batata = "Média";
                }
                else if (grupoBatata.getCheckedRadioButtonId() == R.id.radioButtonBatata3){
                    valorBatata = getResources().getInteger(R.integer.batata3);
                    precoTotal += valorBatata;
                    Batata = "Grande";
                }
            }
        });

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Coca == ""){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity2.this);
                    alerta.setTitle("Erro ao realizar a compra!");
                    alerta.setMessage("Você não selecionou uma coca!");
                    alerta.setNegativeButton("Ok",null);
                    alerta.show();
                }
                else if (Batata == ""){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity2.this);
                    alerta.setTitle("Erro ao realizar a compra!");
                    alerta.setMessage("Você não selecionou uma batata!");
                    alerta.setNegativeButton("Ok",null);
                    alerta.show();
                }
                else{
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity2.this);
                    alerta.setTitle("Compra realizada com sucesso!");
                    alerta.setMessage("Você comprou um "+Lanche+" - R$"+valorLanche+"\n" +
                            "Coca "+Coca+" - R$"+valorCoca+"\n" +
                            "Batata "+Batata+" - R$"+valorBatata+"\n" +
                            "O preço total ficou R$ "+precoTotal);
                    alerta.setNegativeButton("Ok",null);
                    alerta.show();
                }
            }
        });
    }
}