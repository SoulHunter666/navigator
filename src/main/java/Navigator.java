public class Navigator implements Runnable{

    int distance;
    Car car1;

    public Navigator(int distance, Car car1){
        this.distance = distance*1000;
        this.car1 = car1;
    }

    @Override
    public void run() {
        int t = 0;
        double AverageSpeed;
        double obshayV = 0;
        double SpeedinMS;
        int TimeRemain;

        for(int i = distance; i>0; i-=SpeedinMS){
            SpeedinMS = (car1.getSpeed()*1000)/3600;
            t++;
            obshayV+=SpeedinMS;
            System.out.println("Скорость автомобиля: " + car1.getSpeed()+" км/ч");
            AverageSpeed = (int) ((obshayV)/t);
            System.out.println("Средняя скорость автомобиля: "+ String.format("%1$,.2f", AverageSpeed/0.28) + " км/ч");
            System.out.println("Осталось ехать: " + i + " метров");
            TimeRemain = (int) (i/AverageSpeed);
            System.out.println("Время прибытия: " + TimeRemain + " секунд");
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Вы приехали");
    }
}