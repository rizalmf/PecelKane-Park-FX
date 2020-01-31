/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder.controller;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author PKane_NS
 */
public class ParkController implements Initializable {

    @FXML
    private Label aku;
    @FXML
    private Button istana;
    @FXML
    private Button komediPutar;
    @FXML
    private Button ayunanMantul;
    @FXML
    private Pane paneBiangLele;
    @FXML
    private Pane paneBombom;
    @FXML
    private Pane paneCurciss;
    @FXML
    private Pane paneWaniGas;
    @FXML
    private Group group;
    @FXML
    private Pane paneRoute;

    /**
     * Initializes the controller class.
     */
    // aku (258,457)
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setVisible(new Button());
        paneRoute.setVisible(false);
        aku.setText(" ");
        group.setAutoSizeChildren(false);
        group.getChildren().clear();
        // TODO
    }    
    private void setVisible(Node wahana){
        paneBiangLele.setVisible(false);
        paneBombom.setVisible(false);
        paneCurciss.setVisible(false);
        paneWaniGas.setVisible(false);
        wahana.setVisible(true);
    }
    @FXML
    private void akuKepencet(MouseEvent event) {
        aku.setText("kamu disini");
        Timeline tl = new Timeline(new KeyFrame(Duration.ONE, (e) -> {
            aku.setText(" ");
        }));
        tl.setCycleCount(1);
        tl.setDelay(Duration.seconds(1));
        tl.play();
    }

    @FXML
    private void onDrag(MouseEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setX(event.getScreenX() - xOffset);
        stage.setY(event.getScreenY() - yOffset);
    }

    private double xOffset = 0;
    private double yOffset = 0;
    @FXML
    private void onPress(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }
    private void hide(Node wahana){
        Timeline tl = new Timeline(new KeyFrame(Duration.ONE, (e) -> {
            wahana.setVisible(false);
        }));
        tl.setCycleCount(1);
        tl.setDelay(Duration.millis(1500));
        tl.play();
    }
    @FXML
    private void circus(ActionEvent event) {
        setVisible(paneCurciss);
        hide(paneCurciss);
    }

    @FXML
    private void biangLala(ActionEvent event) {
        setVisible(paneBiangLele);
        hide(paneBiangLele);
    }

    @FXML
    private void bomcar(ActionEvent event) {
        setVisible(paneBombom);
        hide(paneBombom);
    }

    @FXML
    private void rollercoaster(ActionEvent event) {
        setVisible(paneWaniGas);
        hide(paneWaniGas);
    }
    /* aku (258,457) */
    @FXML 
    private void goBiangLele(ActionEvent event) {
        paneRoute.setVisible(true);
        Timeline tt = new Timeline(new KeyFrame(Duration.ONE, (ev) -> {
            paneRoute.setVisible(false);
            aku.setVisible(false);
            group.getChildren().clear();
            Label l = avatarKu();
            group.getChildren().add(l);
            Path path = new Path();
            path.getElements().add(new MoveTo(258, 457));
            path.getElements().add(new LineTo(258, 432));
            path.getElements().add(new LineTo(170, 432));
            path.getElements().add(new LineTo(170f, 269f));
            path.getElements().add(new LineTo(170f, 269f));
            path.getElements().add(new LineTo(78f, 269f));
            path.getElements().add(new LineTo(78f, 253f));
            PathTransition transition = new PathTransition();
            transition.setDuration(Duration.millis(2500));
            transition.setPath(path);
            transition.setNode(l);
            transition.setCycleCount(1);
            transition.setAutoReverse(false);
            transition.play();
        }));
        tt.setCycleCount(1);
        tt.setDelay(Duration.millis(2000));
        tt.play();
    }
    
    private Label avatarKu(){
        Label l = new Label("aku disini");
        l.setId("lAku");
        l.setPrefSize(71, 54);
        FontAwesomeIconView icon = new FontAwesomeIconView(FontAwesomeIcon.CHILD);
        icon.setFill(Paint.valueOf("#8500ff"));//Color.getColor("#8500ff")
        icon.setSize("30");
        l.setGraphic(icon);
        return l;
    }

    @FXML 
    private void goBombom(ActionEvent event) {
        paneRoute.setVisible(true);
        Timeline tt = new Timeline(new KeyFrame(Duration.ONE, (ev) -> {
            paneRoute.setVisible(false);
            aku.setVisible(false);
            group.getChildren().clear();
            Label l = avatarKu();
            group.getChildren().add(l);
            Path path = new Path();
            path.getElements().add(new MoveTo(258, 457));
            path.getElements().add(new LineTo(258, 432));
            path.getElements().add(new LineTo(119,432));
            path.getElements().add(new LineTo(119, 447));
            path.getElements().add(new LineTo(36,447));
            path.getElements().add(new LineTo(36,432));
            path.getElements().add(new LineTo(-70,432));
            path.getElements().add(new LineTo(-70,-70));
            path.getElements().add(new LineTo(278,-70));
            path.getElements().add(new LineTo(278,197));
            PathTransition transition = new PathTransition();
            transition.setDuration(Duration.millis(5500));
            transition.setPath(path);
            transition.setNode(l);
            transition.setCycleCount(1);
            transition.setAutoReverse(false);
            transition.play();
        }));
        tt.setCycleCount(1);
        tt.setDelay(Duration.millis(2000));
        tt.play();
    }

    @FXML 
    private void goCurciss(ActionEvent event) {
        paneRoute.setVisible(true);
        Timeline tt = new Timeline(new KeyFrame(Duration.ONE, (ev) -> {
            paneRoute.setVisible(false);
            aku.setVisible(false);
            group.getChildren().clear();
            Label l = avatarKu();
            group.getChildren().add(l);
            Path path = new Path();
            path.getElements().add(new MoveTo(258, 457));
            path.getElements().add(new LineTo(258, 432));
            path.getElements().add(new LineTo(170, 432));
            path.getElements().add(new LineTo(170, 372));
            path.getElements().add(new LineTo(213,326));
            path.getElements().add(new LineTo(287,326));
            PathTransition transition = new PathTransition();
            transition.setDuration(Duration.millis(3000));
            transition.setPath(path);
            transition.setNode(l);
            transition.setCycleCount(1);
            transition.setAutoReverse(false);
            transition.play();
        }));
        tt.setCycleCount(1);
        tt.setDelay(Duration.millis(2000));
        tt.play();
    }

    @FXML 
    private void goWaniGas(ActionEvent event) {
        paneRoute.setVisible(true);
        Timeline tt = new Timeline(new KeyFrame(Duration.ONE, (ev) -> {
            paneRoute.setVisible(false);
            aku.setVisible(false);
            group.getChildren().clear();
            Label l = avatarKu();
            group.getChildren().add(l);
            Path p1 = new Path();
            p1.getElements().add(new MoveTo(258, 457));
            p1.getElements().add(new LineTo(258, 416));
            PathTransition t1 = new PathTransition();
            t1.setDuration(Duration.millis(500));
            t1.setPath(p1);
            t1.setNode(l);
            t1.setCycleCount(1);
            t1.setAutoReverse(false);
            t1.play();

            Timeline tl1 = new Timeline(new KeyFrame(Duration.ONE, (e) -> {
                l.setRotate(90);
                Path p2 = new Path();
                p2.getElements().add(new MoveTo(258, 416));
                p2.getElements().add(new LineTo(645,416));
                p2.getElements().add(new MoveTo(-70, 148));
                p2.getElements().add(new LineTo(426,148));
                PathTransition t2 = new PathTransition();
                t2.setDuration(Duration.millis(2500));
                t2.setPath(p2);
                t2.setNode(l);
                t2.setCycleCount(1);
                t2.setAutoReverse(false);
                t2.play();
            }));
            tl1.setCycleCount(1);
            tl1.setDelay(Duration.millis(500));
            tl1.play();
            Timeline tl2 = new Timeline(new KeyFrame(Duration.ONE, (e) -> {
                l.setRotate(0);
            }));
            tl2.setCycleCount(1);
            tl2.setDelay(Duration.millis(3000));
            tl2.play();
        }));
        tt.setCycleCount(1);
        tt.setDelay(Duration.millis(2000));
        tt.play();
    }

    @FXML
    private void cari(ActionEvent event) {
        //findNodeWisata
        group.getChildren().clear();
        aku.setVisible(true);
    }
    
}
