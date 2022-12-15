package sample.classes.VI;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import sample.WebShower;

public class no_1 extends Button {
    public no_1(){
        WebShower webShower = new WebShower();
        Tooltip tooltip = new Tooltip("to La");
        this.setText("");
        this.setTooltip(tooltip);
        this.setTranslateX(120);
        this.setTranslateY(320);
        this.setPrefSize(40,40);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        this.setTextFill(Color.LIGHTGREY);
    }
}
