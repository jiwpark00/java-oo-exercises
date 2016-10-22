package javagram.filters;

import javagram.Picture;

public interface Filter {
	
	public Picture process(Picture original);
	// This creates the interface that all the filters will follow.
}
