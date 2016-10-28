package javagram.filters;

import javagram.Picture;
import java.awt.Color;

public class GrayscaleFilter implements Filter { // Implementing filter

	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	    	  
	    	  int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	    	  
	    	  int gray = (int) Math.round(c.getRed()*0.2989) + 
	    		(int) Math.round(c.getGreen()*0.5870) +
	    	  (int) Math.round(c.getBlue()*0.1140); // Math equation to make gray color
	          
	          processed.set(i, j, new Color(gray, gray, gray));
	    	  
	      }
	    }
		
		return processed;
	}

}
