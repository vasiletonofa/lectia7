package person;

class Person {

    // private
    // default package
    // protected
    // public


    private int age;

    public int getAge(int age) { // default package

      Person p =  new Person();

       PersonUtil personUtil = new PersonUtil();
       personUtil.calculateKalories();
        return age;
    }
}
