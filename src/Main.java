public class Main {
    public static void  main(String[] args) {
        int [] sales = new int[] {10, 200, 3000, 40000};
        SalesManager salesManager = new SalesManager(sales);

        int max = salesManager.max();
        System.out.println(max);

    }
}
