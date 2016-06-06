package duckdemo.model;

public class RedheadDuck extends Duck {
	  public RedheadDuck() {
		    flyBehavior=new FlyWithRocket();
		    quackBehavior=new MuteQuack();
		  }
		  public void display() {
		    System.out.println("我是红头鸭子！！！！！");
		  }
		}
