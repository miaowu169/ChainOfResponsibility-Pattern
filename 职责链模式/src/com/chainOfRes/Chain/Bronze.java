package com.chainOfRes.Chain;

import com.chainOfRes.request.StarRatingRequest;
/*
 * �������崦������
 * ���ͻ��˴������������15���ɸö��������򴫵ݸ��ͻ���ָ�����¼�
 */
public class Bronze extends GameLevel {
	@Override
	public void handleRequest(StarRatingRequest request) {
		if(request.getStarNumber() < 15) {
			System.out.println("���[" + request.getPlayerName() + "]ͳ��Ϊ" 
		+ request.getStarNumber() + "���ǣ�����Ϊ�ȼ�������ͭ");
		}else {
			if(this.successor != null) {
				this.successor.handleRequest(request);
			}
		}
	}
}
