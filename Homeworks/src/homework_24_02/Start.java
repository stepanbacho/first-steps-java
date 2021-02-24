package homework_24_02;

public class Start {
    public static void main(String[] args) {

        trafficSignal[] signals = trafficSignal.values();

        for (trafficSignal signal : signals){
            System.out.println(signal.name() + "::" + signal.ordinal());
        }




    }
}
