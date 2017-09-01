package Generics.src.SimpleGenerics;

public class GenericBox<item0,item1,item2> {
    private item0 firstName;
    private item1 secondName;
    private item2 graduatioResult;

    public GenericBox(item0 firstName,item1 secondName,item2 graduatioResult){
        this.firstName = firstName;
        this.secondName = secondName;
        this.graduatioResult = graduatioResult;
    }
    public String printInfo(){
        String inf = this.firstName + " " + this.secondName + " " + this.graduatioResult;
        System.out.println(inf);
        return inf;
    }
}
