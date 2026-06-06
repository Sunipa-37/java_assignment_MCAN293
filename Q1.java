class Vehicle{
    String brand;
    String model;
    int year;
    Vehicle(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;

    }
    void display(){
        System.out.println("brand: "+brand+" model: "+model+" year: "+year);
    }
}
class Car extends Vehicle{
    String fueltype;
    Car(String brand,String model,int year,String fueltype){
        super(brand,model,year);
        this.fueltype=fueltype;

    }
    void display(){
        System.out.println("brand: "+brand+" model: "+model+" year: "+year+" fueltype: "+fueltype);
    }
}
class Luxury_car extends Car{
    String feature;
    Luxury_car(String brand,String model,int year,String fueltype,String feature){
        super(brand,model,year,fueltype);
        this.feature=feature;
    }
    void display(){
        System.out.println("brand: "+brand+"\nmodel: "+model+"\nyear: "+year+"\nfueltype: "+fueltype+" \nfeature: "+feature);
    }
}
class Q1{
    public static void main(String[] args) {
        Luxury_car obj =new Luxury_car("tesla", "model s", 2022,"electic","autopilot");
        obj.display();
    }
}