package my.project;

import java.sql.SQLOutput;

public class Slovo {
    String znaky; //Kandži, Hiragana, Katakana
    String cesky; // Kandži - význam znaku, Slovo - český překlad
    String cteniKun; //Kandži - čtení kun-jomi(japonské), Slovník - česká transkripce
    String cteniOn; //Kandži - čteni on-jomi(sinojaponské), Slovník - anglická transkripce

    // kun-jomi se převážně čte, když je znak v textu osamoceně v základním významu (obklopený gramatickými koncovkami či částicemi, nikoliv jinými znaky
    // on-jomi se převážně čte v kombinaci s jiným znakem

    public Slovo(String znaky, String cesky, String cteniKun, String cteniOn){
        this.znaky = znaky;
        this.cesky = cesky;
        this.cteniKun = cteniKun;
        this.cteniOn = cteniOn;
    }

    @Override
    public String toString(){
        return znaky+"\t\t\t"+cteniKun+"\t\t\t\t\t\t"+cteniOn+"\t\t\t\t\t\t"+cesky; // ještě je potřeba upravit mezery
    }
}
