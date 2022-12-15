package sample.classes.I;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import sample.WebShower;


public class H extends Button {
    public H(){
        WebShower webShower = new WebShower();
        Tooltip tooltip = new Tooltip("Hydrogen");
        this.setText("H");
        this.setTooltip(tooltip);
        this.setTranslateX(40);
        this.setTranslateY(120);
        this.setPrefSize(40,40);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#200b1e"),new CornerRadii(5),Insets.EMPTY)));
        this.setTextFill(Color.LIGHTGREY);

        this.setOnAction((ActionEvent e) -> {
           webShower.setHtmlPath("wepPage/I & II/H.html");
           webShower.load();
        });
        this.setOnMouseEntered((MouseEvent e) -> {
            this.setCursor(Cursor.HAND);
            this.setBorder(WebShower.PUBLICBORDER);
        });
        this.setOnMouseExited((MouseEvent e) ->this.setBorder(null));
    }


}
