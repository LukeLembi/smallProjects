package my.project;

import java.util.ArrayList;

public class Kandzi {
    Slovo[] poleKandzi = new Slovo[100];



    protected void naplneni(){
        Slovo kandzi0 = new Slovo("水", "voda", "mizu", "sui");
        Slovo kandzi1 = new Slovo("道","cesta", "miči", "dó");
        Slovo kandzi2 = new Slovo("住", "bydlet", "sumu", "džú");
        Slovo kandzi3 = new Slovo("所", "místo", "tokoro", "šó");
        poleKandzi[0] =kandzi0;
        poleKandzi[1] =kandzi1;
        poleKandzi[2] =kandzi2;
        poleKandzi[3] =kandzi3;
    }


}
