public class SpeedConverter {
    public static long  mph(double kmph){
        if(kmph<0){
            return -1;
        }
        return Math.round(kmph/1.609);

    }
    public static void printConversion(double kmph){
        if(kmph<0){
            System.out.println("invalid value");
        } else { long milesperhour = mph(kmph);
            System.out.println(kmph + "kmph"+milesperhour+"mph");
    }
}}
