package com.programacionparaaprender.validatedemo;

import java.io.Serializable;

//import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
//import javax.inject.Named;


@ManagedBean
//@Named
@ApplicationScoped
public class CounterBean implements Serializable {

	private int value;
	
	public CounterBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String increment() {
		value++;
		return "counter_form";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	
}
