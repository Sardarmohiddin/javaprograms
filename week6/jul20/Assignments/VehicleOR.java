/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."
*/
class VehicleOR
  {
    void start_engine()
    {
      System.out.println("engine starting");
    }
  }
class Car extends VehicleOR{
  void start_engine()
  {
    System.out.println(" car engine starting");
  }
}
class Motorcycle extends VehicleOR{
  void start_engine()
  {
    System.out.println("motor cycle engine starting");
  }
}
class Vehicle
  {
    public static void main(String args[])
    {
      VehicleOR v=new VehicleOR();
      v.start_engine();
      VehicleOR c=new Car();
      c.start_engine();
      VehicleOR m=new Motorcycle();
      m.start_engine();
    }
  }