package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entity.RPLEntity;
import Service.serivce;

@RestController
@RequestMapping("/api")
public class controller {
	
	@Autowired
	private serivce serv;
	
	@GetMapping("/execute")
	public ResponseEntity<List<RPLEntity>> executeQuery(@RequestParam String query){
		List<RPLEntity> result= serv.executeQuery(query);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}

}
