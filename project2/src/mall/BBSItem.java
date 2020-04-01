package mall;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
public class BBSItem {
	private int itemSeqNo;
	private String itemId;
	private String itemName;
	private String itemContent;
	private String itemPrice;
	private String itemPhoto;
	public int getItemSeqNo() {
		return itemSeqNo;
	}
	public void setItemSeqNo(int itemSeqNo) {
		this.itemSeqNo = itemSeqNo;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemPhoto() {
		return itemPhoto;
	}
	public void setItemPhoto(String itemPhoto) {
		this.itemPhoto = itemPhoto;
	}
	
	
}
