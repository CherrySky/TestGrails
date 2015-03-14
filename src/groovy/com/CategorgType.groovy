package com

enum CategorgType {

	BABY("baby", "ир╡г", "ир╡г");

	private String eng;
	private String chineseTradition;
	private String simplify;

	CategorgType(String eng, String chineseTradition, String simplify) {
		this.setEng(eng);
		this.setChineseTradition(chineseTradition);
		this.setSimplify(simplify);
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getChineseTradition() {
		return chineseTradition;
	}

	public void setChineseTradition(String chineseTradition) {
		this.chineseTradition = chineseTradition;
	}

	public String getSimplify() {
		return simplify;
	}

	public void setSimplify(String simplify) {
		this.simplify = simplify;
	}
	
	
	
}
