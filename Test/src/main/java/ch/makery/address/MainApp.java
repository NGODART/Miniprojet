package ch.makery.address;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static ch.makery.address.DBconnection.checkDrivers;

public class MainApp {

    /**
     * The data as an observable list of Persons.
     */
    private ObservableList<Stage> stageData = FXCollections.observableArrayList();


    /**
     * Constructor
     */
    public MainApp() {
        // Add some sample data
        stageData.add(new Stage("Hans", "Muster", "12 Mai", 6, "M2"));
        stageData.add(new Stage("Ruth", "Mueller","13 Mai", 12, "M2"));
        stageData.add(new Stage("Heinz", "Kurz","14 Mai", 7, "M2"));
    }

    /**
     * Returns the data as an observable list of Persons.
     * @return
     */
    public ObservableList<Stage> getStageData() {
        return stageData;
    }

    public static void main(String[] args) {
        checkDrivers();    //check for driver errors
    }


}

