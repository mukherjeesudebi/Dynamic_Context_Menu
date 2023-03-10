package com.vaadin.components.data;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
	public static List<Person> getPersonList() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Person1", "Person1 Surname", "Person1@gmail.com", "Person1 Address", 1));
		list.add(new Person("Person2", "Person2 Surname", "Person2@gmail.com", "Person2 Address", 2));
		list.add(new Person("Person3", "Person3 Surname", "Person3@gmail.com", "Person3 Address", 3));
		list.add(new Person("Person4", "Person4 Surname", "Person4@gmail.com", "Person4 Address", 4));
		list.add(new Person("Person5", "Person5 Surname", "Person5@gmail.com", "Person5 Address", 5));
		list.add(new Person("Person6", "Person6 Surname", "Person6@gmail.com", "Person6 Address", 6));
		return list;
	}

	public static List<Person> getPersonListSubTree(Integer id) {
		List<Person> list = new ArrayList<>();
		if(id == 1) {
			list.add(new Person("Person1.1", "Person1.1 Surname", "Person1.1@gmail.com", "Person1.1 Address", 11));
			list.add(new Person("Person1.2", "Person1.2 Surname", "Person1.2@gmail.com", "Person1.2 Address", 12));
		}else if(id == 2) {
			list.add(new Person("Person2.1", "Person2.1 Surname", "Person2.1@gmail.com", "Person2.2 Address", 21));
			list.add(new Person("Person2.2", "Person2.2 Surname", "Person2.2@gmail.com", "Person2.2 Address", 22));
		}else if(id == 3)  {
			list.add(new Person("Person3.1", "Person3.1 Surname", "Person3.1@gmail.com", "Person3.2 Address", 31));
			list.add(new Person("Person3.2", "Person3.2 Surname", "Person3.2@gmail.com", "Person3.2 Address", 32));
			list.add(new Person("Person3.3", "Person3.3 Surname", "Person3.3@gmail.com", "Person3.3 Address", 33));
		}else if(id == 4)  {
			list.add(new Person("Person4.1", "Person4.1 Surname", "Person4.1@gmail.com", "Person4.2 Address", 41));
		}else if(id == 5)  {
			list.add(new Person("Person5.1", "Person5.1 Surname", "Person5.1@gmail.com", "Person5.2 Address", 51));
		}else if(id == 6)  {
			list.add(new Person("Person6.1", "Person6.1 Surname", "Person6.1@gmail.com", "Person6.2 Address", 61));
		}
		return list;
	}
}
