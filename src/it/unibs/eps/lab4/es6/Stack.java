package it.unibs.eps.lab4.es6;

public interface Stack extends Container
{
   void push(Object obj);
   Object pop();
   Object top();
}

class EmptyStackException extends RuntimeException {  }
class FullStackException extends RuntimeException  {  }
