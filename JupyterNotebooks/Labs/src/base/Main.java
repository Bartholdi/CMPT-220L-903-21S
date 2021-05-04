package base;
import java.util.ArrayList;
class listItem{

        int value;
        ArrayList<listItem> List;

        public listItem(int value){

            this.value = value;


        }

        public listItem(int value, listItem list){

            this.value = value;
            this.List.add(list);

        }

        public void addToList(listItem item){

            List.add(item);


    }

        public void deleteitem(listItem item){

            for(int i =0; i< List.size(); i++){
                if(List.get(i) == item ){
                    List.remove(i);
                }
            }
        }

        public String toString(){

            String temp = " ";

            for(int i = 0; i<List.size(); i++){
                temp += List.get(i) + "\n";
            }

            return temp;
        }



    public static void main(String[] args){

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

public class listItem{

    public static class listItem{

        int value;
        ArrayList<listItem> List;

        public listItem(int value){

            this.value = value;


        }

        public listItem(int value, listItem list){

            this.value = value;
            this.List.add(list);

        }

        public void addToList(listItem item){

            List.add(item);


    }

        public void deleteitem(listItem item){

            for(int i =0; i< List.size(); i++){
                if(List.get(i) == item ){
                    List.remove(i);
                }
            }
        }

        public String toString(){

            String temp = " ";

            for(int i = 0; i<List.size(); i++){
                temp += List.get(i) + "\n";
            }

            return temp;
        }



    public static void main(String[] args){

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
}
