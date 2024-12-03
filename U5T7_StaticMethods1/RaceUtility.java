public class RaceUtility {
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static String makeProper(String str) {
        str = str.toLowerCase();
        String newStr = "";

        for (int i = 0; i < str.length(); i ++) {
            String charac = str.substring(i, i + 1);
            if (i == 0) {
                newStr += charac.toUpperCase();
            } else {
                if (str.substring(i - 1, i).equals(" ")) {
                    newStr += charac.toUpperCase();
                } else newStr += charac;
            }
        }

        return newStr;
    }
}
