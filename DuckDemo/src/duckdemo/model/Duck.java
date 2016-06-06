package duckdemo.model;

public abstract class Duck {
	  //����Ϊ������Ϊ�ӿ����ͣ����Ͷ���Ϊʵ�����͵�����
	  FlyBehavior flyBehavior;
	  QuackBehavior quackBehavior;

	  public void performFly() {
	    //�����д���fly()��Ϊ������ί�ϸ�����flyBehavior��ָ�����Ϊ����
	    flyBehavior.fly();
	  }

	  public void performQuack() {
	    quackBehavior.quack();
	  }

	  public void swim() {
	    System.out.println("�һ���ӾӴ��");  
	  }
	  
	  public abstract void display();
	}
