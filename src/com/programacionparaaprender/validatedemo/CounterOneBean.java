package com.programacionparaaprender.validatedemo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class CounterOneBean implements Serializable {

	private int value;
	
	public CounterOneBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String increment() {
		value++;
		return "counter_one_form";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	
}
