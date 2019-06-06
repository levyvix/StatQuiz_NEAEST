package neaest.app.statquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5;
    int categoria = 0;
    boolean next = false;
    List<Float> pontos;
    Float Pontos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        Intent i = getIntent(); //recebe os extras
        next = i.getBooleanExtra("next", false);
        categoria = i.getIntExtra("banco", 1);
        Pontos = i.getFloatExtra("pts",0);



        SharedPreferences sharedPreferences = getSharedPreferences("cat", Context.MODE_PRIVATE);

        if (next) { // Libera proxima categoria
            switch (categoria) {
                case 1:
                    b2.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);
                    break;
                // TODO adicionar mais
            }
        }

        if (next) {
            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putInt("cat", categoria + 1);
            editor.apply();
        }

        //Verifica categoria no shared prefs
        int Intprefs = sharedPreferences.getInt("cat", 0);
        if (Intprefs == 2) {
            b2.setVisibility(View.VISIBLE);
        } else if (Intprefs == 3) {
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
        } else if (Intprefs == 4) {
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
            b4.setVisibility(View.VISIBLE);
        } //TODO adicionar mais
//        banco1.addQuestions();
    }


    public void onClick(View v) {

//        TODO informar qual categoria selecionou

        Intent intent = new Intent(this, Questions.class);
        if (v.getId() == R.id.b1) {
            Snackbar snackbar = Snackbar.make(v, "Banco1", Snackbar.LENGTH_SHORT);

            snackbar.show();
            intent.putExtra("banco", 1);
        } else if (v.getId() == R.id.b2) {
            Snackbar snackbar = Snackbar.make(v, "Banco2", Snackbar.LENGTH_SHORT);

            snackbar.show();
            intent.putExtra("banco", 2);
        }

        startActivity(intent);
        finish();
    }


    //TODO onBackPressed()
}
