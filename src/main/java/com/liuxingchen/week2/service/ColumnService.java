package com.liuxingchen.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.liuxingchen.week2.domain.Column;

public interface ColumnService {

	//添加
	List<Column> addColumn(Column column);

	//展示列表
	PageInfo<Column> getColumnList(Column column, Integer pageNum, Integer pageSize);

	//修改
	void updateColumn(Integer id);

}
