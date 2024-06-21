package com.API.SpringBoot_API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SprinBootAPIController {

	@Autowired
	SpringBoot_APIRepository repo;
	
	@GetMapping("/")
	public List<SpringBoot_APIModel> FetchAllData()
	{
		List<SpringBoot_APIModel> list=repo.fetchAll();
		return list;
	}
	
	@PostMapping("/post")
	public void AddData(@RequestBody SpringBoot_APIModel mod)
	{
		if(mod !=null)
		{
			repo.addData(mod.getName(), mod.getRollNo(), mod.getDepartment());
		}
	}
	
	@PutMapping("/put/{id}")
	public void UpdateData(@PathVariable("id") int id,@RequestBody SpringBoot_APIModel mod ) 
	{
		if(mod !=null)
		{
			repo.updateData(id, mod.getName(), mod.getRollNo(), mod.getDepartment());
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteData(@PathVariable("id")int id)
	{
		repo.deleteData(id);
	}
}
