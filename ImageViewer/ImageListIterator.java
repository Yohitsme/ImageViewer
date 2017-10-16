package a3;
import java.util.Iterator;

public class ImageListIterator implements Iterator<Image> {

	
	// Using the Iterator design class
	private Image[] contents;

	public ImageListIterator(Image[] Array){
		this.contents = Array;
	}
	/** The next natural number to produce. */
	private int nextNumber = 0;

	@Override
	public boolean hasNext() {
		if (nextNumber <= contents.length) {
			return true;
		}
		return false;
	}

	@Override
	public Image next() {

		if (this.hasNext()){
			this.nextNumber++;
			return this.contents[nextNumber - 1];
		}
		return null;

	}
	public Image[] toArray(){
		return this.contents;
	}
}