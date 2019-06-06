package neaest.app.statquiz;

public class Question {
    private int ID;
    private String QUESTION;
    private String OPTA;
    private String OPTB;
    private String OPTC;
    private String OPTD;
    private String ANSWER;
    private String LINK;
    private String IMG;

    public Question() //questao vazia pra preencher
    {
        ID = 0;
        QUESTION = "";
        OPTA = "";
        OPTB = "";
        OPTC = "";
        OPTD = "";
        ANSWER = "";
        LINK = "";
        IMG = "";
    }


    public Question(int id, String qUESTION, String oPTA, String oPTB, String oPTC, String oPTD, String aNSWER, String lINK, String iMG) { //questao completa pra inserir no banco
        ID = id;
        QUESTION = qUESTION;
        OPTD = oPTD;
        OPTA = oPTA;
        OPTB = oPTB;
        OPTC = oPTC;
        ANSWER = aNSWER;
        LINK = lINK;
        IMG = iMG;
    }

    // Setters
    public void setQUESTION(String qUESTION) {
        QUESTION = qUESTION;
    }

    public void setOPTA(String oPTA) {
        OPTA = oPTA;
    }

    public void setOPTB(String oPTB) {
        OPTB = oPTB;
    }

    public void setOPTC(String oPTC) {
        OPTC = oPTC;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setOPTD(String oPTD) {
        OPTD = oPTD;
    }

    public void setANSWER(String aNSWER) {
        ANSWER = aNSWER;
    }

    public void setLINK(String lINK) {
        LINK = lINK;
    }

    public void setIMG(String iMG) {
        IMG = iMG;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public String getOPTA() {
        return OPTA;
    }

    public String getOPTB() {
        return OPTB;
    }

    public String getOPTC() {
        return OPTC;
    }

    public String getOPTD() {
        return OPTD;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public String getLINK() {
        return LINK;
    }

    public String getIMG() {
        return IMG;
    }
}