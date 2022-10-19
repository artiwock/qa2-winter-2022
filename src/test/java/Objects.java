import hw1.*;
import org.junit.jupiter.api.Test;

public class Objects {
   @Test
    public void workingWithObjects() {
       Bicycle firstObject = new Bicycle();

       firstObject.setTotalPrice(699.99);
       firstObject.setWeight(14.97);
       firstObject.setItemCount(1);
       firstObject.setHeight(0.65);
       firstObject.setColor("Green");

       Closet secondObject = new Closet();
       secondObject.setTotalPrice(350.00);
       secondObject.setWeight(90);
       secondObject.setItemCount(1);
       secondObject.setHeight(2.20);
       secondObject.setColor("White");

       Cup thirdObject = new Cup();
       thirdObject.setTotalPrice(3.99);
       thirdObject.setWeight(0.2);
       thirdObject.setItemCount(1);
       thirdObject.setHeight(0.10);
       thirdObject.setColor("White");

       Desk fourthObject = new Desk();
       fourthObject.setTotalPrice(49.99);
       fourthObject.setWeight(8);
       fourthObject.setItemCount(1);
       fourthObject.setHeight(0.65);
       fourthObject.setColor("White");

       Lamp fifthObject = new Lamp();
       fifthObject.setTotalPrice(15.99);
       fifthObject.setWeight(0.9);
       fifthObject.setItemCount(1);
       fifthObject.setHeight(0.3);
       fifthObject.setColor("Black");

       Laptop sixthObject = new Laptop();
       sixthObject.setTotalPrice(499.99);
       sixthObject.setWeight(2.8);
       sixthObject.setItemCount(1);
       sixthObject.setHeight(0.3);
       sixthObject.setColor("Silver");

       MobilePhone seventhObject = new MobilePhone();
       seventhObject.setTotalPrice(620);
       seventhObject.setWeight(0.32);
       seventhObject.setItemCount(1);
       seventhObject.setWidth(0.05);
       seventhObject.setColor("Gold");

       Sneakers eighthObject = new Sneakers();
       eighthObject.setTotalPrice(69.99);
       eighthObject.setWeight(0.4);
       eighthObject.setItemCount(1);
       eighthObject.setHeight(0.12);
       eighthObject.setColor("Black");

       Sofa ninthObject = new Sofa();
       ninthObject.setTotalPrice(599.99);
       ninthObject.setWeight(55.00);
       ninthObject.setItemCount(1);
       ninthObject.setHeight(0.45);
       ninthObject.setColor("Grey");

       TV tenthObject = new TV();
       tenthObject.setTotalPrice(450.00);
       tenthObject.setWeight(19.00);
       tenthObject.setItemCount(1);
       tenthObject.setHeight(0.5);
       tenthObject.setColor("Silver");

       System.out.println("Hello!");
        System.out.println("Bicycle");
       System.out.println(firstObject.getTotalPrice());
       System.out.println(firstObject.getWeight());
       System.out.println(firstObject.getItemCount());
       System.out.println(firstObject.getHeight());
       System.out.println(firstObject.getColor());

       System.out.println("Closet");
       System.out.println(secondObject.getTotalPrice());
       System.out.println(secondObject.getWeight());
       System.out.println(secondObject.getItemCount());
       System.out.println(secondObject.getHeight());
       System.out.println(secondObject.getColor());

       System.out.println("Cup");
       System.out.println(thirdObject.getTotalPrice());
       System.out.println(thirdObject.getWeight());
       System.out.println(thirdObject.getItemCount());
       System.out.println(thirdObject.getHeight());
       System.out.println(thirdObject.getColor());

       System.out.println("Desk");
       System.out.println(fourthObject.getTotalPrice());
       System.out.println(fourthObject.getWeight());
       System.out.println(fourthObject.getItemCount());
       System.out.println(fourthObject.getHeight());
       System.out.println(fourthObject.getColor());

       System.out.println("Lamp");
       System.out.println(fifthObject.getTotalPrice());
       System.out.println(fifthObject.getWeight());
       System.out.println(fifthObject.getItemCount());
       System.out.println(fifthObject.getHeight());
       System.out.println(fifthObject.getColor());

       System.out.println("Laptop");
       System.out.println(sixthObject.getTotalPrice());
       System.out.println(sixthObject.getWeight());
       System.out.println(sixthObject.getItemCount());
       System.out.println(sixthObject.getHeight());
       System.out.println(sixthObject.getColor());

       System.out.println("MobilePhone");
       System.out.println(seventhObject.getTotalPrice());
       System.out.println(seventhObject.getWeight());
       System.out.println(seventhObject.getItemCount());
       System.out.println(seventhObject.getWidth());
       System.out.println(seventhObject.getColor());

       System.out.println("Sneakers");
       System.out.println(eighthObject.getTotalPrice());
       System.out.println(eighthObject.getWeight());
       System.out.println(eighthObject.getItemCount());
       System.out.println(eighthObject.getHeight());
       System.out.println(eighthObject.getColor());

       System.out.println("Sofa");
       System.out.println(ninthObject.getTotalPrice());
       System.out.println(ninthObject.getWeight());
       System.out.println(ninthObject.getItemCount());
       System.out.println(ninthObject.getHeight());
       System.out.println(ninthObject.getColor());

       System.out.println("TV");
       System.out.println(tenthObject.getTotalPrice());
       System.out.println(tenthObject.getWeight());
       System.out.println(tenthObject.getItemCount());
       System.out.println(tenthObject.getHeight());
       System.out.println(tenthObject.getColor());
    }

}
