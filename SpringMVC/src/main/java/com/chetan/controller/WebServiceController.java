package com.chetan.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@Controller
public class WebServiceController {

	@ResponseBody
	@RequestMapping(value = "/FirstWebService", method = RequestMethod.GET,  produces=MediaType.APPLICATION_XML_VALUE)
	public List<Student> getStudentAll() {
		Student s1 = new Student(1, "Chetan","");
		Student s2 = new Student(1, "Chetan","");
		Student s3 = new Student(1, "Chetan","");
		Student s4 = new Student();
		s4.setDob("20210814");
		

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(s1);
		listStudent.add(s2);
		listStudent.add(s3);
		listStudent.add(s4);
		System.out.println("Web service requested");
		return listStudent;
	}
	
//	@ResponseBody
//	@RequestMapping(value = "/FirstWebService/{name}", method = RequestMethod.GET)
//	public Student getStudent(@PathVariable("name") String stName) {
//		Student s1 = new Student();
//		s1.setName(stName);
//		return s1;
//	}
	
	@ResponseBody
	@RequestMapping(value = "/FirstWebService/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
		public Boolean getStudent(@PathVariable("name") String stName,@RequestBody Student student) {
		
		System.out.println(student.getName());
		System.out.println(student.getRollNo());
		//use db to insert;
		return true;
	}
	
	@ResponseBody
	@RequestMapping(value = "/FirstWebService/ErrCodeOk/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Boolean> getErrorCodeOk(@PathVariable("name") String stName,@RequestBody Student student) {
		
		System.out.println(student.getName());
		System.out.println(student.getRollNo());
		//use db to insert;
		HttpHeaders httpHeader =new HttpHeaders();
		httpHeader .add("key", "value1");
		httpHeader .add("key", "value2");
		httpHeader.add("Location", 
									ServletUriComponentsBuilder.fromCurrentRequest()
									.path("{name}")
//									.buildAndExpand(student.getName()).toUri()
									.toString());
		return new ResponseEntity<Boolean>(true,httpHeader,HttpStatus.NOT_FOUND);
	}
		
	@ResponseBody
	@RequestMapping(value = "/FirstWebService/Delete/{name}", method = RequestMethod.DELETE)
		public ResponseEntity<Boolean> getDelete(@PathVariable("name") String stName) {
		
		System.out.println("Started");
		
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
}
