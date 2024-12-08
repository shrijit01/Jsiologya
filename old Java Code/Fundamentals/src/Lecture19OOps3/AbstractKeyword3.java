package Lecture19OOps3;

public abstract class AbstractKeyword3 {
	private String color;
    int maxSpeed;

//    public void Vehicle(){
//      System.out.println("Vehicle's Constructor");
//      maxSpeed= 60;
//    }
    
    public void Vehicle(int maxSpeed){
    	color = "red";
      System.out.println("Vehicle's Constructor");
      this.maxSpeed = maxSpeed;
    }

    public void Vehicle(){
    	//worked in previous file to understand the final keyword
    	color = "red";
      System.out.println("Vehicle's Constructor");
//      this.maxSpeed = maxSpeed;
      maxSpeed = 60;
    }

    public String getColor(){
      return color;
    }

    public void setColor(String color){
      this.color=color;
    }

    public void print(){
      System.out.println("Vehicle"+"color"+color);
    }
    
  //for abstract file
    public abstract boolean isMOtorized();
    public abstract String getCompany();
}
