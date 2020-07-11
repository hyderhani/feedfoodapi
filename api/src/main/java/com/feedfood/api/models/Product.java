package com.feedfood.api.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Product {

	@Id
	public ObjectId _id;
	
	public String productName;
	public String desc;
	public String imgPath;
	public String tags;
	public String variant;
	public String timeLimit;
	
	public Product() {}
	
	public Product(ObjectId _id, String productName, String desc, String imgPath,
			String tags, String variant, String timeLimit) {
		this._id=_id;
		this.productName=productName;
		this.desc=desc;
		this.imgPath=imgPath;
		this.tags=tags;
		this.variant=variant;
		this.timeLimit=timeLimit;
	}
	
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id=_id;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc=desc;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath=imgPath;
	}
	
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags=tags;
	}
	
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant=variant;
	}
	
	public String getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(String timeLimit) {
		this.timeLimit=timeLimit;
	}
	
	
}
