package duckdemo.test;

import duckdemo.model.Duck;
import duckdemo.model.MallardDuck;

public class DuckTest {
	  public static void main(String[] args) {
	    Duck duck=new MallardDuck();
	    duck.performFly();
	    duck.performQuack();  
	    duck.swim();
	    duck.display();
	  }
	 
}