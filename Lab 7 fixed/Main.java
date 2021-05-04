package base;

public class Main{

    public static class listItem{

        int value;
        listItem List;

        public listItem(int value){

            this.value = value;


        }

        public listItem(int value, listItem list){

            this.value = value;
            this.List = list;

        }

        public String toString(){

            return this.value  + " " + this.List;
        }

    }

    public static void main(String arg[]){

        listItem itemOne = new listItem(5);

        listItem itemTwo = new listItem(6, itemOne);

        System.out.println(itemOne);
        System.out.println(itemTwo);

        listItem one = new listItem(7);

        itemOne.addToList(one);
        itemOne.deleteitem(one);
        itemOne.toString();
    }
}