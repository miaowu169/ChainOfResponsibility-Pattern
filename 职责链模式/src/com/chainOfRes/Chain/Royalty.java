package com.chainOfRes.Chain;

import com.chainOfRes.request.StarRatingRequest;
/*
 * �������崦������
 * ���ͻ��˴����������35-55���ɸö�������������Ϊ���߶�λ
 */
public class Royalty extends GameLevel {
	@Override
	public void handleRequest(StarRatingRequest request) {
		if(request.getStarNumber() < 55) {
			System.out.println("���[" + request.getPlayerName() + "]ͳ��Ϊ" 
					+ request.getStarNumber() + "���ǣ�����Ϊ�ȼ�������ҫ");
		}else {
			System.out.println("���[" + request.getPlayerName() 
			+ "]ͳ��Ϊ" + request.getStarNumber() 
			+ "���ǣ�����Ϊ�ȼ���������" + (request.getStarNumber()-55) + "��");
		}
	}
}
