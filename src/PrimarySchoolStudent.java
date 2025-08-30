public class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
//        return "primarySchoolStudent{" +
//                "parentName='" + parentName + '\'' +
//                "} " + super.toString();
        return super.toString()
                + " and his/her parent name is " + '\'' +
                parentName;
    }
}
