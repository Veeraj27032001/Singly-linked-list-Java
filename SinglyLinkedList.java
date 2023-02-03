import java.util.*;
class linkedlist{
    int data;
    linkedlist pt=null;

}
public class SinglyLinkedList{
    /**
     * insert at begin
     * @param head
     * @param data
     * @return
     */
    public static linkedlist insertBegin(linkedlist head, int data) {
        if (head == null) {
            head=new linkedlist();
            head.data = data;
        } else {
            linkedlist temp = new linkedlist();
            temp.data = data;
            temp.pt = head;
            head = temp;
        }
        return head;
    }

    /**
     * insert at end
     * @param head
     * @param data
     * @return
     */
    public static  linkedlist insertEnd(linkedlist head,int data)
    {
         if(head==null)
         {
             head=new linkedlist();
             head.data=data;
         }
         else {
          linkedlist temp=head;
          while(temp.pt!=null)
          {
              temp=temp.pt;
          }
         System.out.println(temp.pt);
          linkedlist temp2=new linkedlist();
          temp2.data=data;
          temp.pt=temp2;
         }

        return head;
    }

    /**
     * delte at begin
     * @param head
     * @return
     */
    public static linkedlist deleteBegin(linkedlist head)
    {
         if(head==null)
         {
             System.out.println("no data is available in linked list");
         }

         else {
             head=head.pt;

         }
        return  head;
    }

    /**
     * delete end
     * @param head
     * @return
     */
    public static linkedlist deleteEnd(linkedlist head)
    {
        if(head==null)
        {
            System.out.println("no data is available in linked list");
        }
        else  if(head.pt==null)
        {
            head=null;
        }

        else {
            linkedlist temp,temp2;
            temp=head;
            temp2=head;
            while(temp.pt!=null)
            {
                temp2=temp;
                temp=temp.pt;
            }
            temp2.pt=null;

        }
        return  head;
    }

    /**
     * insert at certain pos
     * @param head
     * @param data
     * @param pos
     * @return
     */
    public static  linkedlist insertPos(linkedlist  head, int data,int pos)
    {
       linkedlist temp=head;
       int count=0;
       while(temp!=null)
       {
           count++;
           temp=temp.pt;
       }

       if(head==null&pos==1)
       {
           head=new linkedlist();
           head.data=data;
       }
       else if(pos==1)
       {
           temp = new linkedlist();
           temp.data = data;
           temp.pt = head;
           head = temp;
       }
       else if(pos==count+1)
       {
            temp=head;
           while(temp.pt!=null)
           {
               temp=temp.pt;
           }
           System.out.println(temp.pt);
           linkedlist temp2=new linkedlist();
           temp2.data=data;
           temp.pt=temp2;
       }
       else if(pos>count+1)
       {
           System.out.println("pos is out of bound");
       }
       else {
           temp=head;
           count=1;
           linkedlist temp2,temp3;
           temp3=temp;
           while (temp.pt!=null)
           {

               if(count==pos)
               {
                   System.out.println(temp.data+" "+temp3.data);

                   temp2=new linkedlist();
                   temp2.data=data;
                   temp2.pt=temp;
                   temp3.pt=temp2;


                break;
               }
               temp3=temp;
               temp=temp.pt;
               count++;

           }

    }

        return head;
    }

    /**
     *  delte pos
     * @param head
     * @param pos
     * @return
     */
    public static  linkedlist deletePos(linkedlist  head,int pos)
    {
        linkedlist temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.pt;
        }

        if(head==null)
        {
            System.out.println("linke lis is empty");
        }
        else if(pos>count+1)
        {
            System.out.println("pos is out of bound");
        }
        else if (pos==1){
            head=head.pt;

        } else {

            temp=head;
            count=1;
            linkedlist temp2,temp3;
            temp2=temp;
            while (temp.pt!=null)
            {

                if(count==pos)
                {
                    System.out.println(temp.data+" "+temp2.data);


                    temp2.pt=temp.pt;


                    break;
                }
                temp2=temp;
                temp=temp.pt;
                count++;

            }


        }
        return  head;
    }

    /**
     * print linked data
     * @param temp
     */
 public static  void printLink(linkedlist temp)
 {   if(temp!=null) {
     System.out.println("entered data is ");
     while (temp.pt != null) {
         System.out.println(temp.data);
         temp = temp.pt;
     }
     System.out.println(temp.data);
 }
 else{
     System.out.println("linked list is empty ");
 }
 }

    public static void main(String[] args) {


        linkedlist ls =null;

        int ch;
        do {
            System.out.println("1.insert begin 2.insert end 3.delete begin 4. delete end 5.insertpos 6. print 7.exit\nenter uout choice:  ");
            ch = (new Scanner(System.in)).nextInt();
            int data,pos;
           switch (ch){
               case 1:
                   System.out.println("enter data: ");
                 data = (new Scanner(System.in)).nextInt();
                   ls = insertBegin(ls, data);
                   break;
               case 2:
                   System.out.println("enter data: ");
                   data= (new Scanner(System.in)).nextInt();
                   ls = insertEnd(ls, data);
                   break;
               case 3:
                   ls=deleteBegin(ls);
                   break;
               case 4:
                   ls=deleteEnd(ls);
                   break;
               case 5:
                   System.out.println("enter pos: ");
                   pos = (new Scanner(System.in)).nextInt();
                   System.out.println("enter data: ");
                   data = (new Scanner(System.in)).nextInt();
                   ls = insertPos(ls, data,pos);
                   break;
               case 6:
                   System.out.println("enter pos: ");
                   pos = (new Scanner(System.in)).nextInt();
                   ls=deletePos(ls,pos);
                   break;
               case 7:
                   printLink(ls);
                   break;
            }
        }
        while (ch != 8);




    }
}