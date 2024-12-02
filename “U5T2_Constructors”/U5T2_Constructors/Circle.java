/** 
 * This class represents a Circle object
 * 
 * @author Jaden
 */
public class Circle {
    /** The radius of the Circle */
    private double radius;
    
    /** 
     * Instantiates a Circle object
     * 
     * @param myRadius The radius
     */
    public Circle(double myRadius) {
      radius = myRadius;
    }
  
    /** 
     * Sets the radius of the Circle to a new value
     * 
     * @param newRadius The new radius of the circle
     */
    public void setRadius(double newRadius) {
      radius = newRadius;
    }
  
    /** 
     * Returns the current radius of the circle
     * 
     * @return The radius of the circle
     */
    public double getRadius() {
      return radius;
    }
  
    /** 
     * Returns the current diameter of the circle
     * 
     * @return The radius of the circle times 2
     */
    public double diameter() {
      return radius * 2;
    }
    
    /** 
     * Returns the current perimeter of the circle
     * 
     * @return The diameter of the circle times π
     */
    public double perimeter(){
      return Math.PI * diameter();
    }
  
    /** 
     * Returns the current radius of the circle in a String
     * 
     * @return "Circle with a radius of" and the radius
     */
    public String circInfo() {
      return "Circle with a radius of " + radius;
    }
  }
  