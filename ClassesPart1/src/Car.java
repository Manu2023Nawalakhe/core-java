public class Car {
    private String make = "Tesla";
    private String model = "Model x";
    private String color = "Gray";
    private int door = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
//        this.make = make;

        if(make ==null) make = "Unknow";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden","porsche","tesla" ->this.make = make;
            default ->
                    this.make ="Unsupported";
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(door + "-Door " + make + " " + model + " " + color + " " + (convertible ? "Convertible" : ""));
    }
}
