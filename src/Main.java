import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int meniu;
        Casa casa1=null;

        ///////////////////
                Scanner scanner = new Scanner(System.in);


                do {
                    System.out.println("0. Iesire din program");
                    System.out.println("1. Initializare casa si camere");
                    System.out.println("2. Adaugare camera");
                    System.out.println("3. Afisarea tuturor camerelor(cu detalii)");
                    System.out.println("4. Afisare nume camera");
                    System.out.println("5. Afisare volum camera");
                    System.out.println("6. Afisare numar total de camere");
                    System.out.println("7. Adaugare difuzor in camera aleasa");
                    System.out.println("8. Afisarea tuturor difuzoarelor dintr-o camera");




                    meniu = scanner.nextInt();

                    switch (meniu) {
                        case 0:
                            break;
                        case 1:
                            if(casa1==null)
                            casa1=new Casa();
                            else System.out.println("Casa a fost deja initializata.");
                            //scanner.nextLine();
                            break;
                        case 2:
                            if(CheckInitHome.check(casa1)) {break;}
                                casa1.addcamera();
                                Casa.addNumarcamere();

                            break;
                        case 3:
                            if(CheckInitHome.check(casa1)) {break;}
                                for(int i=0;i<Casa.nrcamere;i++){
                                    System.out.println("Camera "+(i+1));
                                    System.out.println("Nume: "+casa1.camera[i].getNume());
                                    System.out.println("Volumul: "+casa1.camera[i].getVolume());
                                    System.out.println();
                                }

                            break;
                        case 4:
                            //afisare nume camera
                            if(CheckInitHome.check(casa1)) {break;}
                                System.out.println("Introduceti numarul camerei: ");
                                int cn=scanner.nextInt();
                                System.out.println(casa1.camera[cn-1].getNume());
                            break;
                        case 5:
                            //afisare volum camera
                            if(CheckInitHome.check(casa1)) {break;}
                                System.out.println("Introduceti numarul camerei: ");
                                int cv=scanner.nextInt();
                                System.out.println(casa1.camera[cv-1].getVolume());

                            break;
                        case 6:
                            if(CheckInitHome.check(casa1)) {break;}
                                System.out.println("Total camere: "+ Casa.nrcamere);


                            break;
                        case 7:
                            if(CheckInitHome.check(casa1)) {break;}
                                System.out.println("In ce camera adaugati difuzorul? ");
                                int camdif= scanner.nextInt();
                                if((camdif>0)&&(camdif<=Casa.nrcamere)){
                                    casa1.camera[camdif-1].addDifuzor();
                                }else System.out.println("Nu exista aceasta camera.");

                            break;
                        case 8:
                            if(CheckInitHome.check(casa1)) {break;}
                                System.out.println("Din ce camera sa se afiseze difuzoarele? ");
                                int camafis= scanner.nextInt();
                                if((camafis>0)&&(camafis<=Casa.nrcamere)){
                                    casa1.camera[camafis-1].getToateDifuzoarele();
                                }else System.out.println("Nu exista aceasta camera.");

                            break;

                        default:
                            System.out.println("Varianta gresita");
                    }

                    System.out.println("Apasati o tasta pentru a continua...");
                    scanner.nextLine();
                    scanner.nextLine();
                } while (meniu != 0);

                //scanner.close();



        }

    }


