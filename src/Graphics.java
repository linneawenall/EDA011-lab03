import se.lth.cs.pt.window.SimpleWindow;
import java.awt.Color;

public class Graphics { // klassen
	private int width; // Dessa tre rader är attribut
	private int blockSize; //
	private int height; //
	private SimpleWindow w; //(= new SimpleWindow(300, 500, "Digging");) blir dödkod
	
	public Graphics(int w, int h, int bs){ // Konstruktorn. Bs är storlek på block i pxl, width & h är antal block
		this.width = w; //this hänvisar till attributen
		this.height = h;
		this.blockSize = bs;
		this.w = new SimpleWindow(width * blockSize, height * blockSize, "Digging"); //this.w hänvisar till attributet w i klassen. 
	}
	
	public int getWidth(){ //metod
		return width;
	}
	public int getHeight(){ //metod
		return height;
	}
	
	public void square() { // metod. void skickar ej tbaka ngt värde, men utför koden
		w.moveTo(10, 10); 
		w.lineTo(10, 20);
		w.lineTo(20, 20);
		w.lineTo(20, 10);
		w.lineTo(10, 10);
	}
		
	public void block (int x, int y, Color color) { //metod
		w.setLineColor(color);
		w.moveTo(x, y);
		int left = x * blockSize;
		int right = left + blockSize - 1;
		int top = y * blockSize;
		int bottom = top + blockSize - 1;
		for(int row = top; row <= bottom; row ++){ //int row tilldelas top. satsen sker så länge row är <= bottom. row ökar med 1 varje gång.
			w.moveTo(left, row);
			w.lineTo(right, row);
		}
	}
	public void rectangle(int x, int y, int width, int height, Color c){ // metod. upp 5b i vilken ordning ritas blocken ut?
		for(int yy = y; yy < y + height; yy++){ //tilldelar variabel yy värdet y. Nästa forsats kör från dennas y-koord i x-led.
			for(int xx = x; xx < x + width; xx++){
				block(xx, yy, c);
			}
		}
	}
	public char waitForKey(){ //metod
		return w.waitForKey();
	
	}
	
	
	
}


