class Apples
{
  // instance variables
  private String type;
  private double size;
  private boolean isTart;

  // constructors
  public Apples ()
  {
    type = null;
    size = 0; 
    isTart = false;
  } // no-arg constructor

  // toString
  public String toString ()
  {
    String output = "Type: " + type
                  + "\nSize (inches diameter): " + size
                  + "\nIs it tart? " + isTart;
    return output;
  } // end toString method

} // end Apples class