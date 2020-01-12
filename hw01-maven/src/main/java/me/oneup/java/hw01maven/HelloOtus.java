package me.oneup.java.hw01maven;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class HelloOtus {

  public static void main(String[] args) {
    List<String> greetingWords = ImmutableList.of("Hello", "Otus");
    String greeting = Joiner.on(" ").join(greetingWords);

    System.out.println(greeting);
  }

}
