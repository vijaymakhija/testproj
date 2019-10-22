package com.optum;

public class RectanglesOverlap {
	
	public class Rectangle{
		private Point topLeft;
		private Point bottomRight;
		
		public Point getTopLeft() {
			return topLeft;
		}

		public Point getBottomRight() {
			return bottomRight;
		}

		public void setTopLeft(Point topLeft) {
			this.topLeft = topLeft;
		}

		public void setBottomRight(Point bottomRight) {
			this.bottomRight = bottomRight;
		}

		boolean isOverlapping(Rectangle other){
			if(other.getTopLeft().getX() < this.getBottomRight().getX() 
					|| this.getTopLeft().getX() < other.getBottomRight().getX())
				return true;
			
			if(other.getBottomRight().getX()>this.getTopLeft().getX() ||
					this.getBottomRight().getX()>this.getTopLeft().getX()){
				return true;
			}
			
			return false;
		}
	}
	
	public class Point{
		private int x,y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		}
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
