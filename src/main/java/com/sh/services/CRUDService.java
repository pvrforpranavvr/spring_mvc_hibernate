package com.sh.services;

public interface CRUDService<E> {
	E create(E e);

	E read(long id);

	E update(long id);

	int delete(long id);
}
