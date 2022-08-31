package com.dtt.generic.service.validator;

public interface BaseValidator<M> {
	boolean validate(M obj);
}
