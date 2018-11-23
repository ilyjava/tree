package ru.ref.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TextBoxSection extends Section {
    public VerticalPanel create(){
        VerticalPanel vp = new VerticalPanel();
        vp.add(new TextBox());
        vp.add(new TextBox());
        vp.add(new Button("Сохранить"));
        vp.add(new Button("Отменить"));

        return vp;
    }
}
