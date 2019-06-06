package neaest.app.statquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class resultados extends AppCompatActivity {
    TextView correct, incorrect, attempted, score, you;
    int c = 0, incorr = 0, attempt = 1; // numero de corretas, incorretas e numero de questoes (default = 1)
    int cat = 0;
    float scor;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        Intent intent = getIntent();
        c = intent.getIntExtra("correct", 0);
        attempt = intent.getIntExtra("attemp", 0);
        cat = intent.getIntExtra("banco", 1);
        incorr = attempt - c;
        scor = (float) (100 * c / attempt);
        correct = findViewById(R.id.correct);
        incorrect = findViewById(R.id.incorrect);
        attempted = findViewById(R.id.attempted);
        score = findViewById(R.id.score);
        you = findViewById(R.id.you);
//
        attempted.setText("  " + String.valueOf(attempt));
        correct.setText("  " + String.valueOf(c));
        incorrect.setText("  " + String.valueOf(incorr));
        score.setText("Corretas  :    " + String.valueOf(scor) + "%\n");

        if (scor <= 20) //TODO porcentagem pra proxima fase (atual 60%)
            you.setText("Precisa melhorar, seu objetivo é acertar 60% das questões.\n");
        else if (scor <= 40)
            you.setText("Está na média, seu objetivo é acertar 60% das questões.\n");
        else if (scor < 60)
            you.setText("Quase lá, seu objetivo é acertar 60% das questoes.\n");
        else if (scor <= 80)
            you.setText("Muito Bem! Alcançou os 60%! \n Está apto à próxima categoria.\n");
        else
            you.setText("Você é fantástico! \n Acertou mais de 80% das perguntas!\n");


    }

    @Override
    public void onBackPressed() {
        //TODO enviar pontuacao
//        super.onBackPressed();

        Intent i = new Intent(this, Categories.class);
        i.putExtra("banco", cat);

        if (scor >= 60) {
            i.putExtra("next",true);
        }else {
            i.putExtra("next",false);
            i.putExtra("pts",scor);
        }

        startActivity(i);
        finish();
    }
}
