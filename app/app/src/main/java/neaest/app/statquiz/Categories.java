package neaest.app.statquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    boolean next;
    int categoria;
    float Pontos;
    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);


        Intent i = getIntent(); //recebe os extras
        next = i.getBooleanExtra("next", false);
        categoria = i.getIntExtra("banco", 1);
        Pontos = i.getFloatExtra("pts", 0);

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

        if (next) { //Caso passe de fase, categoria aumenta + 1
            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putInt("cat", categoria + 1);
            editor.apply();
        }

        int Intprefs = sharedPreferences.getInt("cat", 0);
        if (Intprefs == 2) { //Libera a categoria quando abre o app
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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_scoreboard) {
            //TODO go to scoreboard page
            Intent intent = new Intent(this, Scoreboard.class);
            startActivity(intent);

        } else if (id == R.id.nav_config) {
            //TODO go to config page
        } else if (id == R.id.nav_share) {
            //TODO share action
        } else if (id == R.id.nav_feedback) {
            //TODO feedback action
        } else if (id == R.id.nav_help) {
            //TODO go to help page
        } else if (id == R.id.nav_visit) {
            //TODO go to NEAEST website
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, Questions.class);
        if (v.getId() == R.id.b1) {
            intent.putExtra("banco", 1);
        } else if (v.getId() == R.id.b2) {
            intent.putExtra("banco", 2);
        }

        startActivity(intent);
        finish();
    }

}

