package com.vaadin.components.contextmenuview;

import java.util.List;

import com.vaadin.components.data.Person;
import com.vaadin.components.data.PersonService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.treegrid.TreeGrid;
import com.vaadin.flow.router.Route;


@Route("")
public class TreeGridColumn extends HorizontalLayout {

	private List<Person> managers = PersonService.getPersonList();
	public TreeGridColumn() {
		
		TreeGrid<Person> treeGrid = new TreeGrid<>();
		treeGrid.setItems(managers, this::getStaff);
		treeGrid.addHierarchyColumn(Person::getFirstName).setHeader("First name");
		treeGrid.addColumn(Person::getLastName).setHeader("Last name");
		treeGrid.addColumn(Person::getEmail).setHeader("Email");

		GridContextMenu<Person> menu = treeGrid.addContextMenu();
        menu.addItem("View", event -> {
        });
        menu.addItem("Edit", event -> {
        });
        menu.addItem("Delete", event -> {
        });
        add(treeGrid);
        
        menu.setDynamicContentHandler(person -> {
            menu.removeAll();
            menu.addItem(person.getFirstName());
            menu.addItem(person.getLastName());
            menu.addItem(person.getId().toString());
            return true;
        });
        
        
        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.addColumn(Person::getFirstName).setHeader("First name");
        grid.addColumn(Person::getLastName).setHeader("Last name");
        grid.addColumn(Person::getEmail).setHeader("Email");
        grid.setItems(PersonService.getPersonList());
        
        GridContextMenu<Person> gridMenu = grid.addContextMenu();
        gridMenu.addItem("View1", event -> {
        });
        gridMenu.addItem("Edit1", event -> {
        });
        gridMenu.addItem("Delete1", event -> {
        });
        add(grid);
        
		             
        gridMenu.setDynamicContentHandler(person -> {
            gridMenu.removeAll();
            gridMenu.addItem(person.getFirstName());
            return true;
        });
	}
	
	public List<Person> getStaff(Person manager) {
        return PersonService.getPersonListSubTree(manager.getId());
    }
}
