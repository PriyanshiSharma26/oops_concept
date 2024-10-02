// uestion: Create a class Book with private attributes title, author, and price. Provide getter and setter methods for these attributes. Write a method to display the details of the book.
// Abstraction


class Book{
    private String title;
    private String auther;
    private int price;

    void set_title(String title)
      {
         this.title=title;
      }  

       String get_title()
       {
        return title;
       }

      void set_auther(String auther)
      {
        this.auther=auther;
      }
      String  get_auther()
      {
        return auther;
      }

      void set_price(int price)
      {
        this.price=price;
      }
      int get_price()
      {
        return price;
      }

      void display_details()
      {
        System.out.println("titile is :"+title);
        System.out.println("auther is :"+auther);
        System.out.println("price is :"+price);
      }
}

class main_9

{
    public static void main(String[] args)
     {
        Book b=new Book();
        b.set_title("ignited mind");
        b.set_auther("APJ abdul kalam");
        b.set_price(3000);

        b.display_details();

        
    }
}