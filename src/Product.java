public class Product {
    private int id,count;
    private String name;
    private double promotions = 10;
    private double  price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPromotions() {
        return promotions;
    }

    public void setPromotions(double promotions) {
        this.promotions = promotions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   public double calculatePromotions( ){
        return price - price*promotions/100;
   }
   public double difference(){
        return price - calculatePromotions();
   }

    public static void main(String[] args) {
        Product[] arr = new Product[5];
       arr[0] = new Product("car",2000);
       arr[1] = new Product("bike",1000);
       arr[2] = new Product("dog",1000);
       arr[3] = new Product("cat",1500);
       arr[4] = new Product("chicken",500);
        double sum = 0 ;
        double difference = 0;
       for (int i = 0;i<arr.length;i++){
            sum += arr[i].calculatePromotions();
            difference += arr[i].difference();
       } System.out.println(sum);
        System.out.println(difference);
    }
}
