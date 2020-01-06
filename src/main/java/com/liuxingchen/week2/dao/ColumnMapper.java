package com.liuxingchen.week2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuxingchen.week2.domain.Column;

public interface ColumnMapper {

	List<Column> addColumn(Column column);

	//展示列表
	List<Column> getColumnList(Column column);

	//修改
	void updateColumn(@Param("id")Integer id);

}
