package neaest.app.statquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Banco1 extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Banco1.db";
    private static final String TABLE_QUEST = "Quest";
    private static final String QUESTION = "Question";
    private static final String OPTIONA = "optiona";
    private static final String OPTIONB = "optionb";
    private static final String OPTIONC = "optionc";
    private static final String OPTIOND = "optiond";
    private static final String ANSWER = "answer";
    private static final String LINK = "link";
    private static final String IMG = "img";

    //TODO criar multiplos bancos (mudar o nome desse)
    private SQLiteDatabase dbase;

    public Banco1(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        db.execSQL("create table if not exists Quest(QID int primary key, Question varchar(500) not null, optiona varchar(50) not null, optionb varchar(50) not null, optionc varchar(50) not null, optiond varchar(50) not null, answer varchar(50) not null, link varchar(50) not null,img varchar(50) not null)");
        addQuestions();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Quest");
        onCreate(db);
    }

    private void addQuestions() {
        Question q1 = new Question(1, "Which among the following brand is most influential brashk awdawdawda wdawdawdawdawdaadawd awdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw", "Microsoft", "Google", "Amazon", "Facebook", "Google", "google.com", "bit.ly/2JuNMhh");
        this.addQuestion(q1);
        Question q2 = new Question(2, "Who among the following is the newly elected FIFA president? awdawdawd awdawdawdawdawdaadawd awdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw", "Prince Ali of Jordan", "Sheikh Salman", "Gianni Infantino", "Jerome Champagne", "Gianni Infantino", "bit.ly/2Voq2CF", "");
        this.addQuestion(q2);
        Question q3 = new Question(3, "12th South Asian Games held at? awdawdawdawd awdaw dawdawdawdawdaada wdawdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw", "Bengaluru", "Hyderabad", "Guwahati and Shillong", "New Delhi", "Guwahati and Shillong", "google.com", "bit.ly/2JuNMhh");
        this.addQuestion(q3);
        Question q4 = new Question(4, "Who has won the FIFA world player award for 2015? awdawdawdaw dawdawdawdawda adawdawdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw", "Cristiano Ronaldo", "Lionel Messi", "Neymar", "Luis Suárez", "Lionel Messi", "bit.ly/2IXzBSe", "");
        this.addQuestion(q4);
        Question q5 = new Question(5, "Who was the founder of the City of Agra? awdawdawda wdawdawdawdawdaada wdawdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw", "Ala-ud-din Khalji", "Muhammad Tughlaq", "Firoz Tughlaq", "Sikandar Lodi", "Sikandar Lodi", "google.com", "bit.ly/2Voq2CF");
        this.addQuestion(q5);
        Question q6 = new Question(6, "The members of the Rajya Sabha are elected by _____awdawdawdaw dawdawdawdawdaa awdawdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw___", "the people", "Lok Sabha", "elected members of the legislative assembly", "elected members of the legislative council", "elected members of the legislative assembly", "bit.ly/2Voq2CF", "");
        this.addQuestion(q6);
        Question q7 = new Question(7, "The power to decide an election petition is vestedaw dawdawdawdawdawd awdawdaadawda wdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw in the________", "Parliament", "Supreme Court", "High courts", "Election Commission", "High courts", "google.com", "bit.ly/2JuNMhh");
        this.addQuestion(q7);
        Question q8 = new Question(8, "The present Lok Sabha is the____awdawdaw dawdawdawd awdawdaada wda wdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw____", "13th Lok Sabha", "14th Lok Sabha", "15th Lok Sabha", "16th Lok Sabha", "16th Lok Sabha", "bit.ly/2IXzBSe", "");
        this.addQuestion(q8);
        Question q9 = new Question(9, "The members of Lok Sabha hold office forawdawdawd awdawdawd awdawdaadawdawda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw a term of _______", "4 years", "5 years", "6 years", "3 years", "5 years", "google.com", "bit.ly/2Voq2CF");
        this.addQuestion(q9);
        Question q10 = new Question(10, "The minimum age to qualify for eawdaw dawdawda wdawdaw dawdaada wdaw dawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawlection to the Lok Sabha is _______", "25 years", "21 years", "18 years", "20 years", "25 years", "bit.ly/2IXzBSe", "bit.ly/2Voq2CF");
        this.addQuestion(q10);
        Question q11 = new Question(11, "Hitler party wawd awdawdawd wdawdawdawdaada wdawdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawhich came into power in 1933 is known as _____", "Labour Party", "Nazi Party", "Ku-Klux-Klan", "Democratic Party", "Nazi Party", "google.com", "");
        this.addQuestion(q11);
        Question q12 = new Question(12, "First China Wawdawd awdawd awdawdaw dawda adaw dawd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawar was fought between _______", "China and Britain", "China and France", "China and Greek", "China and Egypt", "China and Britain", "bit.ly/2IXzBSe", "");
        this.addQuestion(q12);
        Question q13 = new Question(13, "Gravity setti awda wdawdawdawdaw dawdawda adawd awd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawng chambers are used in industries to remove", "SOx", "NOx", "suspended particulate matter", "CO", "suspended particulate matter", "google.com", "bit.ly/2Voq2CFv");
        this.addQuestion(q13);
        Question q14 = new Question(14, "Friction can awdawd awdawda wdawdaw dawda adawd awda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawbe reduced by changing from", "sliding to rolling", "rolling to sliding", "potential energy to kinetic energy", "dynamic to static", "sliding to rolling", "bit.ly/2IXzBSe", "");
        this.addQuestion(q14);
        Question q15 = new Question(15, "Fire temple is awdaw dawdawdawd awdawda wdaada wda wdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawthe place of worship of which of the following religion?", "Taoism", "Judaism", "Zoroastrianism", "Shintoism", "Zoroastrianism", "google.com", "bit.ly/2JuNMhh");
        this.addQuestion(q15);
        Question q16 = new Question(16, "Film and TV instawda wdawdawda wdawdawd awdaadawd awda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawitute of India is located at", "Pune (Maharashtra)", "Rajkot (Gujarat)", "Pimpri (Maharashtra)", "Perambur (Tamilnadu)", "Pune (Maharashtra)", "google.com", "");
        this.addQuestion(q16);
        Question q17 = new Question(17, "Who has been awaawdaw dawdawdaw dawdawdawda adawdawd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawrded Nelson Mandela Graca Innovation Award for 2016?", "Tabassum Adnan", "Malala", "Adnan Mehboothi", "Madona", "Tabassum Adnan", "bit.ly/2IXzBSe", "");
        this.addQuestion(q17);
        Question q18 = new Question(18, "National Panchay awdawdawd awdawd awdaw dawdaa dawda wd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawati Raj Divas was celebrated on ________ of every year.", "23 April", "24 May", "24 April", "23 May", "24 April", "google.com", "");
        this.addQuestion(q18);
        Question q19 = new Question(19, "India has to plaawdaw dawd awdawd awdawda wdaadawd aw dawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawy its first Day Night test against which country in 2016?", "Australia", "England", "New Zealand", "South Africa", "New Zealand", "bit.ly/2IXzBSe", "");
        this.addQuestion(q19);
        Question q20 = new Question(20, "Who is appointedaw dawdawd awdawdawd awdaw daada wda wdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw as BCCI's CEO?", "Rahul Johri", "Anil Kumble", "Srinivasan", "Kapil Dev", "Rahul Johri", "google.com", "bit.ly/2Voq2CF");
        this.addQuestion(q20);
        Question q21 = new Question(21, "Shaheen - V is awdawd awdawdawdawda wdawda adawda wdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawan exercise between which two countries?", "China And Pakistan", "China And India", "Pakistan And America", "India And Pakistan", "China And Pakistan", "bit.ly/2IXzBSe", "");
        this.addQuestion(q21);
        Question q22 = new Question(22, "Who becomes Guaw daw dawdaw dawdaw dawdaw daa dawda wdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawjarat's first women director general of police?", "Geetha Johri", "Kanchan Chaudhary", "Sarojini", "Latika Saran", "Geetha Johri", "google.com", "");
        this.addQuestion(q22);
        Question q23 = new Question(23, "What was the vawdawda wdawdawda wdawda wdaadaw dawda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawenue of 2016 Nuclear Security Summit?", "Washington", "Brussels", "Mumbai", "Riyadh", "Washington", "bit.ly/2IXzBSe", "bit.ly/2JuNMhh");
        this.addQuestion(q23);
        Question q24 = new Question(24, "ICC Twenty20 cawda wdawdawdawdawda wdawdaada wdawda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawhampions title was clinched by which country?", "India", "Australia", "New Zealand", "West Indies", "West Indies", "google.com", "");
        this.addQuestion(q24);
        Question q25 = new Question(25, "India’s fastest awda wdawdawdawdaw dawdawda adawda wdawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawtrain launched. Name it.", "Fast n Tez express", "Speed Express", "Gati Express", "Gatimaan Express", "Gatimaan Express", "bit.ly/2IXzBSe", "bit.ly/2JuNMhh");
        this.addQuestion(q25);
        Question q26 = new Question(26, "Snapdeal launchea wdawdawd wdawdawda wdawdaad awdawd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daws donation program. Name it.", "Sunshine", "DonateIt", "Donatea Life", "Jovline", "Sunshine", "google.com", "bit.ly/2Voq2CF");
        this.addQuestion(q26);
        Question q27 = new Question(27, "_______becomes lawda wdawdaw dawdawd awdawda adawdaw dawda wdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawargest freight loading railway zone?", "South Coast Railway", "East Coast Railway", "North Coast Railway", "West Coast Railway", "East Coast Railway", "bit.ly/2IXzBSe", "");
        this.addQuestion(q27);
        Question q28 = new Question(28, "Which Government awdawdawd awdawdawdaw dawdaa dawdaw daw dawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw imposes complete ban on alcohol?", "Rajasthan", "Punjab", "Bihar", "Uttar Pradesh", "Bihar", "constatjr.com.br", "");
        this.addQuestion(q28);
        Question q29 = new Question(29, "Google launches awdawdaw dawdawd awdawda wdaada wdaw dawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw Android Auto in ________.", "Philippines", "Vietnam", "India", "USA", "India", "bit.ly/2IXzBSe", "");
        this.addQuestion(q29);
        Question q30 = new Question(30, "_______ unveils awdawdawd wdawdawd awdawda adawda wdawd awdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw world’s thinnest laptop?", "Dell", "Sony", "HP", "Lenovo", "HP", "google.com", "");
        this.addQuestion(q30);
        Question q31 = new Question(31, "Who has been aawd awdawdaw dawdaw dawdaw daada wdaw da wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawppointed as head of Lamborghini India Pvt Ltd?", "Indrani Menon", "Paras Mehta", "Naresh Krishna", "Sharad Agrawal", "Sharad Agrawal", "bit.ly/2IXzBSe", "bit.ly/2JuNMhh");
        this.addQuestion(q31);
        Question q32 = new Question(32, "GOI signs up __awdaw dawdawdawdawda wdaw daadawdawd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw_____ to endorse Skill India.", "Vishwanthan Anand", "Amitabh Bachchan", "Shahrukh Khan", "Sachin Tendulkar", "Sachin Tendulkar", "google.com", "bit.ly/2Voq2CF");
        this.addQuestion(q32);
        Question q33 = new Question(33, "Which state is awdawdaw dawdawdawda wdawdaadaw daw dawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawto pull all major public services online?", "Maharashtra", "Odisha", "Kerala", "Telangana", "Maharashtra", "bit.ly/2IXzBSe", "");
        this.addQuestion(q33);
        Question q34 = new Question(34, "Govt approvesa wdawdawdawdawda wdawdawdaad awdawda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw India’s first pod taxi project in_______.", "Gurgaon", "Mumbai", "Chennai", "Delhi", "Gurgaon", "google.com", "bit.ly/2Voq2CF");
        this.addQuestion(q34);
        Question q35 = new Question(35, "India and ___awdawdawd awdawdawd awdawdaada wdawd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw____ sign six agreements in different sectors.", "Maldives", "Germany", "China", "USA", "Maldives", "bit.ly/2IXzBSe", "");
        this.addQuestion(q35);
        Question q36 = new Question(36, "_____ get paawd wdawdaw dawdawd awdawd aadawdaw dawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawyments bank licence from RBI.", "Idea", "Vodafone", "Airtel", "Tata Docomo", "Airtel", "google.com", "bit.ly/2Voq2CF");
        this.addQuestion(q36);
        Question q37 = new Question(37, "Who launchesaw dawdawdawdawd awdawdawdaa dawdawd awdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw ambitious Climate Change Action Plan?", "NASA", "World Bank", "IPCC", "None of the option", "World Bank", "bit.ly/2IXzBSe", "");
        this.addQuestion(q37);
        Question q38 = new Question(38, "______conferawdaw dawdawdaw dawdawdawda adawdaw dawdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw dawred Padma Awards 2016.", "Narendra Modi", "Pranab Mukherjee", "Smiriti Irani", "None of the above", "Pranab Mukherjee", "google.com", "");
        this.addQuestion(q38);
        Question q39 = new Question(39, "Federal Bankawdawd awdawd awdawdawda wdaad awdawda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw launches________ for students.", "C-Wallet", "Campus Wallet", "e-Purse", "Camp Wallet", "Campus Wallet", "bit.ly/2IXzBSe", "bit.ly/2JuNMhh");
        this.addQuestion(q39);
        Question q40 = new Question(40, "India and ___awdawdaw dawdawdaw dawdawdaadaw dawda wdawdaw aw dawdawd awdawdaw dawdaw daw?. awdawdawd awd awdaw awdadaw dawd awdaw da,w da,wd ,aw,d,aw daw daw__agree for logistics exchange to enhance military cooperation.", "USA", "Mynammar", "Saudi Arabia", "China", "USA", "google.com", "");
        this.addQuestion(q40);

    }

    private void addQuestion(Question quest) { //pega o argumento e transforma em uma linha do banco de dados
        ContentValues values = new ContentValues();
        values.put(QUESTION, quest.getQUESTION());
        values.put(ANSWER, quest.getANSWER());
        values.put(OPTIONA, quest.getOPTA());
        values.put(OPTIONB, quest.getOPTB());
        values.put(OPTIONC, quest.getOPTC());
        values.put(OPTIOND, quest.getOPTD());
        values.put(LINK, quest.getLINK());
        values.put(IMG, quest.getIMG());

        dbase.insert("Quest", null, values);
    }

    // deve ser publico
    public List<Question> getAllQuestions() { // funcao que pega todas as questoes do banco de dados e transforma em uma lista de Questoes (é usado na Classe Questions)
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_QUEST; //Seleciona tudo
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null); //cursor
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setQUESTION(cursor.getString(1));
                quest.setOPTA(cursor.getString(2));
                quest.setOPTB(cursor.getString(3));
                quest.setOPTC(cursor.getString(4));
                quest.setOPTD(cursor.getString(5));
                quest.setANSWER(cursor.getString(6));
                quest.setLINK(cursor.getString(7));
                quest.setIMG(cursor.getString(8));

                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return quesList;
    }
}
