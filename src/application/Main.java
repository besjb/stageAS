package application;

import java.beans.PropertyDescriptor;

import org.controlsfx.control.PropertySheet;
import org.controlsfx.property.BeanProperty;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Model model = new Model();
		    
			
			BeanProperty beanText = new BeanProperty(model, new PropertyDescriptor("text", model.getClass()));
			BeanProperty beanNumber = new BeanProperty(model, new PropertyDescriptor("number", model.getClass()));
			BeanProperty beanBool = new BeanProperty(model, new PropertyDescriptor("bool", model.getClass()));
			BeanProperty beanDate = new BeanProperty(model, new PropertyDescriptor("date", model.getClass()));
			
			ObservableList<PropertySheet.Item> list = FXCollections.observableArrayList();
			list.addAll(beanText, beanNumber, beanBool, beanDate);
			PropertySheet propertySheet = new PropertySheet(list);
			
			root.getChildren().add(propertySheet);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}