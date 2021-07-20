package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.LiuYanDao;
import com.hp.entity.LiuYan;
@Service
public class LiuYanServiceImpl implements LiuYanService{
	@Autowired
private LiuYanDao liuyanDao;

	@Override
	public int add(LiuYan liuyan) {
		// TODO Auto-generated method stub
		int i=liuyanDao.insert(liuyan);
		return i;
	}

	@Override
	public ArrayList<LiuYan> queryAll() {
		// TODO Auto-generated method stub
		ArrayList<LiuYan> liuyans=liuyanDao.selectAll();
		return liuyans;
	}

}
