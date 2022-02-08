package com.simplilearn.syncronization;

class One
{
  synchronized public void display(String msg)
  {
    System.out.print ("["+msg);
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println ("]");
  }
}

class Two extends Thread
{
  String msg;
  One fobj;
  Two (One fnew,String str)
  {
    fobj = fnew;
    msg = str;
    start();
  }
  public void run()
  {
    fobj.display(msg);
  }
}

public class withSync
{
  public static void main (String[] args)
  {
    One fnew = new One();
    Two ss = new Two(fnew, "Tanmay");
    Two ss1= new Two(fnew,"Khandual");
    Two ss2 = new Two(fnew, "Simplilearn");
  }
}