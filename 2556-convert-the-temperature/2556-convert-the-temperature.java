class Solution {
    public double[] convertTemperature(double celsius) {
        double[] trouble=new double[2];
        trouble[0]=celsius+273.15;
        trouble[1]=celsius*1.80+32.00;
        return trouble;
    }
}