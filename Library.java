package lab4;

public class Library {
    private String bookname;
    private double amount;

    Library(){
        this.bookname="unknown ";
        this.amount=0;
    }
    Library(String name){
        this.bookname=name;
        this.amount=500;
    }
    Library(String bname,double price){
        bookname=bname;
        amount=price;
    }
    void show(){

        System.out.println("Title: "+bookname+"Prics: "+amount);
    }
    static void main(String[] args) {
        Library b1=new Library();
        b1.show();
        Library b2=new Library("PF");
        b2.show();
        Library b3=new Library("little angel",300);
        b3.show();
    }
}
