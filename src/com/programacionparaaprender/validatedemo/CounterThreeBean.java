package com.programacionparaaprender.validatedemo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class CounterThreeBean {

	private int value;
	
	public CounterThreeBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String increment() {
		value++;
		return "counter_three_form";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	
}
