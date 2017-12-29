package box;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class Controller_otobrazenia_kizki implements Sklad{
    @FXML
    private TableView<Kinzka> table;//Это вся табличка , куда заполняются листы. ЖУРНАЛ
    @FXML
    TableColumn<Kinzka, String> OtKogo;//Это колонка ОТ КОГО , тип стринг.
    @FXML
    TableColumn<Kinzka, String> Komu;
    @FXML
    TableColumn<Kinzka, Integer> Den;//Это колонка для числовых данных типа ИНТ.
    @FXML
    TableColumn<Kinzka, Integer> Mes;
    @FXML
    TableColumn<Kinzka, Integer> God;
    @FXML
    TableColumn<Kinzka, Integer> Hour;
    @FXML
    TableColumn<Kinzka, Integer> Min;

    @FXML
    public void initialize() {

        table.itemsProperty().setValue(listknizka);//Тут я говорю , что табличка принимает коллекцию для журнала.
        OtKogo.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Kinzka, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Kinzka, String> param) {
                return new SimpleStringProperty(param.getValue().getOt());
            }
        });//Тут говорится , что эта колонка принимает параметр GetF ( От кого (String f)
        Komu.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Kinzka, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<Kinzka, String> param) {
                return new SimpleStringProperty(param.getValue().getKomu());
            }
        });
        Den.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Kinzka, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Kinzka, Integer> param) {
                return new SimpleObjectProperty<>(param.getValue().getDay());
            }
        });
        Mes.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Kinzka, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Kinzka, Integer> param) {
                return new SimpleObjectProperty<>(param.getValue().getMonth());
            }
        });
        God.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Kinzka, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Kinzka, Integer> param) {
                return new SimpleObjectProperty<>(param.getValue().getYear());
            }
        });
        Hour.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Kinzka, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Kinzka, Integer> param) {
                return new SimpleObjectProperty<>(param.getValue().getHour());
            }
        });
        Min.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Kinzka, Integer>, ObservableValue<Integer>>() {
            @Override
            public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Kinzka, Integer> param) {
                return new SimpleObjectProperty<>(param.getValue().getMinut());
            }
        });
    }
}
