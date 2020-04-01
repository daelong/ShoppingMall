package mall;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
public class BBSList {
        private ArrayList<Integer> seqNoList = new ArrayList<Integer>();
        private ArrayList<String> nameList = new ArrayList<String>();
        private ArrayList<String> contentList = new ArrayList<String>();
        private ArrayList<String> priceList = new ArrayList<String>();
        private ArrayList<String> photoList = new ArrayList<String>();
        private ArrayList<String> typeList = new ArrayList<String>();
        private boolean lastPage = false;
        public BBSList() {
        }
        public void setSeqNo(int index, Integer seqNo) {
             this.seqNoList.add(index, seqNo);
        }
        public void setName(int index, String name) {
             this.nameList.add(index, name);
        }
        public void setContent(int index, String content) {
             this.contentList.add(index, content);
        }
        public void setPrice(int index, String price) {
             this.priceList.add(index, price);
        }
        public void setPhoto(int index, String photo) {
             this.photoList.add(index, photo);
        }
        public void setType(int index, String type) {
        	this.typeList.add(index, type);
        }
        public void setLastPage(boolean lastPage) {
             this.lastPage = lastPage;
        }
        public Integer[] getSeqNo() {
            return seqNoList.toArray(new Integer[seqNoList.size()]);
       }
       public String[] getName() {
            return nameList.toArray(new String[nameList.size()]);
       }
       public String[] getContent() {
            return contentList.toArray(new String[contentList.size()]);
      }
       public String[] getPrice() {
            return priceList.toArray(new String[priceList.size()]);
       }
       public String[] getPhoto() {
            return photoList.toArray(new String[photoList.size()]);
       }
       public String[] getType() {
           return typeList.toArray(new String[typeList.size()]);
      }
       public boolean isLastPage() {
            return lastPage;
       }     
       public int getListSize() {   
            return seqNoList.size();
       }
}
