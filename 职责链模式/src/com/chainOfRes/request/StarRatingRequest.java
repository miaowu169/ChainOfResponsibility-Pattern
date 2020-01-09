package com.chainOfRes.request;
/*
 * 创建请求类，由客户端指定其属性
 * @param playerName玩家名称
 * @param starNumber星的数量
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
