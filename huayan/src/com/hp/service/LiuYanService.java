package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.LiuYan;

public interface LiuYanService {
	//���
		int add(LiuYan liuyan);
		//ȫ��
		ArrayList<LiuYan> queryAll();
}
