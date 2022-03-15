import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Simulation de trafic");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane, 900, 700, true);
        primaryStage.setScene(theScene);
        /*
        Vehicule Voiture_test1 = new Vehicule();
        Vehicule Voiture_test2 = new Vehicule();
        Voiture_test1.Accelerate(10);
        pane.getChildren().addAll(Voiture_test1.getVisual(), Voiture_test2.getVisual());
        */
        Map MAP = new Map();
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                MAP.nextstep(now);
            }
        }.start();
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
