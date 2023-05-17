public class Main {
    public static void  main(String[] args) {
        long [] sales = new long[] {10, 200, 3000, 40000};
        SalesManager salesManager = new SalesManager(sales);

        long max = salesManager.max();
        System.out.println(max);

    }
}
