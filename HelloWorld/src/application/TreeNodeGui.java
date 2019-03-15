package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class TreeNodeGui extends Region{
	Circle c;
	Text t;
	Line line;
	
	public TreeNodeGui(String numero,int x, int y,Line line){
		c= new Circle();
		c.setRadius(20);
		c.setCenterX(x);
		c.setCenterY(y);
		this.line=line;

		
		t= new Text(""+numero);
		t.setX(c.getCenterX()-6);
		t.setY(c.getCenterY()+5);
		t.setFill(Color.WHITE);
		t.toFront();
		this.getChildren().add(c);
		this.getChildren().add(t);
		
	}
	
	

}
