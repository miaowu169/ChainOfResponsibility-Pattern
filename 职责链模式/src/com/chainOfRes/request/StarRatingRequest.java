package com.chainOfRes.request;
/*
 * ���������࣬�ɿͻ���ָ��������
 * @param playerName�������
 * @param starNumber�ǵ�����
 */
public class StarRatingRequest {
	private String playerName;
	private int starNumber;
	
	public StarRatingRequest(String _playerName,int _starNumber) {
		this.playerName = _playerName;
		this.starNumber = _starNumber;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getStarNumber() {
		return starNumber;
	}

	public void setStarNumber(int starNumber) {
		this.starNumber = starNumber;
	}
	
	
}
