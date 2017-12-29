package box;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.LinkedHashSet;

public class Controller_dobavlemie_v_knizku implements Sklad {
    @FXML
    private TextField OtKogo;
    @FXML
    private TextField Komu;
    @FXML
    private TextField Chasi;
    @FXML
    private TextField Minuti;
    @FXML
    private TextField Den;
    @FXML
    private TextField Mesyac;
    @FXML
    private TextField God;

    @FXML
    public void initialize(){
        Den.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) Den.setText(oldValue);
        });
        Mesyac.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) Mesyac.setText(oldValue);
        });
        God.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p4.matcher(newValue).matches()) God.setText(oldValue);
        });
        Chasi.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) Chasi.setText(oldValue);
        });
        Minuti.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) Minuti.setText(oldValue);
        });
        OtKogo.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p1.matcher(newValue).matches()) OtKogo.setText(oldValue);
        });
        Komu.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p1.matcher(newValue).matches()) Komu.setText(oldValue);
        });
       
    }

    @FXML
    public void add_modal() {
        LinkedHashSet<Kinzka> hs = new LinkedHashSet<>();

        String f = OtKogo.getText();
        String t = Komu.getText();
        String a1 = Den.getText();
        String b1 = Mesyac.getText();
        String c1 = God.getText();
        String h1 = Chasi.getText();
        String m1 = Minuti.getText();

        if ((f.equals("")) || (t.equals("")) || (a1.equals("")) || (b1.equals("")) || (c1.equals("")) || (h1.equals("")) || (m1.equals(""))) { //Переменная.equals("Что сравнивается")
            alert.setTitle("Ошибка при вводе данных в журнал");
            alert.setHeaderText(null);
            alert.setContentText("При добавлении информации в журнал,\nкакое-то из полей было не заполненно");
            alert.showAndWait();

        }else {
            int b = Integer.parseInt(Mesyac.getText());
            int c = Integer.parseInt(God.getText());
            int h = Integer.parseInt(Chasi.getText());
            int m = Integer.parseInt(Minuti.getText());
            int a = Integer.parseInt(Den.getText());
            if(b>12){
                alert.setTitle("Ошибка при вводе данных в журнал");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает "+b+" месяцев\nВ году 12 месяцев");

                alert.showAndWait();
            }else if(c<1900){
                alert.setTitle("Ошибка при вводе данных в журнал.");
                alert.setHeaderText(null);
                alert.setContentText("Давайте не будем лезть в ту эпоху\n\nПоле ошибки |Год|");

                alert.showAndWait();
            }else if(h>24){
                alert.setTitle("Ошибка при вводе данных в журнал.");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает "+h+" часов\nВ одном дне 24 часа.");

                alert.showAndWait();
            }
            else if(m>60){
                alert.setTitle("Ошибка при вводе данных в журнал.");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает "+m+" минут\nВ одном часу 60 минут.");

                alert.showAndWait();
            }
            else if(a>31){
                alert.setTitle("Ошибка при вводе данных в журнал.");
                alert.setHeaderText(null);
                alert.setContentText("Не бывает "+a+" дней в месяце\nВ месяце почти всегда 30 дней");

                alert.showAndWait();
            }else if(c>2017){
                alert.setTitle("Ошибка при вводе данных в журнал.");
                alert.setHeaderText(null);
                alert.setContentText("Такое далёкое будущее...\nМожет в другой раз?\nПоле ошибки |Год|");

                alert.showAndWait();
            }
            else {
                listknizka.add(new Kinzka(f, t, a, b, c, h, m));
                hs.addAll(listknizka); 
                listknizka.clear();
                listknizka.addAll(hs);
            }
        }

    }
}
