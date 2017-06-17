import java.awt.Color;

import se.lth.cs.pt.window.SimpleWindow;

public class Mole {
	private Graphics g = new Graphics(30,50,10); // private för att vi ej ska använda den utanför mole-klassen
	public static void main(String[] args) {
		Mole m = new Mole();
		m.drawWorld();
		m.dig();
	}
	
	public void drawWorld(){
		g.rectangle(0, 0, 30, 10, Colors.SKY);
		g.rectangle(0, 10, 30, 5, Colors.GRASS);
		g.rectangle(0, 15, 30, 35, Colors.SOIL);
	}
	public void dig(){
		int x = g.getWidth() / 2;
		int y = g.getHeight()/2;
		while (true){
				
			g.block(x, y, Colors.MOLE);
			char key = g.waitForKey();
			
			if (y >= 15){
			g.block(x, y, Colors.TUNNEL);
			}
			else {
				g.block(x, y, Colors.GRASS);
		}
			
			if (key =='w'){
				 y--;
			}
			else if (key == 'a'){
				x--;
			}
			else if (key == 's'){
				y++;
			}
			else if (key == 'd'){
				x++;
			}
			if (x < 0){
				x++;
			}
			if (x == 30){
				x--;
			}
			if (y == 50){
				y--;
			}
			if (y < 10){
				y++;
			}
			}
		}
	}
	

