package application;
	
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;


public class Main extends Application {
	Label label1;
	TreeNodeGui tng;
	Line line;
	Circle c2;
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.initStyle(StageStyle.DECORATED);
			label1= new Label("Mi label 1");
			Button button1= new Button("Boton 1");
			ToggleGroup tg= new ToggleGroup();
			ToggleButton rb1= new ToggleButton("Hombre");
			rb1.getStyleClass().add("toggleButton");
			rb1.setToggleGroup(tg);
			ToggleButton rb2= new ToggleButton("Mujer");
			rb2.setToggleGroup(tg);
			rb2.getStyleClass().add("toggleButton");
			button1.addEventFilter(MouseEvent.MOUSE_CLICKED, new MyEvent());
			button1.getStyleClass().add("boton1");
			HBox hbox= new HBox(rb1,rb2);
			VBox vbox= new VBox(20,label1,button1,hbox);
			c2= new Circle();
			c2.setRadius(20);
			c2.setCenterX(100);
			c2.setCenterY(100);
			line= new Line();
			
			tng= new TreeNodeGui("10",30,30,line);

			line.setStartX(tng.c.getCenterX());
			line.setEndX(c2.getCenterX());
			line.setStartY(tng.c.getCenterY());
			line.setEndY(c2.getCenterY());
			c2.translateXProperty().addListener(new ChangeListener<Number>(){
				
				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					System.out.println(c2.getCenterX());
					line.setEndX(c2.getCenterX());
				}
				
			});
			c2.translateYProperty().addListener(new ChangeListener<Number>(){
				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					line.setEndY(c2.getCenterX());
				}
				
			});			
			Pane root = new Pane(tng,line,c2,button1);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public class MyEvent implements EventHandler<MouseEvent>{

		@Override
		public void handle(MouseEvent event) {
			Path path = new Path();
			path.getElements().add(new MoveTo(c2.getCenterX(),c2.getCenterY()));
			path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
			path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
			PathTransition pathTransition = new PathTransition();
			pathTransition.setDuration(Duration.millis(4000));
			pathTransition.setPath(path);
			pathTransition.setNode(c2);
			pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pathTransition.setCycleCount(Timeline.INDEFINITE);
			pathTransition.setAutoReverse(true);
			pathTransition.play();
		
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
