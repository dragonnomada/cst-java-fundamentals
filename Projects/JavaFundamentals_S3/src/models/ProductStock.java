package models;

public class ProductStock extends Product {
    
    // + Product
    
    // NUEVO
    String stockName;
    double latitude;
    double longitude;

    public ProductStock(String stockName, double latitude, double longitude, String name, double price) {
        super(name, price);
        this.stockName = stockName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    
    
    @Override
    public double getPrice() {
        return super.getPrice() + 3.99;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    
    
}
