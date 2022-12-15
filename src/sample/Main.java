package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sample.classes.I.*;
import sample.classes.II.*;
import sample.classes.III.*;
import sample.classes.IV.*;
import sample.classes.V.*;
import sample.classes.VI.*;
import sample.classes.VII.*;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Main extends Application {

    private H h = new H();
    private He he = new He();
    private Li li = new Li();
    private Be be = new Be();
    private B b = new B();
    private C c = new C();
    private N n = new N();
    private O o = new O();
    private F f = new F();
    private Ne ne = new Ne();
    private Na na = new Na();
    private Mg mg = new Mg();
    private Al al = new Al();
    private Si si = new Si();
    private P p = new P();
    private S s = new S();
    private Cl cl = new Cl();
    private Ar ar = new Ar();
    private K k = new K();
    private Ca ca = new Ca();
    private Sc sc = new Sc();
    private Ti ti = new Ti();
    private V v = new V();
    private Cr cr = new Cr();
    private Mn mn = new Mn();
    private Fe fe = new Fe();
    private Co co = new Co();
    private Ni ni = new Ni();
    private Cu cu = new Cu();
    private Zn zn = new Zn();
    private Ga ga = new Ga();
    private Ge ge = new Ge();
    private As as = new As();
    private Se se = new Se();
    private Br br = new Br();
    private Kr kr = new Kr();
    private Rb rb = new Rb();
    private Sr sr = new Sr();
    private Y y = new Y();
    private Zr zr = new Zr();
    private Nb nb = new Nb();
    private Mo mo = new Mo();
    private Tc tc = new Tc();
    private Ru ru = new Ru();
    private Rh rh = new Rh();
    private Pd pd = new Pd();
    private Ag ag = new Ag();
    private Cd cd = new Cd();
    private In in = new In();
    private Sn sn = new Sn();
    private Sb sb = new Sb();
    private Te te = new Te();
    private I i = new I();
    private Xe xe = new Xe();
    private Cs cs = new Cs();
    private Ba ba = new Ba();
    private La la = new La();
    private Ce ce= new Ce();
    private Pr pr = new Pr();
    private Nd nd = new Nd();
    private Pm pm = new Pm();
    private Sm sm = new Sm();
    private Eu eu = new Eu();
    private Gd gd = new Gd();
    private Tb tb = new Tb();
    private Dy dy = new Dy();
    private Ho ho = new Ho();
    private Er er = new Er();
    private Tm tm = new Tm();
    private Yb yb = new Yb();
    private Lu lu = new Lu();
    private Hf hf = new Hf();
    private Ta ta = new Ta();
    private W w = new W();
    private Re re = new Re();
    private Os os = new Os();
    private Ir ir = new Ir();
    private Pt pt = new Pt();
    private Au au = new Au();
    private Hg hg = new Hg();
    private Tl tl = new Tl();
    private Pb pb = new Pb();
    private Bi bi = new Bi();
    private Po po = new Po();
    private At at = new At();
    private Rn rn = new Rn();
    private Fr fr = new Fr();
    private Ra ra = new Ra();
    private Ac ac = new Ac();
    private Th th = new Th();
    private Pa pa = new Pa();
    private U u = new U();
    private Np np = new Np();
    private Pu pu = new Pu();
    private Am am = new Am();
    private Cm cm = new Cm();
    private Bk bk = new Bk();
    private Cf cf = new Cf();
    private Es es = new Es();
    private Fm fm = new Fm();
    private Md md = new Md();
    private No no = new No();
    private Lr lr = new Lr();
    private Rf rf = new Rf();
    private Db db = new Db();
    private Sg sg = new Sg();
    private Bh bh = new Bh();
    private Hs hs = new Hs();
    private Mt mt = new Mt();
    private Ds ds = new Ds();
    private Rg rg = new Rg();
    private Cn cn = new Cn();
    private Nh nh = new Nh();
    private Fl fl = new Fl();
    private Mc mc = new Mc();
    private Lv lv = new Lv();
    private Ts ts = new Ts();
    private Og og = new Og();


    @Override
    public void start(Stage primaryStage){
        PhotoShower photoShower = new PhotoShower();

        Alert ERROR = new Alert(Alert.AlertType.ERROR);
        Alert INFO = new Alert(Alert.AlertType.INFORMATION);
        TextField textField = new TextField();
        Button button = new Button("",new ImageView(new Image(this.getClass().getResourceAsStream("Photo/icons8-search-37.png"))));

        button.setTranslateX(30);
        button.setTranslateY(30);
        button.setPrefSize(60,60);
        button.setBackground(new Background(new BackgroundFill(Color.valueOf("#0a3451"),new CornerRadii(15), Insets.EMPTY)));
        textField.setTranslateX(85);
        textField.setTranslateY(43);
        textField.setPrefSize(200,37);
        textField.setBackground(new Background(new BackgroundFill(Color.valueOf("#0a3451"),new CornerRadii(7), Insets.EMPTY)));
        textField.setPromptText("Search by Symbol or English name ");
        textField.setFont(new Font(12));
        textField.setStyle("-fx-text-fill: lightGray;");
        ImageView bg = new ImageView(new Image(this.getClass().getResourceAsStream("Photo/backgroundDefault.jpg")));
        bg.setTranslateX(0);
        bg.setTranslateY(0);
        primaryStage.setOnHiding((WindowEvent e) ->
            System.exit(50)
        );
        Pane root  = new Pane();
        root.getChildren().add(bg);
        root.getChildren().addAll(h,he,li,be,b,c,n,o,f,ne);
        root.getChildren().addAll(na,mg,al,si,p,s,cl,ar);
        root.getChildren().addAll(k,ca,sc,ti,v,cr,mn,fe,co,ni,cu,zn,ga,ge,as,se,br,kr);
        root.getChildren().addAll(rb,sr,y,zr,nb,mo,tc,ru,rh,pd,ag,cd,in,sn,sb,te,i,xe);
        root.getChildren().addAll(cs,ba,new no_1(),hf,ta,w,re,os,ir,pt,au,hg,tl,pb,bi,po,at,rn);
        root.getChildren().addAll(la,ce,pr,nd,pm,sm,eu,gd,tb,dy,ho,er,tm,yb,lu);
        root.getChildren().addAll(fr,ra,new no_2(),rf,db,sg,bh,hs,mt,ds,rg,cn,nh,fl,mc,lv,ts,og);
        root.getChildren().addAll(ac,th,pa,u,np,pu,am,cm,bk,cf,es,fm,md,no,lr);
        root.getChildren().addAll(textField,button);
        primaryStage.setTitle("Periodic per Table ");
        root.addEventHandler(KeyEvent.KEY_PRESSED,ev -> {
            if(ev.getCode() == KeyCode.ENTER)button.fire();}
        );
        Scene scene = new Scene(root, 790, 550);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


        button.setOnAction((ActionEvent e)-> {
            if(textField.getText().equals("")){
                reset();
                ERROR.setHeaderText("ERROR");
                ERROR.setContentText("Can not Search about nothing !!!");
                ERROR.setTitle("WRONG !");
                ERROR.show();
            }
             else if (textField.getText().toLowerCase().equals("h") || textField.getText().toLowerCase().equals("hydrogen")){
                reset();
                h.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("he") || textField.getText().toLowerCase().equals("helium")){
                reset();
                he.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("li") || textField.getText().toLowerCase().equals("lithium")){
                reset();
                li.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("be") || textField.getText().toLowerCase().equals("beryllium")){
                reset();
                be.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("b") || textField.getText().toLowerCase().equals("boron")){
                reset();
                b.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("c") || textField.getText().toLowerCase().equals("carbon")){
                reset();
                c.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("n") || textField.getText().toLowerCase().equals("nitrogen")){
                reset();
                n.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("o") || textField.getText().toLowerCase().equals("oxygen")){
                reset();
                o.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("f") || textField.getText().toLowerCase().equals("fluorine")){
                reset();
                f.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
                System.out.println("E");
            }
             else if (textField.getText().toLowerCase().equals("ne") || textField.getText().toLowerCase().equals("neon")){
                reset();
                ne.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("na") || textField.getText().toLowerCase().equals("sodium")){
                reset();
                na.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("mg") || textField.getText().toLowerCase().equals("magnesium")){
                reset();
                mg.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("al") || textField.getText().toLowerCase().equals("aluminum")){
                reset();
                al.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("si") || textField.getText().toLowerCase().equals("silicon")){
                reset();
                si.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("p") || textField.getText().toLowerCase().equals("phosphorus")){
                reset();
                p.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("s") || textField.getText().toLowerCase().equals("sulfur")){
                reset();
                s.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("cl") || textField.getText().toLowerCase().equals("chlorine")){
                reset();
                cl.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("ar") || textField.getText().toLowerCase().equals("argon")){
                reset();
                ar.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
             else if (textField.getText().toLowerCase().equals("k") || textField.getText().toLowerCase().equals("potassium")){
                reset();
                k.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ca") || textField.getText().toLowerCase().equals("calcium")){
                reset();
                ca.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("sc") || textField.getText().toLowerCase().equals("scandium")){
                reset();
                sc.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ti") || textField.getText().toLowerCase().equals("titanium")){
                reset();
                ti.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("v") || textField.getText().toLowerCase().equals("vanadium")){
                reset();
                v.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("cr") || textField.getText().toLowerCase().equals("chromium")){
                reset();
                cr.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("mn") || textField.getText().toLowerCase().equals("manganese")){
                reset();
                mn.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("fe") || textField.getText().toLowerCase().equals("iron")){
                reset();
                fe.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("co") || textField.getText().toLowerCase().equals("cobalt")){
                reset();
                co.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ni") || textField.getText().toLowerCase().equals("nickel")){
                reset();
                ni.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("cu") || textField.getText().toLowerCase().equals("copper")){
                reset();
                cu.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("zn") || textField.getText().toLowerCase().equals("zinc")){
                reset();
                zn.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ga") || textField.getText().toLowerCase().equals("gallium")){
                reset();
                ga.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ge") || textField.getText().toLowerCase().equals("germanium")){
                reset();
                ge.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("as") || textField.getText().toLowerCase().equals("arsenic")){
                reset();
                as.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("se") || textField.getText().toLowerCase().equals(se.getTooltip().getText().toLowerCase())){
                reset();
                se.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("br") || textField.getText().toLowerCase().equals(br.getTooltip().getText().toLowerCase())){
                reset();
                br.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("kr") || textField.getText().toLowerCase().equals(kr.getTooltip().getText().toLowerCase())){
                reset();
                kr.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("rb") || textField.getText().toLowerCase().equals(rb.getTooltip().getText().toLowerCase())){
                reset();
                rb.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("sr") || textField.getText().toLowerCase().equals(sr.getTooltip().getText().toLowerCase())){
                reset();
                sr.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("y") || textField.getText().toLowerCase().equals(y.getTooltip().getText().toLowerCase())){
                reset();
                y.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("zr") || textField.getText().toLowerCase().equals(zr.getTooltip().getText().toLowerCase())){
                reset();
                zr.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("nb") || textField.getText().toLowerCase().equals(nb.getTooltip().getText().toLowerCase())){
                reset();
                nb.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("mo") || textField.getText().toLowerCase().equals(mo.getTooltip().getText().toLowerCase())){
                reset();
                mo.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("tc") || textField.getText().toLowerCase().equals(tc.getTooltip().getText().toLowerCase())){
                reset();
                tc.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ru") || textField.getText().toLowerCase().equals(ru.getTooltip().getText().toLowerCase())){
                reset();
                ru.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("rh") || textField.getText().toLowerCase().equals(rh.getTooltip().getText().toLowerCase())){
                reset();
                rh.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("pd") || textField.getText().toLowerCase().equals(pd.getTooltip().getText().toLowerCase())){
                reset();
                pd.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ag") || textField.getText().toLowerCase().equals(ag.getTooltip().getText().toLowerCase())){
                reset();
                ag.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("cd") || textField.getText().toLowerCase().equals(cd.getTooltip().getText().toLowerCase())){
                reset();
                cd.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("in") || textField.getText().toLowerCase().equals(in.getTooltip().getText().toLowerCase())){
                reset();
                in.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("sn") || textField.getText().toLowerCase().equals(sn.getTooltip().getText().toLowerCase())){
                reset();
                sn.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("sb") || textField.getText().toLowerCase().equals(sb.getTooltip().getText().toLowerCase())){
                reset();
                sb.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("te") || textField.getText().toLowerCase().equals(te.getTooltip().getText().toLowerCase())){
                reset();
                te.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("i") || textField.getText().toLowerCase().equals(i.getTooltip().getText().toLowerCase())){
                reset();
                i.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("xe") || textField.getText().toLowerCase().equals(xe.getTooltip().getText().toLowerCase())){
                reset();
                xe.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("cs") || textField.getText().toLowerCase().equals(cs.getTooltip().getText().toLowerCase())){
                reset();
                cs.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ba") || textField.getText().toLowerCase().equals(ba.getTooltip().getText().toLowerCase())){
                reset();
                ba.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("la") || textField.getText().toLowerCase().equals(la.getTooltip().getText().toLowerCase())){
                reset();
                la.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ce") || textField.getText().toLowerCase().equals(ce.getTooltip().getText().toLowerCase())){
                reset();
                ce.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("pr") || textField.getText().toLowerCase().equals(pr.getTooltip().getText().toLowerCase())){
                reset();
                pr.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("nd") || textField.getText().toLowerCase().equals(nd.getTooltip().getText().toLowerCase())){
                reset();
                nd.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("pm") || textField.getText().toLowerCase().equals(pm.getTooltip().getText().toLowerCase())){
                reset();
                pm.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("sm") || textField.getText().toLowerCase().equals(sm.getTooltip().getText().toLowerCase())){
                reset();
                sm.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("eu") || textField.getText().toLowerCase().equals(eu.getTooltip().getText().toLowerCase())){
                reset();
                eu.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("gd") || textField.getText().toLowerCase().equals(gd.getTooltip().getText().toLowerCase())){
                reset();
                gd.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("tb") || textField.getText().toLowerCase().equals(tb.getTooltip().getText().toLowerCase())){
                reset();
                tb.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("dy") || textField.getText().toLowerCase().equals(dy.getTooltip().getText().toLowerCase())){
                reset();
                dy.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ho") || textField.getText().toLowerCase().equals(ho.getTooltip().getText().toLowerCase())){
                reset();
                ho.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("er") || textField.getText().toLowerCase().equals(er.getTooltip().getText().toLowerCase())){
                reset();
                er.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("tm") || textField.getText().toLowerCase().equals(tm.getTooltip().getText().toLowerCase())){
                reset();
                tm.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("yb") || textField.getText().toLowerCase().equals(yb.getTooltip().getText().toLowerCase())){
                reset();
                yb.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("lu") || textField.getText().toLowerCase().equals(lu.getTooltip().getText().toLowerCase())){
                reset();
                lu.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("hf") || textField.getText().toLowerCase().equals(hf.getTooltip().getText().toLowerCase())){
                reset();
                hf.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ta") || textField.getText().toLowerCase().equals(ta.getTooltip().getText().toLowerCase())){
                reset();
                ta.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("w") || textField.getText().toLowerCase().equals(w.getTooltip().getText().toLowerCase())){
                reset();
                w.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("re") || textField.getText().toLowerCase().equals(re.getTooltip().getText().toLowerCase())){
                reset();
                re.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("os") || textField.getText().toLowerCase().equals(os.getTooltip().getText().toLowerCase())){
                reset();
                os.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ir") || textField.getText().toLowerCase().equals(ir.getTooltip().getText().toLowerCase())){
                reset();
                ir.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("pt") || textField.getText().toLowerCase().equals(pt.getTooltip().getText().toLowerCase())){
                reset();
                pt.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("au") || textField.getText().toLowerCase().equals(au.getTooltip().getText().toLowerCase())){
                reset();
                au.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("hg") || textField.getText().toLowerCase().equals(hg.getTooltip().getText().toLowerCase())){
                reset();
                hg.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("tl") || textField.getText().toLowerCase().equals(tl.getTooltip().getText().toLowerCase())){
                reset();
                tl.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("pb") || textField.getText().toLowerCase().equals(pb.getTooltip().getText().toLowerCase())){
                reset();
                pb.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("at") || textField.getText().toLowerCase().equals(at.getTooltip().getText().toLowerCase())){
                reset();
                at.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("rn") || textField.getText().toLowerCase().equals(rn.getTooltip().getText().toLowerCase())){
                reset();
                rn.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("fr") || textField.getText().toLowerCase().equals(fr.getTooltip().getText().toLowerCase())){
                reset();
                fr.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ra") || textField.getText().toLowerCase().equals(ra.getTooltip().getText().toLowerCase())){
                reset();
                ra.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ac") || textField.getText().toLowerCase().equals(ac.getTooltip().getText().toLowerCase())){
                reset();
                ac.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("th") || textField.getText().toLowerCase().equals(th.getTooltip().getText().toLowerCase())){
                reset();
                th.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("pa") || textField.getText().toLowerCase().equals(pa.getTooltip().getText().toLowerCase())){
                reset();
                pa.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("u") || textField.getText().toLowerCase().equals(u.getTooltip().getText().toLowerCase())){
                reset();
                u.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("np") || textField.getText().toLowerCase().equals(np.getTooltip().getText().toLowerCase())){
                reset();
                np.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("pu") || textField.getText().toLowerCase().equals(pu.getTooltip().getText().toLowerCase())){
                reset();
                pu.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("am") || textField.getText().toLowerCase().equals(am.getTooltip().getText().toLowerCase())){
                reset();
                am.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("cm") || textField.getText().toLowerCase().equals(cm.getTooltip().getText().toLowerCase())){
                reset();
                cm.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("bk") || textField.getText().toLowerCase().equals(bk.getTooltip().getText().toLowerCase())){
                reset();
                bk.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("cf") || textField.getText().toLowerCase().equals(cf.getTooltip().getText().toLowerCase())){
                reset();
                cf.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("es") || textField.getText().toLowerCase().equals(es.getTooltip().getText().toLowerCase())){
                reset();
                es.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("fm") || textField.getText().toLowerCase().equals(fm.getTooltip().getText().toLowerCase())){
                reset();
                fm.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("md") || textField.getText().toLowerCase().equals(md.getTooltip().getText().toLowerCase())){
                reset();
                md.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("no") || textField.getText().toLowerCase().equals(no.getTooltip().getText().toLowerCase())){
                reset();
                no.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("lr") || textField.getText().toLowerCase().equals(lr.getTooltip().getText().toLowerCase())){
                reset();
                lr.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("rf") || textField.getText().toLowerCase().equals(rf.getTooltip().getText().toLowerCase())){
                reset();
                rf.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("db") || textField.getText().toLowerCase().equals(db.getTooltip().getText().toLowerCase())){
                reset();
                db.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("sg") || textField.getText().toLowerCase().equals(sg.getTooltip().getText().toLowerCase())){
                reset();
                sg.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("bh") || textField.getText().toLowerCase().equals(bh.getTooltip().getText().toLowerCase())){
                reset();
                bh.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("hs") || textField.getText().toLowerCase().equals(hs.getTooltip().getText().toLowerCase())){
                reset();
                hs.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("mt") || textField.getText().toLowerCase().equals(mt.getTooltip().getText().toLowerCase())){
                reset();
                mt.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ds") || textField.getText().toLowerCase().equals(ds.getTooltip().getText().toLowerCase())){
                reset();
                ds.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("rg") || textField.getText().toLowerCase().equals(rg.getTooltip().getText().toLowerCase())){
                reset();
                rg.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("cn") || textField.getText().toLowerCase().equals(cn.getTooltip().getText().toLowerCase())){
                reset();
                cn.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("nh") || textField.getText().toLowerCase().equals(nh.getTooltip().getText().toLowerCase())){
                reset();
                nh.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("fl") || textField.getText().toLowerCase().equals(fl.getTooltip().getText().toLowerCase())){
                reset();
                fl.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("mc") || textField.getText().toLowerCase().equals(mc.getTooltip().getText().toLowerCase())){
                reset();
                mc.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("lv") || textField.getText().toLowerCase().equals(lv.getTooltip().getText().toLowerCase())){
                reset();
                lv.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("ts") || textField.getText().toLowerCase().equals(ts.getTooltip().getText().toLowerCase())){
                reset();
                ts.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if (textField.getText().toLowerCase().equals("og") || textField.getText().toLowerCase().equals(og.getTooltip().getText().toLowerCase())){
                reset();
                og.setBackground(new Background(new BackgroundFill(Color.valueOf("#7b00ff"),new CornerRadii(5),Insets.EMPTY)));
            }
            else if(textField.getText().equals("<!_peepeepoopoo?>"))
            {
                photoShower.setPhoto(new Image(this.getClass().getResourceAsStream("Photo/pig.png")));
                photoShower.setSize(619,1100);
                photoShower.show();
            }
            else if(textField.getText().equals("<!_deyameno?>"))
            {
                photoShower.setPhoto(new Image(this.getClass().getResourceAsStream("Photo/yamenZkert.jpg")));
                photoShower.setSize(458,290);
                photoShower.show();
            }
            else if(textField.getText().equals("<!_details?>"))
            {
                INFO.setTitle("Bio");
                INFO.setHeaderText("The programmers of this Program (Periodic per table !)");
                INFO.setContentText("\t\t\t\t\t\tMR.Ibrahim habra \n\t\t\t\t\t\t\tMR.Yamen Zkert");
                INFO.show();
            }
            else if(textField.getText().equals("<!_google?>"))
            {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI("https://www.google.com"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }



            else{
                ERROR.setHeaderText("ERROR");
                ERROR.setContentText("Nothing found !");
                ERROR.setTitle("WRONG !");
                ERROR.show();
                reset();
            }
        });

    }

    private void reset(){
        ac.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        th.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        pa.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        u.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        np.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        pu.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        am.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        cm.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        bk.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        cf.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        es.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        fm.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        md.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        no.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        lr.setBackground(new Background(new BackgroundFill(Color.valueOf("#281d4c"),new CornerRadii(5), Insets.EMPTY)));
        la.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        ce.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        pr.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        nd.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        pm.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        sm.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        eu.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        gd.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        tb.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        dy.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        ho.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        er.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        tm.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        yb.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        lu.setBackground(new Background(new BackgroundFill(Color.valueOf("#4c1d43"),new CornerRadii(5), Insets.EMPTY)));
        rf.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        db.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        sg.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        bh.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        hs.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        mt.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        ds.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        rg.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        cn.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        hf.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        ta.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        w.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        re.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        os.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        ir.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        pt.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        au.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        hg.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        y.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        zr.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        nb.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        mo.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        tc.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        ru.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        rh.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        pd.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        ag.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        cd.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        sc.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        ti.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        v.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        cr.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        mn.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        fe.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        co.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        ni.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        cu.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        zn.setBackground(new Background(new BackgroundFill(Color.valueOf("#385c77"),new CornerRadii(5), Insets.EMPTY)));
        li.setBackground(new Background(new BackgroundFill(Color.valueOf("#3c0d1f"),new CornerRadii(5), Insets.EMPTY)));
        na.setBackground(new Background(new BackgroundFill(Color.valueOf("#3c0d1f"),new CornerRadii(5), Insets.EMPTY)));
        k.setBackground(new Background(new BackgroundFill(Color.valueOf("#3c0d1f"),new CornerRadii(5), Insets.EMPTY)));
        rb.setBackground(new Background(new BackgroundFill(Color.valueOf("#3c0d1f"),new CornerRadii(5), Insets.EMPTY)));
        cs.setBackground(new Background(new BackgroundFill(Color.valueOf("#3c0d1f"),new CornerRadii(5), Insets.EMPTY)));
        fr.setBackground(new Background(new BackgroundFill(Color.valueOf("#3c0d1f"),new CornerRadii(5), Insets.EMPTY)));
        h.setBackground(new Background(new BackgroundFill(Color.valueOf("#200b1e"),new CornerRadii(5),Insets.EMPTY)));
        c.setBackground(new Background(new BackgroundFill(Color.valueOf("#200b1e"),new CornerRadii(5),Insets.EMPTY)));
        n.setBackground(new Background(new BackgroundFill(Color.valueOf("#200b1e"),new CornerRadii(5),Insets.EMPTY)));
        o.setBackground(new Background(new BackgroundFill(Color.valueOf("#200b1e"),new CornerRadii(5),Insets.EMPTY)));
        s.setBackground(new Background(new BackgroundFill(Color.valueOf("#200b1e"),new CornerRadii(5),Insets.EMPTY)));
        se.setBackground(new Background(new BackgroundFill(Color.valueOf("#200b1e"),new CornerRadii(5),Insets.EMPTY)));
        be.setBackground(new Background(new BackgroundFill(Color.valueOf("#542c2d"),new CornerRadii(5), Insets.EMPTY)));
        mg.setBackground(new Background(new BackgroundFill(Color.valueOf("#542c2d"),new CornerRadii(5), Insets.EMPTY)));
        ca.setBackground(new Background(new BackgroundFill(Color.valueOf("#542c2d"),new CornerRadii(5), Insets.EMPTY)));
        sr.setBackground(new Background(new BackgroundFill(Color.valueOf("#542c2d"),new CornerRadii(5), Insets.EMPTY)));
        ba.setBackground(new Background(new BackgroundFill(Color.valueOf("#542c2d"),new CornerRadii(5), Insets.EMPTY)));
        ra.setBackground(new Background(new BackgroundFill(Color.valueOf("#542c2d"),new CornerRadii(5), Insets.EMPTY)));
        he.setBackground(new Background(new BackgroundFill(Color.valueOf("#181d38"),new CornerRadii(5), Insets.EMPTY)));
        ne.setBackground(new Background(new BackgroundFill(Color.valueOf("#181d38"),new CornerRadii(5), Insets.EMPTY)));
        ar.setBackground(new Background(new BackgroundFill(Color.valueOf("#181d38"),new CornerRadii(5), Insets.EMPTY)));
        kr.setBackground(new Background(new BackgroundFill(Color.valueOf("#181d38"),new CornerRadii(5), Insets.EMPTY)));
        xe.setBackground(new Background(new BackgroundFill(Color.valueOf("#181d38"),new CornerRadii(5), Insets.EMPTY)));
        rn.setBackground(new Background(new BackgroundFill(Color.valueOf("#181d38"),new CornerRadii(5), Insets.EMPTY)));
        og.setBackground(new Background(new BackgroundFill(Color.valueOf("#181d38"),new CornerRadii(5), Insets.EMPTY)));
        cl.setBackground(new Background(new BackgroundFill(Color.valueOf("#112e44"),new CornerRadii(5), Insets.EMPTY)));
        f.setBackground(new Background(new BackgroundFill(Color.valueOf("#112e44"),new CornerRadii(5), Insets.EMPTY)));
        br.setBackground(new Background(new BackgroundFill(Color.valueOf("#112e44"),new CornerRadii(5), Insets.EMPTY)));
        i.setBackground(new Background(new BackgroundFill(Color.valueOf("#112e44"),new CornerRadii(5), Insets.EMPTY)));
        at.setBackground(new Background(new BackgroundFill(Color.valueOf("#112e44"),new CornerRadii(5), Insets.EMPTY)));
        ts.setBackground(new Background(new BackgroundFill(Color.valueOf("#112e44"),new CornerRadii(5), Insets.EMPTY)));
        b.setBackground(new Background(new BackgroundFill(Color.valueOf("#273149"),new CornerRadii(5), Insets.EMPTY)));
        si.setBackground(new Background(new BackgroundFill(Color.valueOf("#273149"),new CornerRadii(5), Insets.EMPTY)));
        ge.setBackground(new Background(new BackgroundFill(Color.valueOf("#273149"),new CornerRadii(5), Insets.EMPTY)));
        as.setBackground(new Background(new BackgroundFill(Color.valueOf("#273149"),new CornerRadii(5), Insets.EMPTY)));
        sb.setBackground(new Background(new BackgroundFill(Color.valueOf("#273149"),new CornerRadii(5), Insets.EMPTY)));
        te.setBackground(new Background(new BackgroundFill(Color.valueOf("#273149"),new CornerRadii(5), Insets.EMPTY)));
        po.setBackground(new Background(new BackgroundFill(Color.valueOf("#273149"),new CornerRadii(5), Insets.EMPTY)));
        al.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        ga.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        in.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        sn.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        tl.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        pb.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        bi.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        nh.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        fl.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        mc.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
        lv.setBackground(new Background(new BackgroundFill(Color.valueOf("#1c1749"),new CornerRadii(5), Insets.EMPTY)));
    }

    public static void main(String[] args) {
        launch(args);
    }

}

              /*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||
                |||||||||||||||||||||||||||||||||||||||||||||||||||||||||
                |||||||||||||||||||||||||||||||||||||||||||||||||||||||||
                |||||||||||||||||||||||||||||||||||||||||||||||||||||||||
                |||||||||                                       |||||||||
                |||||||||                                       |||||||||
                |||||||||                                       |||||||||
                |||||||||    PROGRAMMED BY :                    |||||||||
                |||||||||         Mr.Ibrahim Habra &            |||||||||
                |||||||||            Mr.Yamen Zkert             |||||||||
                |||||||||                                       |||||||||
                |||||||||        At : 2019 12 7 ;12:00 PM       |||||||||
                |||||||||                                       |||||||||
                |||||||||           Aleppo.Syria                |||||||||
                |||||||||                                       |||||||||
                |||||||||        Mob.0988240620 Ibarhim         |||||||||
                |||||||||          Mob.0959571984  Yamen        |||||||||
                |||||||||                                       |||||||||
                |||||||||||||||||||||||||||||||||||||||||||||||||||||||||
                |||||||||||||||||||||||||||||||||||||||||||||||||||||||||
                |||||||||||||||||||||||||||||||||||||||||||||||||||||||||
                |||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/