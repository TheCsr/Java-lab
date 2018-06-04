package package5;

import java.util.*;

class Phone
{
String name, time;
String phnumber;
Phone(String na, String n, String t)
{
name = na;
phnumber = n;
time = t;
}
public String toString()
{
return "Name is:" + name + " Number: " + phnumber + " Time: " + time;
}
}