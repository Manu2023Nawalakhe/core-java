public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
      super("Mutt","big",500);
    }

    public Dog(String type, double weight){
this(type,weight,"perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,weight< 15 ? "small" : (weight <35 ?"medium":"large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

        if(type == "Woof"){
            System.out.println("Ow wooooo!");
        }
bark();
System.out.println("");
    }

    @Override
    public void move(String speed) {
        super.move(speed);

//        System.out.println("Dogs walk,run and wag their tail");

        if (speed != "small"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
    }

    public void bark(){
        System.out.println("Woof!");
    }
    public void run(){
        System.out.println("Dog Running");
    }
    public void walk(){
        System.out.println("Dog Walking");
    }
    public void wagTail(){
        System.out.println("tail wagging");
    }
}
