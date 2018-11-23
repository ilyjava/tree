package ru.ref.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;

public class RadioButtonSection extends  Section {
    public VerticalPanel create(){
        VerticalPanel vp = new VerticalPanel();
        vp.add(new RadioButton("RadioButton1"));
        vp.add(new RadioButton("RadioButton2"));
        vp.add(new Button("Сохранить"));
        vp.add(new Button("Отменить"));

        return vp;
    }
}
