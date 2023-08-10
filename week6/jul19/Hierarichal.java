class Herbivorous
{  
void food()
  {
    System.out.println("depends on the  fruits ,crops etc for food");
  }  
}  
class Animals extends Herbivorous
{  
void domestic()
  {
    System.out.println("domestic animals are herbivorous");
  } 
}  
class Humans extends Herbivorous
{  
void vegetarians()
  {
    System.out.println("all humans of vegetarians depends on the plants");
  }  
 }  
class Hierarichal{  
public static void main(String args[]){  
Humans humans=new Humans();
  Animals animals=new Animals();
humans.vegetarians();  
humans.food();
  animals.food();
  animals.domestic();

}}  