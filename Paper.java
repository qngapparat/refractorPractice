/**
 * Created by qngapparat on 12.06.17.
 */
public class Paper extends DrawType implements Comparable<DrawType>{

    public Paper(){

    }

    public String toString(){
        return "paper";
    }

    public int compareTo(DrawType other){
        if(other.toString().equals(this.toString())){
            return 0;
        }

        else
    }
}
