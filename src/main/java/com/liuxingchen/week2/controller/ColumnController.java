package com.liuxingchen.week2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.liuxingchen.week2.domain.Column;
import com.liuxingchen.week2.service.ColumnService;
/**
 * 
 * @ClassName: ColumnController 
 * @Description: controller控制层
 * @author: HP
 * @date: 2020年1月6日 上午10:16:45
 */
@Controller
public class ColumnController {

	@Autowired
	private ColumnService service;
	
	//添加
	public Object insert(Column column) {
		List<Column> list = service.addColumn(column);
		return column;
	}
	
	//展示列表
	@RequestMapping("list")
	public String getColumnList(Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "3")Integer pageSize,Column column) {
		PageInfo<Column> info = service.getColumnList(column,pageNum,pageSize);
		model.addAttribute("info", info);
		model.addAttribute("column", column);
		return "list";
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate() {
		return "update";
	}
	
	@RequestMapping("update")
	public String updateColumn(Integer id) {
		service.updateColumn(id);
		return "redirect:list";
	}
}
