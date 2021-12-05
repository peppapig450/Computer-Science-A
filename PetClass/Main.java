import static java.lang.System.out;

/**
 * A simple class to run the Pet lcass
 *
 * @author Nick Brady
 * @version December 2021
 */

class Main {
  // main method for testing 
  public static void main(String[] args) {
    // Create 3 Pet objects and test all the methods 
    Pet p1 = new Pet("Joe", "Dog", "Great Dane", 420, 69.42);
    Pet p2 = new Pet("Deez", "Whale", "Killer Whale", 20, 6600.69);
    Pet p3 = new Pet("Shiesty", "Cat", "Norwegian Forest Cat", 10, 20.4);
    out.println(p1 + "\n" + p2 + "\n" + p3);
  }
}
