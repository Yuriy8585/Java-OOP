package Homework5.presenters;

import java.util.Collection;

import Homework5.models.Table;

public interface View {


    void showTables(Collection<Table> tables);

    void showReservationStatus(int reservationNo);
    
    void setObserver(ViewObserver observer);


}
