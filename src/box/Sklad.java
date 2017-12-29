package box;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.io.File;
import java.util.regex.Pattern;

public interface Sklad {
    File file = new File("Zurnal.txt");
    File file2 = new File("Zurnal2.txt");
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    Pattern p = Pattern.compile("[0-9]{0,2}"); //Ограничение на 2 позиции для часов\дней\месяцев\минут.
    Pattern p4 = Pattern.compile("[0-9]{0,4}"); //Ограничение на 4 позиции для года
    Pattern p1 = Pattern.compile("[а-яА-Я]{1,20}||[a-zA-Z]{0,20}");
    ObservableList<Kinzka> listknizka = FXCollections.observableArrayList();
    ObservableList<Poisk_po_imeni> listpi = FXCollections.observableArrayList();
    ObservableList<Poisk_po_date> listpd = FXCollections.observableArrayList();
}
