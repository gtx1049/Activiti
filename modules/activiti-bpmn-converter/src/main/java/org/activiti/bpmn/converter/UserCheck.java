package org.activiti.bpmn.converter;

public class UserCheck {
	
	public static final int MANAGER_ID = 1;
	public static final int EMPLOYEE_ID = 2;
	
	private String manager;
	private String employee;
	
	public UserCheck()
	{
		manager = "manager";
		employee = "employee";
	}
	
	public String checkId(int id)
	{
		String ret = null;
		switch (id)
		{
		case MANAGER_ID:
			ret = manager;
		case EMPLOYEE_ID:
			ret = employee;
		}
		return ret;
	}
}
