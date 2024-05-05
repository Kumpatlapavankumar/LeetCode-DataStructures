class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double fahrenheit=celsius*1.80+32.00;
        double[] arr={kelvin,fahrenheit};
        return arr;
    }
}
