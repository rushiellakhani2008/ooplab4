package lab4;

public class mobile {

    private String bookname;
    private String model;
    private int price;

    mobile(){
        this.bookname="null";
        this.model="null";
        this.price=0;
    }
    mobile(String name,String model){
        this.bookname=name;
        this.model=model;
        this.price=250;
    }
    mobile(String bname,String model,int price){
        this.bookname=bname;
        this.model=model;
        this.price=price;
    }
    void show(){
        System.out.println( "Brand: "+bookname+"Model: "+model+ "Prics: "+price);
    }

    static void main(String[] args) {
        mobile m1=new mobile();
        mobile m2=new mobile("vivo","Y29");
        mobile m3=new mobile("samsung ","note 10",50000);

        m1.show();
        m2.show();
        m3.show();
    }
}
