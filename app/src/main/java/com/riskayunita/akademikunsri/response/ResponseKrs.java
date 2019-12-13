package com.riskayunita.akademikunsri.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseKrs{

	@SerializedName("krs")
	private List<KrsItem> krs;

	@SerializedName("status")
	private boolean status;

	public void setKrs(List<KrsItem> krs){
		this.krs = krs;
	}

	public List<KrsItem> getKrs(){
		return krs;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseKrs{" + 
			"krs = '" + krs + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}