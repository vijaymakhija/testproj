package com.optum;

public class Rectangle2D {

	    double x;
	    double y;
	    double width;
	    double height;

	    /**
	     * This rectangle contains the specified point if
	     *
	     * The x coordinate of the point lies between x and x + width
	     *
	     * and
	     *
	     * The y coordinate of the point lies between y and y + height
	     *
	     * @param x - The x position of the coordinate to check
	     * @param y - The y position of the coordinate to check
	     * @return true if the specified coordinate lies within the rectangle.
	     */
	    public boolean contains(double x, double y) {
	        return x >= this.x
	                && y >= this.y
	                && x <= this.x + this.width
	                && y <= this.y + this.height;
	    }

	    /**
	     * The rectangle contains the specified rectangle if the rectangle contains both diagonally opposite corners.
	     *
	     * @param r - The rectangle to check.
	     * @return - true if the specified rectangle is entirely contained.
	     */
	    public boolean contains(Rectangle2D r) {
	        return contains(r.x, r.y)
	                && contains(r.x + r.width, r.y + r.height);
	    }

	    /**
	     * The rectangle overlaps the specified rectangle if the rectangle contains any of the corners.
	     *
	     * @param r - The rectangle to check
	     * @return - true if any corner of the rectangle is contained.
	     */
	    public boolean overlaps(Rectangle2D r) {
	        return contains(r.x, r.y)
	                || contains(r.x + r.width, r.y + r.height)
	                || contains(r.x, r.y + r.height)
	                || contains(r.x + r.width, r.y);
	    }
	}
