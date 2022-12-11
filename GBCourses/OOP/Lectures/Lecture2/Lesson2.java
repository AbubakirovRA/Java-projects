package Lectures.Lecture2;

public class Lesson2 {
    public static void main(String[] args) {
      App.buttonCLick(new Config("config.ini"));
    }
  
  }
  
  class Config {
    String path;
  
    public Config(String p) {
      path = p;
    }
  
    public void getSettings() {
  
    }
  }
  
  class App {
    public static void buttonCLick(Config config) {
      ////
      ////
      config.getSettings();
      ////
      IFruct a = new Apple(10, "РђРЅС‚РѕРЅРѕРІРєР°");
      IPeach p = new Peach();
      MeasureFruct mf = new MeasureFruct(a);
      System.out.println(mf.getInfo());
      mf = new MeasureFruct(p);
      System.out.println(mf.getInfo());
  
      MeasureApple ma = new MeasureApple((IApple) a);
    }
  }
  
  interface IFruct {
    int getSize();
  }
  
  interface IPeach extends IFruct {
    String getCountry();
  
    String getName();
  }
  
  interface IApple extends IFruct {
    String getName();
  }
  
  class Apple implements IApple {
    protected int size;
    protected String name;
  
    public Apple(int size, String name) {
      this.size = size;
      this.name = name;
    }
  
    public int getSize() {
      return size;
    }
  
    public String getName() {
      return name;
    }
  }
  
  class Peach implements IPeach {
    public String getCountry() {
      return "РўСѓСЂС†РёСЏ";
    }
  
    public String getName() {
      return "Р’РєСѓСЃРЅРµР№С€РёР№ РїРµСЂСЃРёРє";
    }
  
    public int getSize() {
      return 100;
    }
  }
  
  class NewApple extends Apple {
    public NewApple(String name, int size) {
      super(size, name);
    }
  }
  
  class MeasureFruct {
    IFruct fruct;
  
    public MeasureFruct(IFruct fruct) {
      this.fruct = fruct;
  
    }
  
    public int getInfo() {
      return fruct.getSize();
    }
  
  }
  
  class MeasureApple extends MeasureFruct {
    public MeasureApple(IApple a) {
      super(a);
  
    }
  }
