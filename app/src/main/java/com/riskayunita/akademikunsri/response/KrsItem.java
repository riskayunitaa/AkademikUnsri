package com.riskayunita.akademikunsri.response;

import com.google.gson.annotations.SerializedName;
public class KrsItem{

	@SerializedName("no")
	private String no;

	@SerializedName("kode")
	private String kode;

	@SerializedName("sks")
	private String sks;

	@SerializedName("matakuliah")
	private String matakuliah;

	public void setNo(String no){
		this.no = no;
	}

	public String getNo(){
		return no;
	}

	public void setKode(String kode){
		this.kode = kode;
	}

	public String getKode(){
		return kode;
	}

	public void setSks(String sks){
		this.sks = sks;
	}

	public String getSks(){
		return sks;
	}

	public void setMatakuliah(String matakuliah){
		this.matakuliah = matakuliah;
	}

	public String getMatakuliah(){
		return matakuliah;
	}

	@Override
 	public String toString(){
		return 
			"KrsItem{" + 
			"no = '" + no + '\'' + 
			",kode = '" + kode + '\'' + 
			",sks = '" + sks + '\'' + 
			",matakuliah = '" + matakuliah + '\'' + 
			"}";
		}
}