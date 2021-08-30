public class OperatoryLogiczne {
    public static void main(String[] args) {
        int hour = 20;
        // && logical and
        if(hour < 21 && hour > 0 && hour <= 24){
            System.out.println("jest wieczór ");
        }
        // || logical or
        if (hour > 0 || hour < -5 ){
            System.out.println("warunek 2 jest spełniony");
        }

    }
}
