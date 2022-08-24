class Teacher{
    void teach(){
        System.out.println("Teacher teach subjects");
    }
}
class Students extends Teacher{
    void listen(){
        System.out.println(" Students listen to Teacher");
    }
}
class CheckForInheritance{
    public static void main (String args[]){
        Students s=new Students();
        s.teach();
        s.listen();
    }
}


