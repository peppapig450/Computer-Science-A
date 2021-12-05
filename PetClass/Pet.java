/**
    Pet class (complete comments)
    @author Nick Brady
    @since December 3, 2021

*/

public class Pet
{
   // Keep track of the name, age, weight, type of animal, and breed of the pet
  private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

   // Write 2 constructors, accessor (get) methods, and a toString method. Use good commenting.
    public Pet() 
    {
      name = "";
      age = 0;
      weight = 0;
      type = "";
      breed = "";
    }

    public Pet(String initName, String initType, String initBreed, int initAge, double initWeight)
    {
        name = initName;
        age = initAge;
        breed = initBreed;
        weight = initWeight;
        type = initType;
    }
    
    /** getName()
     * @return name */ 
    public String getName() {
      return name;
    }
    /** getAge()
     * @return age */ 
    public int getAge() {
      return age;
    }
    /** getWeight()
     * @return weight */
    public double getWeight() {
      return weight; 
    }
    /** getType()
     * @return type */ 
    public String getType() {
      return type;
    }
    /** getBreed() 
     * @return breed */ 
    public String getBreed() {
      return breed; 
    }

    // toString() method 
    public String toString() {
      return type + ": " + breed + ", " + name + ", " + age + ", " + weight;
    }
    
    // Don't forget to complete the main method in the TesterClass below!

}

