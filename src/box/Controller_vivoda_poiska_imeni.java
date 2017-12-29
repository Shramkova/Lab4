package box;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;



public class Controller_vivoda_poiska_imeni implements Sklad {

            @FXML
        private TableView<Poisk_po_imeni> table;//Это вся табличка , куда заполняются листы. ЖУРНАЛ
        @FXML
        TableColumn<Poisk_po_imeni, String> OtKogo;//Это колонка ОТ КОГО , тип стринг.
        @FXML
        TableColumn<Poisk_po_imeni, String> Komu;
        @FXML
        TableColumn<Poisk_po_imeni, Integer> Den;//Это колонка для числовых данных типа ИНТ.
        @FXML
        TableColumn<Poisk_po_imeni, Integer> Mes;
        @FXML
        TableColumn<Poisk_po_imeni, Integer> God;
        @FXML
        TableColumn<Poisk_po_imeni, Integer> Hour;
        @FXML
        TableColumn<Poisk_po_imeni, Integer> Min;

        @FXML
        public void initialize() {

            table.itemsProperty().setValue(listpi);//Тут я говорю , что табличка принимает коллекцию для журнала.
            OtKogo.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Poisk_po_imeni, String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(TableColumn.CellDataFeatures<Poisk_po_imeni, String> param) {
                    return new SimpleStringProperty(param.getValue().getOt());
                }
            });//Тут говорится , что эта колонка принимает параметр GetF ( От кого (String f)
            Komu.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Poisk_po_imeni, String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(TableColumn.CellDataFeatures<Poisk_po_imeni, String> param) {
                    return new SimpleStringProperty(param.getValue().getKomu());
                }
            });
            Den.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Poisk_po_imeni, Integer>, ObservableValue<Integer>>() {
                @Override
                public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Poisk_po_imeni, Integer> param) {
                    return new SimpleObjectProperty<>(param.getValue().getDay());
                }
            });
            Mes.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Poisk_po_imeni, Integer>, ObservableValue<Integer>>() {
                @Override
                public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Poisk_po_imeni, Integer> param) {
                    return new SimpleObjectProperty<>(param.getValue().getMonth());
                }
            });
            God.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Poisk_po_imeni, Integer>, ObservableValue<Integer>>() {
                @Override
                public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Poisk_po_imeni, Integer> param) {
                    return new SimpleObjectProperty<>(param.getValue().getYear());
                }
            });
            Hour.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Poisk_po_imeni, Integer>, ObservableValue<Integer>>() {
                @Override
                public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Poisk_po_imeni, Integer> param) {
                    return new SimpleObjectProperty<>(param.getValue().getHour());
                }
            });
            Min.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Poisk_po_imeni, Integer>, ObservableValue<Integer>>() {
                @Override
                public ObservableValue<Integer> call(TableColumn.CellDataFeatures<Poisk_po_imeni, Integer> param) {
                    return new SimpleObjectProperty<>(param.getValue().getMinut());
                }
            });
        }
    }

