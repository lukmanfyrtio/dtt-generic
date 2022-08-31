package com.dtt.generic.persistence.converter;

public interface GenericConverter<S, T> {
		public T convert(S a);
}
