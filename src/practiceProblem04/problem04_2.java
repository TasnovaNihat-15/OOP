package practiceProblem04;


public class problem04_2 {


    public void filterProducts(String category) {
        System.out.println(" category: " + category);
    }


    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("   price : " + minPrice + " and " + maxPrice);
    }


    public void filterProductsByBrand(String brand) {
        System.out.println(" brand: " + brand);
    }


    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("category :" + category + "  price : " + minPrice + " and " + maxPrice);
    }


    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("brand : " + brand + "  category :'" + category + "'  price :" + minPrice + " and " + maxPrice);
    }

    public static void main(String[] args) {
        problem04_2 filter = new problem04_2();


        filter.filterProducts("Electronics");
        filter.filterProducts(100, 500);
        filter.filterProductsByBrand("Nike");
        filter.filterProducts("Fashion", 50, 300);
        filter.filterProducts("Electronics", 200, 1000, "Apple");
    }
}
