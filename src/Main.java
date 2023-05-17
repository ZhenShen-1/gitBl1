public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{10, 200, 3000, 40000};
        SalesManager salesManager = new SalesManager(sales);


        long max = salesManager.max();
        long min = salesManager.min();
        long average = salesManager.average();


        System.out.println(max);
        System.out.println(min);
        System.out.println(average);

    }
}
