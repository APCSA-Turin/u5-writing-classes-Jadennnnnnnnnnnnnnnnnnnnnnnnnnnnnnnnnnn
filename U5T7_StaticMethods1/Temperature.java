public class Temperature {
    private double high;
    private double low;
    private String scale;

    public Temperature(double high, double low, String type) {
        this.high = high;
        this.low = low;
        if (type.equals("F") || type.equals("C")) {
            scale = type;
        } else scale = "F";
    }

    public static double convertCtoF(double temp) {
        return temp * (9 / 5) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * (5 / 9);
    }

    public void changeToC() {
        if (scale.equals("F")) {
            scale = "C";
            high = convertFtoC(high);
            low = convertFtoC(low);
        }
    }

    public void changeToF() {
        if (scale.equals("C")) {
            scale = "F";
            high = convertCtoF(high);
            low = convertCtoF(low);
        }
    }

    public String tempInfo() {
        String str = "High Temperature: " + high + " " + scale + "\n";
        str += "Low Temperature: " + low + " " + scale;
        return str;
    }
}
