package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.LiuYan;

public interface LiuYanService {
	//Ìí¼Ó
		int add(LiuYan liuyan);
		//È«²é
		ArrayList<LiuYan> queryAll();
}
