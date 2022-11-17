class Shape{
	
	void display(){
		System.out.println("This is a Shape.");
	}
	
	void draw(){
		System.out.println("The Shape is Drawn.");
	}
	
	void erase(){
		System.out.println("The Shape is Erased.");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("The Circle is Drawn.");
	}
	
	void erase(){
		System.out.println("The Circle is Erased.");
	}
}

class Triangle extends Shape{
	void draw(){
		System.out.println("The Triangle is Drawn.");
	}
	
	void erase(){
		System.out.println("The Triangle is Erased.");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("The Square is Drawn.");
	}
	
	void erase(){
		System.out.println("The Square is Erased.");
	}
}

public class ShapePoly{
	public static void main(String args[]){
		Shape circle=new Circle();
		Shape triangle=new Triangle();
		Shape square=new Square();
		
		circle.draw();
		circle.erase();
		triangle.draw();
		triangle.erase();
		square.draw();
		square.erase();
	}
}