package duckdemo.model;

public class RubberDuck extends Duck {
	  public RubberDuck() {
		    flyBehavior=new FlyNoWay();
		    quackBehavior=new Squeak();
		  }
		  
		  public void display() {
		    System.out.println("我是玩具鸭子！！");
		  }
		}

