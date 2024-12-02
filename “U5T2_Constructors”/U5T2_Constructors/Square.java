public class Square {
    private int side;
    private String name;
  
    public Square() {
      side = 0;
      name = "";
    }
    
    public int getSide() {
      return side;
    }
  
    public String getName() {
      return name;
    }
  
    public String info() {
      return "side: " + side + ", name: " + name;
    }
  }
  