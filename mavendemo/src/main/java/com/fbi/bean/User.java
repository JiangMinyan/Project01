package com.fbi.bean;

import java.util.List;

/**
 * @author max
 * @create 2019-01-10 10:53
 */
public class User {

    private List<PeopleBean> people;

    public List<PeopleBean> getPeople() {
        return people;
    }

    public void setPeople(List<PeopleBean> people) {
        this.people = people;
    }

    public static class PeopleBean {
        /**
         * firstName : Brett
         * lastName : McLaughlin
         */

        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
