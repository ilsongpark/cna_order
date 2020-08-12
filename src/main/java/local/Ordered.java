
package local;

public class Ordered extends AbstractEvent {

    private Long id;
    private Long ProductId;
    private Integer qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getProductId() {
        return ProductId;
    }

    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
