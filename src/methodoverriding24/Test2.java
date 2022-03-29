package methodoverriding24;

class Test2 {
public static void main(String arg[]){
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();

    System.out.println("SBI Rate of Interst :"+s.getRateOfInterest());
    System.out.println("ICICI Rate of Interest : "+i.getRateOfInterest());
    System.out.println("AXIS Rate of Interest : "+a.getRateOfInterest());
}
}
