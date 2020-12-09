package cConverter;

import java.util.Scanner;

public class CConverter {
    public static void main(String args[]){
        double todayRate;
        int choice;
        double inr;
        char ansr ;
        do {
            System.out.println("different types of converters");
            System.out.println("1.PoundToCad");
            System.out.println("2.CadToDollar");
            System.out.println("3.CadToInr");
            System.out.println("4.CadToEuro");
            System.out.println("5.CadToYen");
            System.out.println("6.CadToPound");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            choice = sc.nextInt();
            System.out.println("enter today rate");
            todayRate = sc.nextDouble();
            CcurrencyCov cc = new CcurrencyCov(todayRate);
            switch (choice){
                case 1 :
                    System.out.println("enter Pound");
                    double Poundc = sc.nextDouble();
                    System.out.println(Poundc+"Pound are converted to "+cc.PoundToCad(Poundc)+ "Cad");
                    break;
                case 2 :
                    System.out.println("enter CAD");
                    double Cadd = sc.nextDouble();
                    System.out.println(Cadd+"CAD are converted to "+cc.CadToDollar(Cadd)+ "Dollar");
                    break;
                case 3 :
                    System.out.println("enter CAD");
                    double Cadi = sc.nextDouble();
                    System.out.println(Cadi+"CAD are converted to "+cc.CadToInr(Cadi)+ "INR");
                    break;
                case 4 :
                    System.out.println("enter CAD");
                    double Cade = sc.nextDouble();
                    System.out.println(Cade+"CAD are converted to "+cc.CadToEuro(Cade)+ "Euro");
                    break;
                case 5 :
                    System.out.println("enter CAD");
                    double Cady = sc.nextDouble();
                    System.out.println(Cady+"CAD are converted to "+cc.CadToYen(Cady)+ "Yen");
                    break;
                case 6 :
                    System.out.println("enter CAD");
                    double Cadp = sc.nextDouble();
                    System.out.println(Cadp +"CAD are converted to "+cc.CadToPound(Cadp)+ "Pound");
                    break;
            }
            System.out.println(" Click 'y' if u wanna try another one");
            ansr = sc.next().charAt(0);

        }while (ansr =='y');


    }
}

