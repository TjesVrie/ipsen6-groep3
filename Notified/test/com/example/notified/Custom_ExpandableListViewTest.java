package com.example.notified;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.notified.Custom_ExpandableListView;

public class Custom_ExpandableListViewTest {

	  @Test
	  public void testMultiply() {
		  Custom_ExpandableListView tester = new Custom_ExpandableListView();
	    assertEquals("Result", 50, tester.multiply(10, 5));
	  }
	} 