package com.chainOfRes.Chain;

import com.chainOfRes.request.StarRatingRequest;
/*
 * ��������������
 */
public abstract class GameLevel {
	//����������
	protected GameLevel successor;
	//������һ�Ҷ���
	public void setSuccessor(GameLevel successor) {
		this.successor = successor;
	}
	//��������
	public abstract void handleRequest(StarRatingRequest request);
}
