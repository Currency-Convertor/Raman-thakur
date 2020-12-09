package cConverter;

public class CcurrencyCov {

    double er = 0;

public CcurrencyCov(double todayRate) {
    er = todayRate;
}
    public double PoundToCad(double Poundc){
        double cad = 0;
        cad = Poundc*er;
        return cad;
    }
    public double CadToDollar(double Cadd){
        double dollar = 0;
        dollar = Cadd*er;
        return dollar;
    }
    public double CadToInr(double Cadi){
        double inr = 0;
        inr = Cadi*er;
        return inr;
    }    
    public double CadToEuro(double Cade){
        double euro = 0;
        euro = Cade*er;
        return euro;
    }
    public double CadToYen(double Cady){
        double yen = 0;
        yen = Cady*er;
        return yen;
    }
    public double CadToPound(double Cadp){
        double pound = 0;
        pound = Cadp*er;
        return pound;
    }
}






