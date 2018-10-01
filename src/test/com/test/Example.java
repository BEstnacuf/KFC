package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.CourseService;

public class Example {

	@Test
	public void test() {
		CourseService course = new CourseService();
		String expected = "A";
		int score = 80;
		
		String actual = course.calulateGrade(score);
		
		assertEquals(expected, actual);
	}

}
