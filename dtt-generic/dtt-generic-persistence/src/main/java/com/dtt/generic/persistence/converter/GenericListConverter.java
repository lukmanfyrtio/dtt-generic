package com.dtt.generic.persistence.converter;

import java.util.List;

public interface GenericListConverter <S, T> {
	public List<T> convert(List<S> a);
}
