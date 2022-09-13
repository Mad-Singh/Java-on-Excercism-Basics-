public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        if(speed<=4){
            return speed * 221;
        }
        else if(speed<=8){
            double num1 = (speed*221) * 0.9;
            return num1;
        }
        else if(speed==9){
            double num2 = (speed*221) * 0.8;
            return num2;
        }
        else{
            double num3 = (speed*221) * 0.77;
            return num3;
        }
        
    }

    public int workingItemsPerMinute(int speed) {
        if(speed<=4){
            double num = (speed*221)/60;
            int final4 = (int)num ;
            return final4;
        }
        else if(speed<=8){
            double num1 = (speed * 221 * 0.9)/60;
            int final1 = (int)num1;
            return final1;
        }
        else if(speed==9){
            double num2 = (speed * 221 * 0.8)/60;
            int final2 = (int)num2;
            return final2;
        }
        else{
            double num3 = (speed * 221 * 0.77)/60;
            int final3 = (int)num3;
            return final3;
        }
    }
}
