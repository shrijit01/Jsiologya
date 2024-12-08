package Lecture19OOps3;

//public abstract   class Car extends AbstractKeyword3{

    int numDoors;
    int numGears;

    public Car(){
      super();
      System.out.println("Car's Constructor");
      numDoors=4;
      numGears=5;
    }

    public Car(int numDoors, int maxSpeed){
      super();
      System.out.println("Car's Constructor");
      this.numDoors = numDoors;
    }

    public void print(){
      super.print();
      System.out.println("Car numDoors"+ numDoors+ "numGears"+numGears);
    }

    public void printMaxSpeed(){
      maxSpeed=150;
      System.out.println(maxSpeed+" "+maxSpeed);
    }
    //Abstract
	@Override
	public boolean isMOtorized() {
		return true;
	}
    
	public abstract String getCompany();
    
    
}