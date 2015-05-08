package org.activiti.editor.language.xml;

import static org.junit.Assert.assertEquals;

import org.activiti.bpmn.converter.UserCheck;
import org.junit.Test;

public class UserCheckTest {
	
	@Test
	public void testUserCheck()
	{
		UserCheck uc = new UserCheck();
		
		assertEquals("manager", uc.checkId(1));
		assertEquals("employee", uc.checkId(2));
	}
	
}
