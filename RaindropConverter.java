class RaindropConverter {

    String convert(int number) {
        String str = new String("");
        
        if(number%3 != 0 && number%5 != 0 && number%7 != 0){
            str = Integer.toString(number);
            return str;
        }

        if(number%3 == 0){
            str = str+"Pling";
        }
        if(number%5 == 0){
            str = str+"Plang";
        }
        if(number%7 == 0){
            str = str+"Plong";
        }
        return str;
    }

}
