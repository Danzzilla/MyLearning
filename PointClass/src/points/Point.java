package points;
//For points (x, y)

public class Point{
 private int x;                                               //Fields of the class
 private int y;
 
 public Point(int initialX, int initialY){                    //Constructs a point at the given x/y location
    x = initialX;
    y = initialY;
 }
 
 public Point(){                                              //Constructs a default point at origin
    x = 0;
    y = 0;
 }
 
 public double distance(Point other){                         //distance between two points. We pass one point as a parameter
    int dy = y - other.getY();
    int dx = x - other.getX();
    return Math.sqrt(dx*dx + dy*dy);
 }
 
 public double distance(Point r1, Point r2){
    double dx = r1.getX() - r2.getX();
    double dy = r1.getY() - r2.getY();
    return Math.sqrt(dx*dx - dy*dy);
 }
 
 public String toString(){                                    //to string method
    return "("+x+", "+y+")";
 }   
    
 public int getX(){                                           //First getter/accessor
    return x;
 }
 
 public int getY(){                                           //Second getter/accessor
    return y;
 }
 
 public void setX(int newX){                                  //First setter/mutator
    x = newX;
 }
 
 public void setY(int newY){                                  //Second setter/mutator
    y = newY;
 }
 
 public double distanceFromOrigin(){                          //Distance from origin
    return Math.sqrt(x*x + y*y);
 }
                                    
 public void setLocation( int newX, int newY){                //Allows to set a whole point
    x = newX;
    y = newY;
 }
 
 public void translate(int dx, int dy){                       //shifts a point by inputted amount
    setLocation(x+dx, y+dy);
 }
}
