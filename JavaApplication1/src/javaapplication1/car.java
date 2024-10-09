
public class car {
    
    // Fields
      String brand;
      String color;
      int year;
    // Methods
      
            
     public void start() {
        System.out.println("The car is starting");}
     public void stop() {
       System.out.println("The car is stoping");}
     public void brake() {
     System.out.println("The car is braking");}

  public static void main(String[] args) {
        // Tạo đối tượng Car
        car myCar = new car();
        
        // Thiết lập các giá trị cho đối tượng
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.year = 2020;
        // Gọi các phương thức của đối tượng
        myCar.start();
        myCar.brake();
        myCar.stop();
        // In ra các thông tin của đối tượng
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Color: " + myCar.color);
        System.out.println("Year: " + myCar.year);
    }
}



