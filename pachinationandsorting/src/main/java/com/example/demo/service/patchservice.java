package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.demo.model.Patchmodel;

public class patchservice {

	public String addPatch(Patchmodel abc) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Patchmodel> getPatch() {
		// TODO Auto-generated method stub
		return null;
	}
    public List<Patchmodel> getPatchDetails(String fields){
    	return repository.findAll(sort.by(Sort.Direction.ASC,field)); }
    }
}
