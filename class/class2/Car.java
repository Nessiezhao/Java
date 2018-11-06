public class Car{
    private String id;
    private String color;
    private int maxSpeed;
    public Car(){

    }
    public Car(String id,String color,int maxSpeed){
        this.id = id;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void print(){
        System.out.println("车牌号：" + id + ",颜色：" + color + ",最大速度：" + maxSpeed );
    }
    public static void main(String[] args){
        Car c = new Car("123456","红色",120);
        c.print();
        Car c1 = new Car();
        c1.setId("A121323");
        c1.setColor("黑色");
        c1.setMaxSpeed(240);
        c1.print();
    }
}
