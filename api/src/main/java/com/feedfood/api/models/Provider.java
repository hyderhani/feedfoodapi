package com.feedfood.api.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Provider {
	
	@Id
	public ObjectId _id;
	
	public String name;
	public String imgPath;
	
	public Provider() {}
	
	public Provider(ObjectId _id, String name, String imgPath) {
		this._id= _id;
		this.name= name;
		this.imgPath= imgPath;
	}
	
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id=_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath=imgPath;
	}
	

}
