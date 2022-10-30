public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car();
        Navigator nv = new Navigator(3, car1);
        nv.run();
    }
}

