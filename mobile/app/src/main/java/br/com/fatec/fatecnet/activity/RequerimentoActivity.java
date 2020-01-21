package br.com.fatec.fatecnet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.fatec.fatecnet.R;

/**
 * Created by ricardo on 10/09/2017.
 */

public class RequerimentoActivity extends AppCompatActivity {

    private Button btnAtestadoMatricula;
    private Button btnHistoricoEscolar;
    private Button btnCertificadoConclusao;
    private Button btnConsultarRequerimento;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requerimento);

        btnAtestadoMatricula = (Button) findViewById(R.id.btnAtestadoMatricula);
        btnHistoricoEscolar = (Button) findViewById(R.id.btnHistoricoEscolar);
        btnCertificadoConclusao = (Button) findViewById(R.id.btnCertificadoConclusao);
        btnConsultarRequerimento = (Button) findViewById(R.id.btnConsularRequerimento);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnAtestadoMatricula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(RequerimentoActivity.this, Formulario01Activity.class));
            }
        });

        btnHistoricoEscolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(RequerimentoActivity.this, Formulario02Activity.class));
            }
        });

        btnCertificadoConclusao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(RequerimentoActivity.this, Formulario05Activity.class));
            }
        });

        btnConsultarRequerimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(RequerimentoActivity.this, ConsultarRequerimentoActivity.class));
            }
        });


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(RequerimentoActivity.this, MainActivity.class));
            }
        });
    }
}