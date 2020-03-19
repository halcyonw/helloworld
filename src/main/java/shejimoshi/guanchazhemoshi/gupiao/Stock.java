package shejimoshi.guanchazhemoshi.gupiao;

public class Stock extends Subject{
   private String name;
   private Double price;

    public Stock(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double newPrice) {
        if (this.price - newPrice / price > 0.05 || this.price - newPrice < -0.05) {
          this.price=newPrice;
            forenotice();
        }

    }

    @Override
    public void forenotice() {
        for (Observer observer : list) {
            observer.response();
        }
    }
}
