package com.liuxingchen.week2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuxingchen.week2.dao.ColumnMapper;
import com.liuxingchen.week2.domain.Column;
import com.liuxingchen.week2.service.ColumnService;

@Service
public class ColumnServiceImpl implements ColumnService {

	@Autowired
	private ColumnMapper mapper;

	//添加
	@Override
	public List<Column> addColumn(Column column) {
		return mapper.addColumn(column);
	}

	//展示列表
	@Override
	public PageInfo<Column> getColumnList(Column column, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Column> list = mapper.getColumnList(column);
		PageInfo<Column> info = new PageInfo<Column>(list);
		return info;
	}

	@Override
	public void updateColumn(Integer id) {
		mapper.updateColumn(id);
	}

}
