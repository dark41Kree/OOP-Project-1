import java.util.Scanner;

public class Difuzor {

    private String pozitie;
    private String frecventa;

    Scanner sc=new Scanner(System.in);

    public Difuzor(String pozitie,String frecventadifuzor){
        this.pozitie=pozitie;
        this.frecventa=frecventadifuzor;
    }

    public void changePozitie(String pozitie){
        this.pozitie=pozitie;
    }

    public String getPozitie(){
        return pozitie;
    }

    public void changeFrecventa(String frecventa){
        this.frecventa=frecventa;
    }

    public String getFrecventa(){
        return frecventa;
    }


}
