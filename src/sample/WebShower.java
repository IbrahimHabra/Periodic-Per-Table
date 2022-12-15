package sample;

import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

public class WebShower extends Stage {

    public static Border PUBLICBORDER = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(5),BorderStroke.MEDIUM));
    private String htmlPath = "";
    private WebView browser = new WebView();
    private WebEngine webEngine = browser.getEngine();


    public WebShower(){

        this.setResizable(false);
        this.setTitle("");

        browser.setTranslateX(0);
        browser.setTranslateY(0);
        browser.setPrefSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
        this.hide();


        Pane root = new Pane();
        root.getChildren().add(browser);
        this.setMaximized(true);
        this.setScene(new Scene(root));


    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public void load(){
        URL url = this.getClass().getResource(htmlPath);
        webEngine.load(url.toExternalForm());
        this.show();
    }
}
