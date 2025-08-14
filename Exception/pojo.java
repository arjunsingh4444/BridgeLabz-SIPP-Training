package BridgeLabz_SIPP_Training.Exception;

class pojo {
    String name;
    String Passward;

    pojo(String name, String Passward) {
        this.name = name;
        this.Passward = Passward;
    }

  @Override
  public String toString(){
    return "name: "+ name + ", Passward: " + Passward;
  }
    public String getName() {
        return name;
    }

    public String getPassward() {
        return Passward;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassward(String Passward) {
        this.Passward = Passward;
    }
}