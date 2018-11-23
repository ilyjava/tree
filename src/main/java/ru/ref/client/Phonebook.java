package ru.ref.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.view.client.SelectionChangeEvent;

import com.google.gwt.view.client.SingleSelectionModel;
import ru.ref.shared.Contact;

import java.util.ArrayList;


public class Phonebook implements EntryPoint, TreeListener {

    private ServiceAsync service = GWT.create(Service.class);

    HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
    Tree tree = new Tree();

    public void onModuleLoad() {

        /*CellTable<Contact> cellTableOfContacts = new CellTable<>();
        cellTableOfContacts.setKeyboardSelectionPolicy(HasKeyboardSelectionPolicy.KeyboardSelectionPolicy.ENABLED);

        TextColumn<Contact> columnIdLine = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact contact) {
                return String.valueOf(contact.getId());
            }
        };
        cellTableOfContacts.addColumn(columnIdLine, "Id");

        TextColumn<Contact> columnNameLine = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact contact) {
                return contact.getName();
            }
        };
        cellTableOfContacts.addColumn(columnNameLine, "Name");

        TextColumn<Contact> columnAddressLine = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact contact) {
                return contact.getAddress();
            }
        };
        cellTableOfContacts.addColumn(columnAddressLine, "Address");

        TextColumn<Contact> columnPhoneLine = new TextColumn<Contact>() {
            @Override
            public String getValue(Contact contact) {
                return contact.getPhone();
            }
        };
        cellTableOfContacts.addColumn(columnPhoneLine, "Phone");

        final SingleSelectionModel<Contact> selectionModel = new SingleSelectionModel();
        cellTableOfContacts.setSelectionModel(selectionModel);
        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            @Override
            public void onSelectionChange(SelectionChangeEvent selectionChangeEvent) {
                Contact selectedContact = selectionModel.getSelectedObject();
                if (selectedContact != null) {
                    Window.alert("Selected: Id line: " + selectedContact.getId() + ", Address line: " + selectedContact.getAddress());
                }
            }
        });
        cellTableOfContacts.setRowCount(5, true);

        Button loadData = new Button("Загрузить данные");
        VerticalPanel vp = new VerticalPanel();
        VerticalPanel dbvp = new VerticalPanel();
        DialogBox dialogBox = new DialogBox();
        Label labelId = new Label();
        Label labelName = new Label();
        Label labelAddress = new Label();
        Label labelPhone = new Label();
        TextBox textBoxId = new TextBox();
        TextBox textBoxName = new TextBox();
        TextBox textBoxAddress = new TextBox();
        TextBox textBoxPhone = new TextBox();
        Button saveData = new Button("Сохранить изменения");
        dbvp.add(labelId);
        dbvp.add(textBoxId);
        dbvp.add(labelName);
        dbvp.add(textBoxName);
        dbvp.add(labelAddress);
        dbvp.add(textBoxAddress);
        dbvp.add(labelPhone);
        dbvp.add(textBoxPhone);
        dbvp.add(saveData);
        *//*dialogBox.add(textBoxId);
        dialogBox.add(textBoxName);
        dialogBox.add(textBoxAddress);
        dialogBox.add(textBoxPhone);*//*
        RootPanel.get().add(loadData);

        cellTableOfContacts.addDomHandler(new DoubleClickHandler() {
            @Override
            public void onDoubleClick(final DoubleClickEvent event) {
                Contact selected = selectionModel.getSelectedObject();
                if (selected != null) {
                    labelId.setText("Id контакта" );
                    textBoxId.setText(String.valueOf(selected.getId()));
                    textBoxId.setReadOnly(true);
                    labelName.setText("Имя контакта");
                    textBoxName.setText(selected.getName());
                    labelAddress.setText("Адрес контакта");
                    textBoxAddress.setText(selected.getAddress());
                    labelPhone.setText("Номер телефона контакта");
                    textBoxPhone.setText(selected.getPhone());
                    dialogBox.setWidget(dbvp);
                    dialogBox.setAnimationEnabled(true);
                    dialogBox.setGlassEnabled(true);

                    dialogBox.show();
                }
            }
        }, DoubleClickEvent.getType());

        loadData.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                service.getContacts(new AsyncCallback<ArrayList<Contact>>() {
                    @Override
                    public void onFailure(Throwable throwable) {

                    }

                    @Override
                    public void onSuccess(ArrayList<Contact> contacts) {
                        cellTableOfContacts.setRowData(0,  contacts);
                        vp.setBorderWidth(1);
                        vp.add(cellTableOfContacts);
                        RootPanel.get().add(vp);
                    }
                });
            }
        });

        saveData.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                service.updateFish(Integer.parseInt(textBoxId.getText()), textBoxName.getText(), textBoxAddress.getText(), textBoxPhone.getText(), new AsyncCallback<Void>() {
                    @Override
                    public void onFailure(Throwable throwable) {

                    }

                    @Override
                    public void onSuccess(Void aVoid) {
                        dialogBox.hide();
                    }
                });
            }
        });*/

// Create a Horizontal Split Panel

        horizontalSplitPanel.setSize("600px", "400px");
        horizontalSplitPanel.setSplitPosition("30%");


        TreeItem treeFirst = new TreeItem();
        treeFirst.setText("Первый раздел");
        treeFirst.addTextItem("Первая глава");
        treeFirst.addTextItem("Вторая глава");
        treeFirst.addTextItem("Третья глава");

        TreeItem treeSecond = new TreeItem();
        treeSecond.setText("Второй раздел");
        treeSecond.addTextItem("Первая глава");
        treeSecond.addTextItem("Вторая глава");
        treeSecond.addTextItem("Третья глава");

        TreeItem treeThird = new TreeItem();
        treeThird.setText("Третий раздел");
        treeThird.addTextItem("Первая глава");
        treeThird.addTextItem("Вторая глава");
        treeThird.addTextItem("Третья глава");

        tree.addItem(treeFirst);
        tree.addItem(treeSecond);
        tree.addItem(treeThird);
        tree.addTreeListener(this);
        horizontalSplitPanel.setLeftWidget(tree);

        DecoratorPanel decoratorPanel = new DecoratorPanel();
        decoratorPanel.add(horizontalSplitPanel);
        RootPanel.get().add(decoratorPanel);
    }

    @Override
    public void onTreeItemSelected(TreeItem treeItem) {

        TextBoxSection textBoxSection = new TextBoxSection();
        RadioButtonSection radioButtonSection = new RadioButtonSection();
        GridSection gridSection = new GridSection();
        if (treeItem.getText().equals("Первая глава") || treeItem.getText().equals("Первый раздел")){
            horizontalSplitPanel.setRightWidget(textBoxSection.create());
        }
        else if (treeItem.getText().equals("Вторая глава") || treeItem.getText().equals("Второй раздел")){
            horizontalSplitPanel.setRightWidget(radioButtonSection.create());
        }
        else if (treeItem.getText().equals("Третья глава") || treeItem.getText().equals("Третий раздел")){
            horizontalSplitPanel.setRightWidget(gridSection.create());
        }
    }

    @Override
    public void onTreeItemStateChanged(TreeItem treeItem) {

    }
}
