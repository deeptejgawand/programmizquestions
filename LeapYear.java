class LeapYear{
    public static void leapOrNot(int year){
        if(year%4 ==0){
            if(year%100 ==0){
                if(year%400 ==0){
                    System.out.println("This is leap year");
                }else{
                    System.out.println("This is not leap year");
                }
            }else{
                System.out.println("This is a leap year");
            }

        }else{
            System.out.println("Not a leap year");
        }
    }
    public static void main(String args[]){
        leapOrNot(2014);

    }
}