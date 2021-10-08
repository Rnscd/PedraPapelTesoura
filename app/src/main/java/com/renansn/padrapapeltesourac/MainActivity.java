package com.renansn.padrapapeltesourac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.TextView;
import  android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra (View view)
    {
        this.opcaoSelecionada ("pedra");

    }

    public void selecionarPapel (View view)
    {
        this.opcaoSelecionada("papel");


    }

    public void selecionarTesoura (View view)
    {
        this.opcaoSelecionada("tesoura");


    }
    private void opcaoSelecionada(String escolhaUsuario) {
        ImageView imgPadrao = (ImageView) findViewById(R.id.imgPadrao);
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        // Gerar visualização aleatório das imagens

        String [] opcoes = {"pedra","papel","tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes [numero];

        switch (escolhaApp)
        {
            case "pedra":
                imgPadrao.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgPadrao.setImageResource( R.drawable.papel);
                break;
            case "tesoura":
                imgPadrao.setImageResource( R.drawable.tesoura);
                break;

        }

        if ((escolhaApp=="pedra" && escolhaUsuario=="tesoura") ||
                (escolhaApp=="papel" && escolhaUsuario=="pedra")||
                (escolhaApp=="tesoura" && escolhaUsuario=="papel"))

        {//App ganhador

            txtResultado.setText("Você perdeu :(");


        }

        else if ((escolhaUsuario=="pedra" && escolhaApp =="tesoura")||
                (escolhaUsuario=="papel"&&escolhaApp=="pedra")||
                (escolhaUsuario=="tesoura" && escolhaApp=="papel"))
        {

            txtResultado.setText("Você ganhou :)");
        }

        else
        {//Empate

            txtResultado.setText("Empatamos ;)");


        }
    }


}