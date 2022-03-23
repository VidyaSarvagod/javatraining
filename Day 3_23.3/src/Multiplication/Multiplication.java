package Multiplication;

public class Multiplication {
    void print(){
        for(int i=0;i<=10;i++)
        {
            System.out.printf("%d*%d=%d",5,i,5*i).println();
        }
    }
    void print(int table){
        printlimit(table,1,3);
        for(int i=0;i<=10;i++)
            System.out.printf("%d*%d=%d", table, i, table * i).println();
    }
    void printsuare(int no){
        System.out.printf("Suare is:%d",no*no).println();

    }
    void printlimit(int table,int to,int from){
        for(int i=to;i<=from;i++)
            System.out.printf("%d*%d=%d", table, i,table * i).println();
    }
    void Cube(int no){
               System.out.printf("Cube is:%d",no*no*no).println();
        }
    void HelloPrint(){
        HelloPrint1();
        System.out.println("Hello");
    }
    void HelloPrint1(){
        System.out.println("Hello");
    }

    }

