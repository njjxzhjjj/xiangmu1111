package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.LiuYan;

public interface LiuYanDao {
	//���
	int insert(LiuYan liuyan);
	//ȫ��
	ArrayList<LiuYan> selectAll();

}
