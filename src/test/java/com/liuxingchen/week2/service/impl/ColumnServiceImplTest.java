package com.liuxingchen.week2.service.impl;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashSet;

import org.junit.Test;

import com.liuxingchen.week2.domain.Column;

public class ColumnServiceImplTest {

	@Test
	public void testAddColumn() throws Exception {
		File file = new File("D:\\cms.txt");
		FileInputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String readLine = br.readLine();
		String[] split = readLine.split(readLine);
		Column column = new Column();
		
	}

}
