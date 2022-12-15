package sample.classes.VII;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import sample.WebShower;

public class Am extends Button {
    public Am(){
        WebShower webShower = new WebShower();
        Tooltip tooltip = new Tooltip("Americium");
        this.setText("Am");
        this.setTooltip(tooltip);
        this.setTranslateX(360);
        this.setTranslateY(480);
        this.setPrefSize(40,40);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        this.setTextFill(Color.LIGHTGREY);
        this.setOnAction((ActionEvent e) -> {
            webShower.setHtmlPath("wepPage/VII/Am.html");
            webShower.load();
        });
        this.setOnMouseEntered((MouseEvent e) -> {
            this.setCursor(Cursor.HAND);
            this.setBorder(WebShower.PUBLICBORDER);
        });
        this.setOnMouseExited((MouseEvent e) ->this.setBorder(null));
    }
}
