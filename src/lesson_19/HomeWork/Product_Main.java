package lesson_19.HomeWork;

public class Product_Main {
    public static void main(String[] args) {
        Product product1 = new Product("Banana", 2.5);
        Product product2 = new Product("Fish", 10.0);
        Product product3 = new Product("Coffee", 6.5);

        System.out.println("Info: " + product1.info());
        System.out.println("Info: " + product2.info());
        System.out.println("Info: " + product3.info());
    // Увеличение цены на %
        product2.changePrice(10);

        System.out.println("New price : " + product2.getPrice());
        System.out.println("Total products : " + Product.getTotal());
    }
}
