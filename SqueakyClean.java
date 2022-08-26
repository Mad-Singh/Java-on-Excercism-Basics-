import java.lang.*;
class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll("\\p{Cntrl}", "CTRL");

        String str = "";
        for(int i=0; i<identifier.length();i++){
            
            if(identifier.charAt(i)=='-' && i<identifier.length()-1 && Character.isLetter(identifier.charAt(i+1))){
                
                  String s= ""+  identifier.charAt(i+1) ;
                    str += s.toUpperCase();
                    i++;
                
            }
                else if(identifier.charAt(i) >= 'α' && identifier.charAt(i) <= 'ω'){
                str += "";
            }
            else if(identifier.charAt(i)==' '){
                str += "_";
            }        
            else if(Character.isLetter(identifier.charAt(i))){
                str += identifier.charAt(i);
            }
            
            
        }
        identifier =str;

        return identifier;
    }
}
