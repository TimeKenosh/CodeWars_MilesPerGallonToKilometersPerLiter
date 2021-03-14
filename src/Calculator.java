public class Calculator {
    public double mpgToKpH(double mpg){
        final double imperialGallon = 4.54609188;
        final double mile = 1.609344;
        return mpg/imperialGallon*mile;
    }
}
