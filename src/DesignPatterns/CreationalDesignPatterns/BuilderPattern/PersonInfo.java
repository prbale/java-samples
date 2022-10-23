package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class PersonInfo {

    private String name;
    private String nationality;
    private int age;

    private PersonInfo() {
        // Lets now allow to create direct instance
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println(
                        "Person Info:" +
                        "\nName:" + this.name +
                        "\nNationality:"+this.nationality +
                        "\nAge:"+this.age);
    }

    public static class Builder {

        private String name;
        private String nationality;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonInfo build() {
            PersonInfo pinfo = new PersonInfo();
            pinfo.setName(this.name);
            pinfo.setNationality(this.nationality);
            pinfo.setAge(this.age);
            return pinfo;
        }
    }
}
