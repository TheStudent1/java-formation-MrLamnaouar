package com.IDAO.generic;

import java.util.List;

public interface IDAO<Entity> {

	int create(Entity e) throws Exception;

	int update(String mat, Entity e) throws Exception;

	Entity getOne(String mat) throws Exception;

	int delete(String mat) throws Exception;

	List<Entity> getAll() throws Exception;
}
