public class textbook
{
public String category, title,auther;
public float price;
public void setCategory(String c){
category=c;
}
public void setTitle(String t){
title=t;
}
public void setAuthor(String a){
auther=a;
}
public void setPrice(float p){
price=p;
}
public String getCategory(){
return category;
}
public String getTitle(){
return title;
}
public String getAuthor(){
return auther;
}
public float getPrice(){
return price;
}
public String toString(){
return String.format("Category: %s\nTitle: %s\nAuthor: %s\nPrice: %4.2f\n",getCategory(),getTitle(),getAuthor(),getPrice());
}
public static void main(String args[]){
textbook Book=new textbook();
Book.setCategory("Engineering");
Book.setTitle("Java Programming lab");
Book.setAuthor("Deshmukh Sir");
Book.setPrice(45);
System.out.printf("%s\n",Book);
}
} 
