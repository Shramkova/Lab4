package box;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller_poisk_po_imeni implements Sklad {
    @FXML
    private TextField Poisk_po_imeni;

    @FXML
    public void initialize() {
        Poisk_po_imeni.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p1.matcher(newValue).matches()) Poisk_po_imeni.setText(oldValue);
        });
    }

    @FXML
    public void search() {
        int a = 0;
        listpi.clear();
        String str = Poisk_po_imeni.getText();
        if(listknizka.isEmpty()) {
            alert.setTitle("Ошибка при поиске по имени");
            alert.setHeaderText(null);
            alert.setContentText("Нечего искать.\nОткройте базу данных или внесите данные.");

            alert.showAndWait();
        }else if (str.equals("")) {
            alert.setTitle("Ошибка при поиске по имени");
            alert.setHeaderText(null);
            alert.setContentText("При поиске имени ,поле ввода оказалось пустое.\nВведите имя и повторите попытку");

            alert.showAndWait();
        }
        else {

            for (Kinzka it : listknizka) {


                String f = it.getOt();
                String t = it.getKomu();
                Integer day = it.getDay();
                Integer mon = it.getMonth();
                Integer ye = it.getYear();
                Integer hour = it.getHour();
                Integer min = it.getMinut();
                if (str.equals(it.Ot)) {

                    listpi.add(new Poisk_po_imeni(f, t, day, mon, ye, hour, min));
                } else{
                    a++;

                    if(a == listpi.size()){
                        alert.setTitle("Ошибка при поиске по имени");
                        alert.setHeaderText(null);
                        alert.setContentText("Такого имени нет");

                        alert.showAndWait();
                    }
                }
            }
        }
    }
}
