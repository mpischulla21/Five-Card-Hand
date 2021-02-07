package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BlackJack extends Application {
	
	public static void main(String[] args) {
		// launch the application
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// Create a Label control
			
			Label card1Label = new Label ("Card 1");
			Label card2Label = new Label ("Card 2");
			Label card3Label = new Label ("Card 3");
			Label card4Label = new Label ("Card 4");
			Label card5Label = new Label ("Card 5");
			
			
			
			Image card1 = new Image ("file:img/back_card.png");
			Image card2 = new Image ("file:img/ace_of_spades.png");
			Image card3 = new Image ("file:img/ace_of_spades.png");
			Image card4 = new Image ("file:img/ace_of_spades.png");
			Image card5 = new Image ("file:img/ace_of_spades.png");
			
			ImageView card1View = new ImageView(card1);
			ImageView card2View = new ImageView(card2);
			ImageView card3View = new ImageView(card3);
			ImageView card4View = new ImageView(card4);
			ImageView card5View = new ImageView(card5);
			
			card1.setFitWidth(100);
			card1.setPreserveRatio(true);
			
			card2.setFitWidth(100);
			card2.setPreserveRatio(true);
			
			card3.setFitWidth(100);
			card3.setPreserveRatio(true);
			
			card4.setFitWidth(100);
			card4.setPreserveRatio(true);
			
			card5.setFitWidth(100);
			card5.setPreserveRatio(true);
			
			VBox Card_1 = new VBox (10, card1, card1Label);
			VBox Card_2 = new VBox (10, card2, card2Label);
			VBox Card_3 = new VBox (10, card3, card3Label);
			VBox Card_4 = new VBox (10, card4, card4Label);
			VBox Card_5 = new VBox (10, card5, card5Label);
			
			
			Card_1.setAlignment(Pos.CENTER);
			Card_2.setAlignment(Pos.CENTER);
			Card_3.setAlignment(Pos.CENTER);
			Card_4.setAlignment(Pos.CENTER);
			Card_5.setAlignment(Pos.CENTER);
			
			// first argument is padding in pixels
			HBox cards = new HBox (10, Card_1, Card_2, Card_3, Card_4, Card_5);
			cards.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(cards,1000,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("5 Card Poker");
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}

