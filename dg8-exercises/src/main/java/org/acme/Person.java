package org.acme;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.KeywordField;

@Indexed
public class Person {

 

   @KeywordField
   String name;

   @KeywordField
   String surname;

   public Person(String name, String surname) {
      this.name = name;
      this.surname = surname;
   }

   @Override
   public String toString() {
      return "Person [name=" + name + ", surname=" + surname + "]";
   }

}
