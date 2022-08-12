class SqueakyClean {
    static String clean(String identifier) {
        String output = "";
        for(int i = 0; i<identifier.length(); i++){
            if(identifier.charAt(i) == ' '){
                output = output + "_";
            }
            else if(identifier.charAt(i) == '-'){    
                String x = identifier.charAt(i).toString();
                output = output + x.toUpperCase;
                i++;
            }
            else{
                output = output + identifier.charAt(i);
            }
        }
        return output;
        
    }
}
