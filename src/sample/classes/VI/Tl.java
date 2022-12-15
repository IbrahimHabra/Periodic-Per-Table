package sample.classes.VI;

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

public class Tl extends Button {
    public Tl(){
        WebShower webShower = new WebShower();
        Tooltip tooltip = new Tooltip("Thallium");
        this.setText("Tl");
        this.setTooltip(tooltip);
        this.setTranslateX(520);
        this.setTranslateY(320);
        this.setPrefSize(40,40);
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        this.setTextFill(Color.LIGHTGREY);
        this.setOnAction((ActionEvent e) -> {
            webShower.setHtmlPath("wepPage/VI/Tl.html");
            webShower.load();
        });
        this.setOnMouseEntered((MouseEvent e) -> {
            this.setCursor(Cursor.HAND);
            this.setBorder(WebShower.PUBLICBORDER);
        });
        this.setOnMouseExited((MouseEvent e) ->this.setBorder(null));
    }
}
