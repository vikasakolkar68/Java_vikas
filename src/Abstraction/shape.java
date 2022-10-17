package Abstraction;

import java.awt.Rectangle;
import java.awt.Shape;

abstract class shape {
	
	abstract void draw();
	
	class rectangle extends shape{

		void draw() {

			System.out.println("drawing rectangle");
			
		}
		
		class circle extends shape{
			void draw() {
				System.out.println("drawing circle");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Shape s=new circle();
		s.draw();
		

	}

}
