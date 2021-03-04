package com.nt.controller;

import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeServ;
import com.nt.vo.EmployeeVo;

public class EmployeeTestController {
 private EmployeeServ service;
 public EmployeeTestController(EmployeeServ service) {
this.service=service;
}
 public String process(EmployeeVo vo)throws Exception{
	 EmployeeDto dto=null;
	 String result=null;
	 //convert into dto to vgo class object
	 dto=new EmployeeDto();
	 dto.setEname(vo.getEname());
	 dto.setEadd(vo.getEadd());
	 dto.setEnatsal(Float.parseFloat(vo.getEnatsal()));
	 dto.setEgrossal(Float.parseFloat(vo.getEgrossal()));
	 //use service
	 result=service.Register_Employee(dto);
	 return result;
 }
}
