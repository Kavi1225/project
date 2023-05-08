package com.example.demo.controller;

import java.util.List;

import javax.sound.midi.Patch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patchmodel;
import com.example.demo.service.patchservice;

@RestController
public class Patchcontroller {
    
	@Autowired
	patchservice Patch;
	@PostMapping("")
	public String create(@RequestBody Patchmodel abc)
	{
		return Patch.addPatch(abc);
	}
	@GetMapping("")
	public List<Patchmodel> read()
	{
		return Patch.getPatch();
	}
	//sorting
	public List<Patchmodel> getsPatchsorted(@patchmodel String field)
	{
		return Patch.getPatchDetails(fields)
	}
}
//paginatoin
@GetMapping("/product/{offset}/{pagesize)")
public List<Patchmodel>getProductswictchPagination(@PathVariable int offset, @PathVariable int page size)
{
	return product.getp\Productwithpaging(offset, pagesize);
}
}
//pagination and sorting
@GetMapping("/product/{offset}/{offset")