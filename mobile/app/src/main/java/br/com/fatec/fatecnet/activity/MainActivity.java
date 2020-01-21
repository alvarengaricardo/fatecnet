package br.com.fatec.fatecnet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.messaging.FirebaseMessaging;

import br.com.fatec.fatecnet.R;

public class MainActivity extends AppCompatActivity {

    //firebase auth object
    private FirebaseAuth firebaseAuth;

    //view objects
    private Button btnLogout;
    private Button btnManutencao;
    private Button btnMensagem;
    private Button btnRequerimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializando firebase authentication object
        firebaseAuth = FirebaseAuth.getInstance();

        //user != logged in, current user retorna null
        if (firebaseAuth.getCurrentUser() == null) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }

        //get usuario
        FirebaseUser user = firebaseAuth.getCurrentUser();

        //iniciando views
        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnManutencao = (Button) findViewById(R.id.btnManutencao);
        btnMensagem = (Button) findViewById(R.id.btnMensagem);
        btnRequerimento = (Button) findViewById(R.id.btnRequerimento);

        //exibe user name
        //listener para button
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseMessaging.getInstance().unsubscribeFromTopic("fatec");
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btnManutencao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ManutencaoActivity.class));
            }
        });

        btnMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MensagemActivity.class));
            }
        });

        btnRequerimento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, RequerimentoActivity.class));
            }
        });
    }
}