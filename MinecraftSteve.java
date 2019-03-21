public MinecraftSteve extends Chatbot
{
  public MinecraftSteve()
  {
    // set all properties to zero
    myInventorySpace = 0;
  }

  // accessor methods (get)
  public int getInventorySpace()
  {
    return myInventorySpace;
  }

  // modifier methods (set)
  public void setInventorySpace(int space)
  {
    myInventorySpace = space;
  }


  // interesting methods

  // instance fields (instance variables, fields)

  private int myInventorySpace;
  // at least one int, double, String
}
