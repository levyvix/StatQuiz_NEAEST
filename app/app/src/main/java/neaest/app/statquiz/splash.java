package neaest.app.statquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences sharedPreferences = getSharedPreferences("splash", Context.MODE_PRIVATE);


        if (sharedPreferences.contains("splash")) {
            rodar();
        } else {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("splash", true);
            editor.apply();

            Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    rodar();
                }
            }, 3000);
        }
    }


    public void rodar() {
        Intent intent = new Intent(this, Categories.class);

        startActivity(intent);
        finish();
    }
}
