
package delivery;

public class DeliveryInfo {
    private String DeliName;
    private String restaurant;
    private String deliFrom;
    private String deliTo;
    private String custName;
    private String timeEnd;
    private String status;
    
    public DeliveryInfo(){      
    }

    public String getDeliName() {
        return DeliName;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getDeliFrom() {
        return deliFrom;
    }

    public String getDeliTo() {
        return deliTo;
    }

    public String getCustName() {
        return custName;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setDeliName(String DeliName) {
        this.DeliName = DeliName;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public void setDeliFrom(String deliFrom) {
        this.deliFrom = deliFrom;
    }

    public void setDeliTo(String deliTo) {
        this.deliTo = deliTo;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     
}
