package com.chainOfRes.Chain;

import com.chainOfRes.request.StarRatingRequest;
/*
 * �������崦������
 * ���ͻ��˴����������15-35���ɸö��������򴫵ݸ��ͻ���ָ�����¼�
 */
public class Silver extends GameLevel {
	@Override
	public void handleRequest(StarRatingRequest request) {
		if(request.getStarNumber() < 35) {
			System.out.println("���[" + request.getPlayerName() 
			+ "]ͳ��Ϊ" + request.getStarNumber() + "���ǣ�����Ϊ�ȼ��������");
		}else {
			if(this.successor != null) {
				this.successor.handleRequest(request);
			}
		}
	}
}
