
package Logic;

import DAO.DataAccessObject;

public class PriceCalc {
    
    DataAccessObject data = new DataAccessObject();
    
    public double calcPrice(String name, double heigth, double width) {
      double glass = data.getGlass(name) * (height/100) * (width/100);
      double frame = data.getFrame(name) * (height/100) * (width/100) * 2;
      return glass + frame;
    }
}
