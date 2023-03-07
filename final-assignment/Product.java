abstract class Product {
    String name;
    int code;
    double amount;
    Product(String n, int c, double p) {
        name = n;
        code = c;
        amount = p;
    }
    abstract void show();
}