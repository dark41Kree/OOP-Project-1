import java.util.List;
import java.util.Scanner;

public class Casa {

    private String numecasa;
    public Camera[] camera=new Camera[100];
    static int nrcamere=0;

    Scanner sc=new Scanner(System.in);

    public Casa(){
        setNumeCasa();
        setCamere();
    }

    private void setNumeCasa(){
        System.out.println("Dati numele Casei:");
        this.numecasa=sc.next();
    }
    public String getNumeCasa(){
        return this.numecasa;
    }

    private void setCamere(){
        System.out.println("Cate camere are casa? ");
        this.nrcamere=sc.nextInt();
        for(int i=0;i<nrcamere;i++){
            System.out.println("Camera "+(i+1)+":");
            camera[i]= new Camera();
        }
    }

    public static void addNumarcamere(){
        nrcamere=nrcamere+1;
    }

    public void decreaseNumarcamere(){
        nrcamere=nrcamere-1;
    }

    public int getNumarcamere(){
        return nrcamere;
    }

    public void addcamera(){
        camera[nrcamere]= new Camera();
    }



}
