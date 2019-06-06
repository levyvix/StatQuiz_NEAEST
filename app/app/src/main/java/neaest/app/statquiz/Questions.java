package neaest.app.statquiz;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Questions extends AppCompatActivity {

    List<Question> quesList;
    int categoria = 0;
    TextView ques;
    Button OptA, OptB, OptC, OptD;
    boolean haveImage = false;
    ImageView img;
    Button play_button;
    ImageLoader imageLoader;
    Question currentQ;
    int vis = 0, qid = 0, c = 0, n = 10;
    int j = 1;
    List<Integer> list = new ArrayList<>(); //receber os métodos (add)
    List<Integer> questoesID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);

        //Carregando os bancos
        Banco1 banco1 = new Banco1(this);
        Banco2 banco2 = new Banco2(this);

        Intent i = getIntent(); //pra saber qual banco carregar
        categoria = i.getIntExtra("banco", 1);


        if (categoria == 1) {
            quesList = banco1.getAllQuestions(); //categoria 1
        } else if (categoria == 2) {
            quesList = banco2.getAllQuestions(); //categoria 2
        }


        OptA = findViewById(R.id.OptionA);
        OptB = findViewById(R.id.OptionB);
        OptC = findViewById(R.id.OptionC);
        OptD = findViewById(R.id.OptionD);
        ques = findViewById(R.id.Questions);
        play_button = findViewById(R.id.play_button);
        img = findViewById(R.id.img); //TODO delay carregar imagem


        for (int k = 1; k <= 40; k++) {
            // enche a lista com ID's em ordem crescente (1, 2, 3,...,40)
            list.add(k);
        }

        // QuestoesID recebe a lista de ID's aleatorizada
        questoesID = getRandomElement(list, 40);
        currentQ = quesList.get(questoesID.get(j)); // a primeira questao ja é selecionada para ser mosrtada pro usuario


        // pra carregar a imagem da tabela
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(config);
//        imageLoader
    }

    public void onClick(View v) {

        if (vis == 0) { //primeira vez, mostrar as questoes

            // Tira o "Iniciar" e mostra a questão e as opções

            ques.setVisibility(View.VISIBLE);
            OptA.setVisibility(View.VISIBLE);
            OptB.setVisibility(View.VISIBLE);
            OptC.setVisibility(View.VISIBLE);
            OptD.setVisibility(View.VISIBLE);
            img.setVisibility(View.VISIBLE);

            play_button.setVisibility(View.GONE);
            upgradeQuestion();
            vis = 1;
        } else { // comparar

            if (currentQ.getANSWER().contentEquals(OptA.getText())) { // Se a opção A estiver correta, e o usuario marcou A
                if (v.getId() == R.id.OptionA) {

                    Snackbar snackbar = Snackbar.make(v, "         Correto! ☺", Snackbar.LENGTH_SHORT);

                    snackbar.show();
                    c++;
                } else { // Se a opção A estiver correta, e o usuario marcou outra opção

                    if (currentQ.getLINK().equals("")) { // Caso a quesao não possua link de resolução no banco de dados, śo mostra Incorreto
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG);
                        snackbar.show();
                    } else { // Caso a questao possua link de resolucao no banco de dados, mostra o link
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG).setAction("VER RESOLUÇÃO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + currentQ.getLINK())));
                            }
                        });
                        snackbar.setActionTextColor(Color.YELLOW);
                        snackbar.show();
                    }
                }
            } else if (currentQ.getANSWER().contentEquals(OptB.getText())) { // Se a opção B estiver correta, e o usuario marcou B
                if (v.getId() == R.id.OptionB) {

                    Snackbar snackbar = Snackbar.make(v, "         Correto! ☺", Snackbar.LENGTH_SHORT);

                    snackbar.show();
                    c++;
                } else { //Se a opção B estiver correta, e o usuario marcou outra opção
                    if (currentQ.getLINK().equals("")) {
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG);
                        snackbar.show();
                    } else {
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG).setAction("VER RESOLUÇÃO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + currentQ.getLINK())));
                            }
                        });
                        snackbar.setActionTextColor(Color.YELLOW);
                        snackbar.show();
                    }

                }
            } else if (currentQ.getANSWER().contentEquals(OptC.getText())) { //Se a opção C estiver correta, e o usuario marcou C
                if (v.getId() == R.id.OptionC) {

                    Snackbar snackbar = Snackbar.make(v, "         Correto! ☺", Snackbar.LENGTH_SHORT);
                    snackbar.show();
                    c++;

                } else { //Se a opção C estiver correta, e o usuario marcou outra opção
                    if (currentQ.getLINK().equals("")) {
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG);
                        snackbar.show();
                    } else {
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG).setAction("VER RESOLUÇÃO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + currentQ.getLINK())));
                            }
                        });
                        snackbar.setActionTextColor(Color.YELLOW);
                        snackbar.show();
                    }
                }
            } else if (currentQ.getANSWER().contentEquals(OptD.getText())) { //Se a opção D estiver correta, e o usuario marcou D
                if (v.getId() == R.id.OptionD) {

                    Snackbar snackbar = Snackbar.make(v, "         Correto! ☺", Snackbar.LENGTH_SHORT);

                    snackbar.show();
                    c++;
                } else { //Se a opção D estiver correta, e o usuario marcou outra opção
                    if (currentQ.getLINK().equals("")) {
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG);
                        snackbar.show();
                    } else {
                        Snackbar snackbar = Snackbar.make(v, "         Incorreto :(  ", Snackbar.LENGTH_LONG).setAction("VER RESOLUÇÃO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + currentQ.getLINK())));
                            }
                        });
                        snackbar.setActionTextColor(Color.YELLOW);
                        snackbar.show();
                    }
                }
            }

            if (j < n) { //TODO quantas questoes ? ter opcao de quantas perguntas.

                currentQ = quesList.get(qid); //qid tem o ID da proxima questao, currentQ recebe a questao da lista de questoes
                upgradeQuestion();
            } else {

                //handler pra mostrar o resutlado da ultima questao

                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Questions.this, resultados.class);
                        intent.putExtra("correct", c); //mandar dados para outra activity
                        intent.putExtra("attemp", n);
                        intent.putExtra("banco", categoria);
                        startActivity(intent);
                        finish();
                    }
                }, 1000);


            }
        }
    }

    private void upgradeQuestion() {
        if (j == 1) { //primeira vez
            j++;

            // na primeira vez é imediato, pois se não mostra as opcoes como A, B, C, D
            ques.setText(currentQ.getQUESTION());
            OptA.setText(currentQ.getOPTA());
            OptB.setText(currentQ.getOPTB());
            OptC.setText(currentQ.getOPTC());
            OptD.setText(currentQ.getOPTD());

            // Pega o link da imagem no banco e mostra na questão (tabela)
            ImageLoader.getInstance().displayImage("http://" + currentQ.getIMG(), img);

        } else {
            j++;
            // handler pra dar um tempo pro usuario ver se acertou ou não, quiser saber a resolução ou não, e só entao passar pra proxima questao
            Handler handler = new Handler();



            if(currentQ.getIMG().equals("")){ // nao tem imagem
                img.setVisibility(View.GONE);
            }else {
                haveImage = true;
                ImageLoader.getInstance().displayImage("http://" + currentQ.getIMG(), img);
            }


            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
//                    img.setVisibility(View.INVISIBLE);
                    ques.setText(currentQ.getQUESTION());
                    OptA.setText(currentQ.getOPTA());
                    OptB.setText(currentQ.getOPTB());
                    OptC.setText(currentQ.getOPTC());
                    OptD.setText(currentQ.getOPTD());

                    //TODO mexer na imagem
                    if (haveImage) {
//                        ImageLoader.getInstance().destroy();
                        img.setVisibility(View.VISIBLE);

                    } else {
                       img.setVisibility(View.GONE);
                    }


//                    qid = questoesID.get(j);
                }
            }, 700);
        }

        //qid recebe o id da proxima questao
        qid = questoesID.get(j); //qid recebe o j-esimo ID da lista de ID's das questoes de 1 até n (1, 2, 3,...,j,...,n), esse ID é a proxima questao a ser mostrada pro usuario
    }

    public List<Integer> getRandomElement(List<Integer> list, int nQuestoes) {
        Random rand = new Random();

        // cria uma lista <int> temporaria pra guardar os valores (newList)
        List<Integer> novaLista = new ArrayList<>();
        for (int i = 0; i < nQuestoes; i++) {

            // escolhe um numero aleatorio entre 0 e o tamanho da lista (quantidade de questoes)
            int randomIndex = rand.nextInt(list.size());

            // adiciona esse numero à lsita temporária (newList.append(randomNumber))
            novaLista.add(list.get(randomIndex));

            // como não possui reposição, o numero que que foi escolhido acima é retirado da lista original
            list.remove(randomIndex);
        }
        return novaLista;
    }

    boolean doubleBackPressedOnce = false;

    @Override
    public void onBackPressed() { //caso aperte o botao de voltar enquanto está respondendo a questao
//        super.onBackPressed();
        if (doubleBackPressedOnce) {
            super.onBackPressed();
//            doubleBackPressedOnce = false;
            // precisamos iniciar uma nova activity pois a MainActivity foi finalizada
            Intent i = new Intent(Questions.this, Categories.class);
            startActivity(i);
            finish();
//            return;
        }

        this.doubleBackPressedOnce = true;

        Toast.makeText(getApplicationContext(), "Apertar VOLTAR novamente para sair.", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackPressedOnce = false;
            }
        }, 4000);

    }
}
