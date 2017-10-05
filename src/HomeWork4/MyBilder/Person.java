package HomeWork4.MyBilder;

public class Person {

    private  String firstName;
    private  String secondName;

    private Person() {

    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getsecondName() {
        return secondName;
    }
    public static Builder newBuilder() {
        return new Person().new Builder();
    }


    public class Builder {

        private Builder() {

        }

        public Builder setfirstName(String firstName) {
            Person.this.firstName= firstName;

            return this;
        }

        public Builder setsecondName(String secondName) {
            Person.this.secondName = secondName;

            return this;
        }

        public Person build() {
            return Person.this;
        }


    }
}

