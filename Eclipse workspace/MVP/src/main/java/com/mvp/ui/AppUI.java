package com.mvp.ui;

import com.mvp.models.Person;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
@SpringUI
@Theme("valo")
public class AppUI extends UI{

	@Override
	protected void init(VaadinRequest request) {
		
		VerticalLayout verticalLayout = new VerticalLayout();
		Grid<Person> personsGrid = new Grid<Person>();
		Person me = new Person("Stamat", "Dobrev");
		personsGrid.setItems(me);
		personsGrid.addColumn(Person::getFirstName).setCaption("First name");
		personsGrid.addColumn(Person::getLastName).setCaption("Last name");
		verticalLayout.addComponents(personsGrid);
		setContent(verticalLayout);
	}
	
}
