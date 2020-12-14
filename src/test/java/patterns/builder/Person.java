package patterns.builder;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double salary;
    private String sex;
    private String jobTitle;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getSex() {
        return sex;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static class Builder {

        private Person newPerson = new Person();

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withSalary(double salary) {
            newPerson.salary = salary;
            return this;
        }

        public Builder withSex(String sex) {
            newPerson.sex = sex;
            return this;
        }

        public Builder withJobTitle(String jobTitle) {
            newPerson.jobTitle = jobTitle;
            return this;
        }

        public Person build() {
            return newPerson;
        }


    }

}

