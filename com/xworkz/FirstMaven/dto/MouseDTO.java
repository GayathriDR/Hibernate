package com.xworkz.FirstMaven.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mouse_table")
public class MouseDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOUSE_ID")
	private int mouseId;
	
	@Column(name="MOUSE_COLOR")
	private String mouseColor;
	
	@Column(name="MOUSE_SIZE")
	private String mouseSize;
	
	@Column(name="MOUSE_PRICE")
	private double mousePrice;
	
	@Column(name="MOUSE_ISWIRED")
	private boolean isMouseWired;
	
	public MouseDTO() {
		
	}
	public MouseDTO(String mouseColor,String mouseSize,float mousePrice,boolean isMouseWired) {
		super();
		this.mouseColor=mouseColor;
		this.mouseSize=mouseSize;
		this.mousePrice=mousePrice;
		this.isMouseWired=isMouseWired;
	}
	public void setMouseColor(String mouseColor) {
		this.mouseColor=mouseColor;
		
	}
	public String getMouseColor() {
		return mouseColor;
	}
	public void setMouseSize(String mouseSize) {
		this.mouseSize=mouseSize;
	}
	public String getMouseSize() {
		return mouseSize;
		
	}
	public void setMousePrice(double mousePrice) {
		this.mousePrice=mousePrice;
	}
	public double getMousePrice() {
		return mousePrice;
	}
	 public void setIsWired(boolean isMouseWired) {
		 this.isMouseWired=isMouseWired;
	 }
	 
	 public boolean getisMouseWired() {
		 return isMouseWired;
	 }
	public String toString() {
		return  "The details of the mouse is"+mouseId+"color:"+mouseColor+"price:"+mousePrice+"size:"+mouseSize+"isthiswired:"+isMouseWired;
		
	}
	
	

}
