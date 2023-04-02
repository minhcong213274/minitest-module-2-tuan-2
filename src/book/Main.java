package book;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBook = new ProgrammingBook[5];
        FictionBook[] fictionBooks = new FictionBook[5];
        int sum = 0;
        int count = 0;
        int counts = 0;
        for(int i = 0; i < 5; i++){
            programmingBook[i] = new ProgrammingBook(i,"Name"+ i,"author"+i,i*2+95,"english");
            fictionBooks[i] = new FictionBook(i, "Name" + i,"author" + i,i*2+95,"category"+i);
            sum += fictionBooks[i].getPrice()+programmingBook[i].getPrice();
            if(programmingBook[i].getPrice()<100 ){
                count++;
            }
            if( fictionBooks[i].getPrice()<100){
                count++;
            }
            if(fictionBooks[i].getCategory().equals("category1")){
                counts++;
            }
        }System.out.println(sum);
        System.out.println(count);
        System.out.println(counts);
    }
}
