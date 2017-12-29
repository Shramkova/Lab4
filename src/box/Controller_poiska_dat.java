package box;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller_poiska_dat implements Sklad {
    @FXML
    private TextField SearchOtDay;
    @FXML
    private TextField SearchOtMon;
    @FXML
    private TextField SearchOtYe;
    @FXML
    private TextField SearchDoDay;
    @FXML
    private TextField SearchDoMon;
    @FXML
    private TextField SearchDoYe;
    @FXML
    public void initialize(){
        SearchOtDay.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) SearchOtDay.setText(oldValue);
        });
        SearchOtMon.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) SearchOtMon.setText(oldValue);
        });
        SearchOtYe.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p4.matcher(newValue).matches()) SearchOtYe.setText(oldValue);
        });
        SearchDoDay.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) SearchDoDay.setText(oldValue);
        });
        SearchDoMon.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) SearchDoMon.setText(oldValue);
        });
        SearchDoYe.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p4.matcher(newValue).matches()) SearchDoYe.setText(oldValue);
        });}

    @FXML
    public void searchDate() {
        int scht = 0;
        int date;
        int date_ot;
        int date_po;

        String a1 = SearchOtDay.getText();
        String f1 = SearchOtMon.getText();
        String t1 = SearchOtYe.getText();
        String b1 = SearchDoDay.getText();
        String c1 = SearchDoMon.getText();
        String h1 = SearchDoYe.getText();
        int a2 = Integer.parseInt(SearchOtDay.getText());
        int b2 = Integer.parseInt(SearchOtMon.getText());
        int c2 = Integer.parseInt(SearchOtYe.getText());
        int aa1 = Integer.parseInt(SearchDoDay.getText());
        int bb1 = Integer.parseInt(SearchDoMon.getText());
        int cc1 = Integer.parseInt(SearchDoYe.getText());


        if (listknizka.isEmpty()) {
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);

            alert.setContentText("Нечего искать.\nОткройте базу данных или внесите данные.");
            alert.showAndWait();

        } else if ((f1.equals("")) || (t1.equals("")) || (a1.equals("")) || (b1.equals("")) || (c1.equals("")) || (h1.equals(""))) {
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("При поиске даты,\nкакое-то из полей было не заполненно");

            alert.showAndWait();

        } else {
            listpd.clear();
            int a = Integer.parseInt(SearchOtDay.getText());
            int b = Integer.parseInt(SearchOtMon.getText());
            int c = Integer.parseInt(SearchOtYe.getText());
            int aa = Integer.parseInt(SearchDoDay.getText());
            int bb = Integer.parseInt(SearchDoMon.getText());
            int cc = Integer.parseInt(SearchDoYe.getText());
            date_ot = ((((c) - 1990) * 360) + ((b) * 30) + (a));
            date_po = ((((cc) - 1990) * 360) + ((bb) * 30) + (aa));
            if (b > 12) {
                alert.setTitle("Ошибка при поиске даты. Дата !ОТ! ");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает " + b + " месяцев\nВ году 12 месяцев");

                alert.showAndWait();
            } else if (c < 1900) {
                alert.setTitle("Ошибка при поиске даты. Дата !ОТ!");
                alert.setHeaderText(null);
                alert.setContentText("Давайте не будем лезть в ту эпоху\n\nПоле ошибки |Год|");

                alert.showAndWait();
            } else if (a > 31) {
                alert.setTitle("Ошибка при поиске даты. Дата !ОТ!");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает " + a + " дней в месяце\nВ месяце почти всегда 30 дней");
                alert.showAndWait();
            } else if (c > 2020) {
                alert.setTitle("Ошибка при поиске даты. Дата !ОТ!");
                alert.setHeaderText(null);
                alert.setContentText("Такое далёкое будущее...\nМожет в другой раз?\nПоле ошибки |Год|");

                alert.showAndWait();
            } else if (bb > 12) {
                alert.setTitle("Ошибка при поиске даты. Дата !ПО! ");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает " + b + " месяцев\nВ году 12 месяцев");

                alert.showAndWait();
            } else if (cc < 1900) {
                alert.setTitle("Ошибка при поиске даты. Дата !ПО!");
                alert.setHeaderText(null);
                alert.setContentText("Давайте не будем лезть в ту эпоху\n\nПоле ошибки |Год|");

                alert.showAndWait();
            } else if (aa > 31) {
                alert.setTitle("Ошибка при поиске даты. Дата !ПО!");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает " + a + " дней в месяце\nВ месяце почти всегда 30 дней");
                alert.showAndWait();
            } else if (cc > 2020) {
                alert.setTitle("Ошибка при поиске даты. Дата !ПО!");
                alert.setHeaderText(null);
                alert.setContentText("Такое далёкое будущее...\nМожет в другой раз?\nПоле ошибки |Год|");

                alert.showAndWait();
            } else if ((cc<c)) {
                alert.setTitle("Ошибка при поиске даты.");
                alert.setHeaderText(null);
                alert.setContentText("Так нельзя , мы же ищем ОТ даты и ДО даты");

                alert.showAndWait();
            }else {


                for (Kinzka it : listknizka) {
                    String f = it.getOt();
                    String t = it.getKomu();
                    Integer day = it.getDay();
                    Integer mon = it.getMonth();
                    Integer ye = it.getYear();
                    Integer hour = it.getHour();
                    Integer min = it.getMinut();
                    date = ((((it.Year) - 1990) * 360) + ((it.Month) * 30) + (it.Day));

                    if ((date >= date_ot) && (date <= date_po)) {
                        listpd.add(new Poisk_po_date(f, t, day, mon, ye, hour, min));

                    } else {
                        if (((date_ot < date) && (date_po < date)) || ((date_ot > date) && (date_po > date))) {
                            scht++;
                        }
                    }
                    if (scht == listknizka.size()) {
                        alert.setTitle("Ошибка");
                        alert.setHeaderText(null);
                        alert.setContentText("Введённый вами интервал не дал результатов");
                        alert.showAndWait();
                    }
                }
            }
        }
    }
}
