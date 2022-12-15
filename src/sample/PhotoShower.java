package sample;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

class PhotoShower extends Stage {
    private ImageView imageView =  new ImageView();
    PhotoShower(){
        imageView.setTranslateX(0);
        imageView.setTranslateY(0);
        Pane root = new Pane();
        this.setScene (new Scene (root));
        root.getChildren().add(imageView);
    }

    void setPhoto(Image image){
        imageView.setImage(image);
    }

    void setSize(int height,int width){
        this.setHeight(height);
        this.setWidth(width);
    }
}
