package com.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Tracker.TEntity;
import com.service.Tservice;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Tcontroller {
	
	@Autowired
  private Tservice service;
	
	
@GetMapping("/findall")
	public List<TEntity> getall(){
		return service.getall();
	}

@GetMapping("/findbyid/{id}")
public TEntity getbyid(@PathVariable int id) {
	return service.getbyid(id);
}
@DeleteMapping("/deleteexpense/{id}")
public String deletebyid(@PathVariable int id) {
	service.deletebyid(id);
	return "deleted";
}


@PostMapping("/add")
public TEntity add(@RequestBody TEntity e) {
	return  service.add(e);
}

@PutMapping("/update/{id}")
public TEntity update(@PathVariable int id,@RequestBody TEntity e) {
	return service.save(id,e);
	
}






}
