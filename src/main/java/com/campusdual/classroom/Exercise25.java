package com.campusdual.classroom;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Exercise25 {
  public static Stack<String> createStack() {
    Stack<String> stack = new Stack<>();
    stack.push("Smith");
    stack.push("Montessori");
    stack.push("Peralta");
    stack.push("House");
    return stack;
  }

  public static void printAndEmptyStack(Stack<String> stack) {
    while (!stack.isEmpty()) {
      System.out.println(stack.remove(stack.size() - 1));
    }
  }

  public static void main(String[] args) {
    printAndEmptyStack(createStack());
  }


}
