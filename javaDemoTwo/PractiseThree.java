public class PractiseThree {
    public static void main(String[] args) {
        MyDate[] myDate = new MyDate[2];
        for(int i = 0; i < myDate.length;i++){
            myDate[i] = new MyDate();
            if(i == 0){
                myDate[i].year = 1988;
                myDate[i].month = 4;
                myDate[i].day = 30;
            }else{
                myDate[i].year = 1993;
                myDate[i].month = 8;
                myDate[i].day = 25;
            }
        }
        PractiseThree practiseThree = new PractiseThree();
  
        practiseThree.print(myDate);
    }
  
    public void print(MyDate[] myDate){
        for(int i = 0; i < myDate.length; i++){
            System.out.println(myDate[i].info());
        }
    }
}

class MyDate{
    int year;
    int month;
    int day;
    public String info(){   
        return "borthday is "+this.year+"/"+this.month+"/"+this.day;
    }
}