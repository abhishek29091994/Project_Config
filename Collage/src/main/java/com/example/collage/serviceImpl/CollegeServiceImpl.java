package com.example.collage.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collage.Dao.CollageDao;
import com.example.collage.Entity.Collage;
import com.example.collage.service.CollaseService;

@Service
public class CollegeServiceImpl implements CollaseService {
	
	@Autowired
	private CollageDao dao;

	@Override
	public Collage insertCOllage(Collage collage) {
		Collage collage1=dao.save(collage);
		return collage1;
	}

}
