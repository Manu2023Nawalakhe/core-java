public class Main {

    public static void main(String[] args){


        Car car = new Car();
//        Car car = null;
      car.setMake("Porsche");
      car.setColor("Orange");
      car.setDoor(4);
      car.setConvertible(true);
      car.setModel("Carrera");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("door = " + car.getDoor());
        System.out.println("convertible = " + car.isConvertible());
        car.describeCar();

        Car target = new Car();

        target.setMake("Porsche");
        target.setColor("Orange");
        target.setDoor(4);
        target.setConvertible(true);
        target.setModel("Carrera");

        target.describeCar();
    }
}
