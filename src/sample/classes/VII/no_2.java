package sample.classes.VII;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import sample.WebShower;

public class no_2 extends Button {
    public no_2(){
        WebShower webShower = new WebShower();
        Tooltip tooltip = new Tooltip("to Ac");
        this.setText("");
        this.setTooltip(tooltip);
        this.setTranslateX(120);
        this.setTranslateY(360);
        this.setPrefSize(40,40);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        this.setTextFill(Color.LIGHTGREY);
    }
}
