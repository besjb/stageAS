package application;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;

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
			ModelBeanInfo modelBeanInfo = new ModelBeanInfo();
			PropertyDescriptor[] PropDescriptor = modelBeanInfo.getPropertyDescriptors();
			ArrayList<BeanProperty> beanPropertylist = new ArrayList<>();
			
			for(PropertyDescriptor i : PropDescriptor) {
				beanPropertylist.add(new BeanProperty(model, i));
			}
			
			ObservableList<PropertySheet.Item> list = FXCollections.observableArrayList();
			
			for(BeanProperty y : beanPropertylist) {
				list.add(y);
			}
			
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