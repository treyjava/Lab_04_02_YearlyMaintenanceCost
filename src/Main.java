public class Main {
    public static void main(String[] args)
    {
        double springCost = 891.34;
        double summerCost = 1381.51;
        double fallCost = 791.86;
        double winterCost = 1873.31;
        double yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Your seasonal maintenance costs are Spring: $" + springCost + " Summer: $" + summerCost + " Fall: $" + fallCost + " Winter: $" + winterCost + " Making your yearly maintenance cost $" + yearlyCost);
    }
}