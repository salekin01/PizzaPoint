package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pizza_size")
public class PizzaSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_size_id")
    private Long pizzaSizeId;

    @Column(name = "size_in_inch")
    private int sizeInInch;

    @Column(name = "size_in_text")
    private String sizeInText;

    @Column(name = "total_slice")
    private int totalSlice;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    public Long getPizzaSizeId() {
        return this.pizzaSizeId;
    }

    public void setPizzaSizeId(Long pizzaSizeId) {
        this.pizzaSizeId = pizzaSizeId;
    }

    public int getSizeInInch() {
        return this.sizeInInch;
    }

    public void setSizeInInch(int sizeInInch) {
        this.sizeInInch = sizeInInch;
    }

    public String getSizeInText() {
        return this.sizeInText;
    }

    public void setSizeInText(String sizeInText) {
        this.sizeInText = sizeInText;
    }

    public int getTotalSlice() {
        return this.totalSlice;
    }

    public void setTotalSlice(int totalSlice) {
        this.totalSlice = totalSlice;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
