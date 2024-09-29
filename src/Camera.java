import java.util.Scanner;

public class Camera {
    private String nume;
    private int volume;
    public Difuzor[] difuzor=new Difuzor[5];
    private int nrdifuzoare=-1;

    Scanner sc=new Scanner(System.in);

    public Camera(){
        setNume();
        setVolume();

    }

    public void setNume(){
        System.out.println("Introduceti numele camerei:");
        this.nume=sc.next();
    }
    public String getNume(){
        return this.nume;
    }
    public void setVolume(){
        System.out.println("Setati volumul camerei:");
        this.volume=sc.nextInt();

    }
    public int getVolume(){
        return this.volume;
    }

    public void changeNumecamera(Camera camera){
        camera.nume=sc.next();
    }

    public void changeVolumecamera(Camera camera){
        camera.volume=sc.nextInt();
    }

    public void addDifuzor(){
        if(nrdifuzoare<4) {
            if(nrdifuzoare>=0){
                System.out.println("Restul difuzoarelor din camera:");
                getToateDifuzoarele();
            }
            nrdifuzoare=nrdifuzoare+1;
            System.out.println("Introduceti pozitia difuzorului(Center, FR ,FL ,RR sau RL): ");
            String poz=sc.next();
            System.out.println("Introduceti frecventa difuzorului(Low, Mid sau High): ");
            String frecv=sc.next();
            difuzor[nrdifuzoare]=new Difuzor(poz,frecv);

        }else System.out.println("Nu mai puteti adauga difuzoare in aceasta camera.");

    }

    public void getToateDifuzoarele(){
        if(nrdifuzoare>(-1)) {
            for (int i = 0; i <= nrdifuzoare; i++) {
                System.out.println("Difuzorul " + (i + 1));
                System.out.println("Pozitia: " + difuzor[i].getPozitie());
                System.out.println("Frecventa: " + difuzor[i].getFrecventa());
                System.out.println();
            }
        }else System.out.println("Inca nu sunt difuzoare in aceasta camera.");
    }


}
