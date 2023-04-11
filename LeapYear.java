class LeapYear {
    public static void main(String[] args) 
    {
        int num=2036;
        if(num<=100)
        {
            if(num%4==0){
                System.out.println("Leap year");
            }
        }else if(num>100)
        {
            if((num%100!=0) && (num%400!=0) && (num%4==0))
            {
                System.out.println("leap year");
            }else{
                System.out.println("Not a Leap Year");
            }
        }
    }
}
