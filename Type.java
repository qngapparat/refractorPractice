/**
 * Created by qngapparat on 12.06.17.
 */
public enum Type {

    ROCK(), PAPER(), SCISSORS();

    private Type(){

    }

    public static Type parseType(String string){

        if(string.toLowerCase().equals("rock")){
            return ROCK;
        }

        else if(string.toLowerCase().equals("paper")){
            return PAPER;
        }

        else if(string.toLowerCase().equals("scissors")){
            return SCISSORS;
        }

        return null;
    }

    public boolean beats (Type other){
        if this.
    }
}
