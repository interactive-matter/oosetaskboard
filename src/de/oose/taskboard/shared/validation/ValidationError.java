package de.oose.taskboard.shared.validation;

import java.io.Serializable;

public class ValidationError<T> implements Serializable {
	
	private T target;
	private String field;
	private String message;
	
	public ValidationError(T target, String field, String message) {
		super();
		this.target = target;
		this.field = field;
		this.message = message;
	}

	public T getTarget() {
		return target;
	}

	public String getField() {
		return field;
	}

	public String getMessage() {
		return message;
	}
	
	
	
	

}
