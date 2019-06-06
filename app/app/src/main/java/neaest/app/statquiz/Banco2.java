package neaest.app.statquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Banco2 extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "Banco2.db";
    private static final String TABLE_QUEST = "Quest";
    private static final String QUESTION = "Question";
    private static final String OPTIONA = "optiona";
    private static final String OPTIONB = "optionb";
    private static final String OPTIONC = "optionc";
    private static final String OPTIOND = "optiond";
    private static final String ANSWER = "answer";
    private static final String LINK = "link";
    private static final String IMG = "img";

    private SQLiteDatabase dbase;

    public Banco2(Context context) { //TODO criar multiplos bancos (mudar o nome desse)
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
        Question q1 = new Question(1, "Wh", "Microsoft", "Google", "Amazon", "Facebook", "Google", "google.com", "");
        this.addQuestion(q1);
        Question q2 = new Question(2, "Who ", "Prince Ali of Jordan", "Sheikh Salman", "Gianni Infantino", "Jerome Champagne", "Gianni Infantino", "", "");
        this.addQuestion(q2);
        Question q3 = new Question(3, "1?", "Bengaluru", "Hyderabad", "Guwahati and Shillong", "New Delhi", "Guwahati and Shillong", "google.com", "");
        this.addQuestion(q3);
        Question q4 = new Question(4, "Who ", "Cristiano Ronaldo", "Lionel Messi", "Neymar", "Luis Suárez", "Lionel Messi", "", "");
        this.addQuestion(q4);
        Question q5 = new Question(5, "Who ", "Ala-ud-din Khalji", "Muhammad Tughlaq", "Firoz Tughlaq", "Sikandar Lodi", "Sikandar Lodi", "google.com", "");
        this.addQuestion(q5);
        Question q6 = new Question(6, "The _", "the people", "Lok Sabha", "elected members of the legislative assembly", "elected members of the legislative council", "elected members of the legislative assembly", "", "");
        this.addQuestion(q6);
        Question q7 = new Question(7, "The _", "Parliament", "Supreme Court", "High courts", "Election Commission", "High courts", "google.com", "");
        this.addQuestion(q7);
        Question q8 = new Question(8, "The p", "13th Lok Sabha", "14th Lok Sabha", "15th Lok Sabha", "16th Lok Sabha", "16th Lok Sabha", "", "");
        this.addQuestion(q8);
        Question q9 = new Question(9, "The m___", "4 years", "5 years", "6 years", "3 years", "5 years", "google.com", "");
        this.addQuestion(q9);
        Question q10 = new Question(10, "The ____", "25 years", "21 years", "18 years", "20 years", "25 years", "", "");
        this.addQuestion(q10);
        Question q11 = new Question(11, "Hitler p___", "Labour Party", "Nazi Party", "Ku-Klux-Klan", "Democratic Party", "Nazi Party", "google.com", "");
        this.addQuestion(q11);
        Question q12 = new Question(12, "First _", "China and Britain", "China and France", "China and Greek", "China and Egypt", "China and Britain", "", "");
        this.addQuestion(q12);
        Question q13 = new Question(13, "Gravity seove", "SOx", "NOx", "suspended particulate matter", "CO", "suspended particulate matter", "google.com", "");
        this.addQuestion(q13);
        Question q14 = new Question(14, "Friction m", "sliding to rolling", "rolling to sliding", "potential energy to kinetic energy", "dynamic to static", "sliding to rolling", "", "");
        this.addQuestion(q14);
        Question q15 = new Question(15, "Fire n?", "Taoism", "Judaism", "Zoroastrianism", "Shintoism", "Zoroastrianism", "google.com", "");
        this.addQuestion(q15);
        Question q16 = new Question(16, "Film t", "Pune (Maharashtra)", "Rajkot (Gujarat)", "Pimpri (Maharashtra)", "Perambur (Tamilnadu)", "Pune (Maharashtra)", "google.com", "");
        this.addQuestion(q16);
        Question q17 = new Question(17, "Who ?", "Tabassum Adnan", "Malala", "Adnan Mehboothi", "Madona", "Tabassum Adnan", "", "");
        this.addQuestion(q17);
        Question q18 = new Question(18, "Natioear.", "23 April", "24 May", "24 April", "23 May", "24 April", "google.com", "");
        this.addQuestion(q18);
        Question q19 = new Question(19, "India016?", "Australia", "England", "New Zealand", "South Africa", "New Zealand", "", "");
        this.addQuestion(q19);
        Question q20 = new Question(20, "Who isCEO?", "Rahul Johri", "Anil Kumble", "Srinivasan", "Kapil Dev", "Rahul Johri", "google.com", "");
        this.addQuestion(q20);
        Question q21 = new Question(21, "Shahes?", "China And Pakistan", "China And India", "Pakistan And America", "India And Pakistan", "China And Pakistan", "", "");
        this.addQuestion(q21);
        Question q22 = new Question(22, "Who be?", "Geetha Johri", "Kanchan Chaudhary", "Sarojini", "Latika Saran", "Geetha Johri", "google.com", "");
        this.addQuestion(q22);
        Question q23 = new Question(23, "Wht?", "Washington", "Brussels", "Mumbai", "Riyadh", "Washington", "", "");
        this.addQuestion(q23);
        Question q24 = new Question(24, "ICtry?", "India", "Australia", "New Zealand", "West Indies", "West Indies", "google.com", "");
        this.addQuestion(q24);
        Question q25 = new Question(25, "Ind it.", "Fast n Tez express", "Speed Express", "Gati Express", "Gatimaan Express", "Gatimaan Express", "", "");
        this.addQuestion(q25);
        Question q26 = new Question(26, "Snt.", "Sunshine", "DonateIt", "Donatea Life", "Jovline", "Sunshine", "google.com", "");
        this.addQuestion(q26);
        Question q27 = new Question(27, "_____one?", "South Coast Railway", "East Coast Railway", "North Coast Railway", "West Coast Railway", "East Coast Railway", "", "");
        this.addQuestion(q27);
        Question q28 = new Question(28, "Whiol?", "Rajasthan", "Punjab", "Bihar", "Uttar Pradesh", "Bihar", "constatjr.com.br", "");
        this.addQuestion(q28);
        Question q29 = new Question(29, "Go_.", "Philippines", "Vietnam", "India", "USA", "India", "", "");
        this.addQuestion(q29);
        Question q30 = new Question(30, "___p?", "Dell", "Sony", "HP", "Lenovo", "HP", "google.com", "");
        this.addQuestion(q30);
        Question q31 = new Question(31, "Who hd?", "Indrani Menon", "Paras Mehta", "Naresh Krishna", "Sharad Agrawal", "Sharad Agrawal", "", "");
        this.addQuestion(q31);
        Question q32 = new Question(32, "GOI .", "Vishwanthan Anand", "Amitabh Bachchan", "Shahrukh Khan", "Sachin Tendulkar", "Sachin Tendulkar", "google.com", "");
        this.addQuestion(q32);
        Question q33 = new Question(33, "Whiine?", "Maharashtra", "Odisha", "Kerala", "Telangana", "Maharashtra", "", "");
        this.addQuestion(q33);
        Question q34 = new Question(34, "Gov___.", "Gurgaon", "Mumbai", "Chennai", "Delhi", "Gurgaon", "google.com", "");
        this.addQuestion(q34);
        Question q35 = new Question(35, "Inditors.", "Maldives", "Germany", "China", "USA", "Maldives", "", "");
        this.addQuestion(q35);
        Question q36 = new Question(36, "___RBI.", "Idea", "Vodafone", "Airtel", "Tata Docomo", "Airtel", "google.com", "");
        this.addQuestion(q36);
        Question q37 = new Question(37, "Whan?", "NASA", "World Bank", "IPCC", "None of the option", "World Bank", "", "");
        this.addQuestion(q37);
        Question q38 = new Question(38, "___16.", "Narendra Modi", "Pranab Mukherjee", "Smiriti Irani", "None of the above", "Pranab Mukherjee", "google.com", "");
        this.addQuestion(q38);
        Question q39 = new Question(39, "Feents.", "C-Wallet", "Campus Wallet", "e-Purse", "Camp Wallet", "Campus Wallet", "", "");
        this.addQuestion(q39);
        Question q40 = new Question(40, "Indion.", "USA", "Mynammar", "Saudi Arabia", "China", "USA", "google.com", "");
        this.addQuestion(q40);

    }

    private void addQuestion(Question quest) {
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

    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
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
