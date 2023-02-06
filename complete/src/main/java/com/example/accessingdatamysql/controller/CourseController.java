package com.example.accessingdatamysql.controller;

public package com.example.accessingdatamysql.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.*;

import com.example.accessingdatamysql.model.Course;
import com.example.accessingdatamysql.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping(path = "/courses") // Compliant
	public @ResponseBody ResponseEntity<Object> addCourse(@RequestBody Course course) {

		if(!(courseService.checkValid(course)))
		Course result = courseService.save(course);

		HashMap<String, Object> map = new HashMap<>();
		map.put("description_2", String.format("SAVED ID: %s!", result.getId()));
		map.put("student", result);
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}
} {
    
}
