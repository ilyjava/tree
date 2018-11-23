package ru.ref.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;

import com.google.gwt.user.client.ui.VerticalPanel;

public class GridSection extends  Section {
    public VerticalPanel create(){
        VerticalPanel vp = new VerticalPanel();
        Grid firstGrid = new Grid(2, 2);
        firstGrid.setText(0, 0, "1,1");
        firstGrid.setText(0, 1, "1,2");
        firstGrid.setText(1, 0, "2,1");
        firstGrid.setText(1, 1, "2,2");
        firstGrid.setBorderWidth(3);
        Grid secondGrid = new Grid(2, 2);
        secondGrid.setText(0, 0, "1,1");
        secondGrid.setText(0, 1, "1,2");
        secondGrid.setText(1, 0, "2,1");
        secondGrid.setText(1, 1, "2,2");
        secondGrid.setBorderWidth(3);
        vp.add(firstGrid);
        vp.add(secondGrid);
        vp.add(new Button("Сохранить"));
        vp.add(new Button("Отменить"));

        return vp;
    }
}
