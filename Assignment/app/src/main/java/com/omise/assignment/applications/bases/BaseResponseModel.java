package com.omise.assignment.applications.bases;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class BaseResponseModel {
	
	
	@SerializedName("error")
	protected String error;
	@SerializedName("code")
	protected String code;
	
	public boolean isError(){
		return !TextUtils.isEmpty(error);
	}
	
	public String getError() {
		return error;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setError(final String error) {
		this.error = error;
	}
	
	public void setCode(final String code) {
		this.code = code;
	}
}
