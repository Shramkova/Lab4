package box;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;

import static box.Sklad.file;

public class MainController implements Sklad {

    @FXML
    public void Sohranenie() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true));//Бегунок для записи в файл с названием writer
            for (Kinzka ve : listknizka) {
                String f = ve.getOt();
                String t = ve.getKomu();
                Integer day = ve.getDay();
                Integer mon = ve.getMonth();
                Integer ye = ve.getYear();
                Integer hour = ve.getHour();
                Integer min = ve.getMinut();

                writer.write(f + " " + t + " " + day + " " + mon + " " + ye + " " + hour + " " + min + System.getProperty("line.separator"));

            }

            writer.close();
            file.delete();
            file2.renameTo(file);
        } catch (IOException ex) {
            ex.printStackTrace();


        }
    }

    @FXML
    public void Zagruzka() {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);//Бегунок для чтения с именем reader
            String strLine = null;

            while ((strLine = reader.readLine()) != null) {//Пока файл не пустой беги по нему
                String lines[] = strLine.split(" ");//Читай да первого пробела и запиши в массив элемент
                int a = Integer.parseInt(lines[2]);
                int b = Integer.parseInt(lines[3]);
                int c = Integer.parseInt(lines[4]);
                int h = Integer.parseInt(lines[5]);
                int m = Integer.parseInt(lines[6]);
                listknizka.add(new Kinzka(lines[0], lines[1], a, b, c, h, m));

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void showDialog(ActionEvent event) {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Modal_window.fxml"));
            stage.setTitle("Инструкция");
            stage.setMinHeight(334);
            stage.setMaxWidth(618);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            // stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Dobavit_v_knizku (ActionEvent event) {

        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Modal_add.fxml"));
            stage.setTitle("Добавление");
            stage.setMinHeight(250);
            stage.setMaxWidth(250);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            //  stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Naiti_polzovatela(ActionEvent event) {

        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Poisk_po_imeni.fxml"));
            stage.setTitle("Поиск по имени");
            stage.setMinHeight(77);
            stage.setMaxWidth(260);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Naiti_interval_dati(ActionEvent event) {

        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Poisk_po_date.fxml"));
            stage.setTitle("Поиск по дате");
            stage.setMinHeight(172);
            stage.setMaxWidth(490);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void Vivod_kizki(ActionEvent event) {

        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Vivod_kizki.fxml"));
            stage.setTitle("Записная книжка");
            stage.setMinHeight(370);
            stage.setMaxWidth(597);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Vivod_poisk_imya(ActionEvent event) {

        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Vivod_poiska_imeni.fxml"));
            stage.setTitle("Поиск имени");
            stage.setMinHeight(370);
            stage.setMaxWidth(597);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void Dobavlinie_novogo_polzovatela (ActionEvent event) {

        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Dobavlenie_informacii.fxml"));
            stage.setTitle("Добавление нового пользователя");
            stage.setMinHeight(278);
            stage.setMaxWidth(300);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void Vivod_poiska_po_date (ActionEvent event) {

        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Vivod_poiska_dat.fxml"));
            stage.setTitle("Поиск по дате");
            stage.setMinHeight(370);
            stage.setMaxWidth(597);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

