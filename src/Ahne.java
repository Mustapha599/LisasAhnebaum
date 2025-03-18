public class Ahne {
    private String vorname;
    private String nachname;
    private char geschlecht;

    public Ahne(String pVorname,String pNachname, char pGeschlecht){

      vorname= pVorname;
        nachname= pNachname;
        geschlecht= pGeschlecht;
    }
    public String getVorname(){
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }
}
