package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "regional_province")
public class RegionalProvince {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regional_province_id")
    private Long regionalProvinceId;

    @Column(name = "regional_province_name")
    private String regionalProvinceName;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    public Long getRegionalProvinceId() {
        return this.regionalProvinceId;
    }

    public void setRegionalProvinceId(Long regionalProvinceId) {
        this.regionalProvinceId = regionalProvinceId;
    }

    public String getRegionalProvinceName() {
        return this.regionalProvinceName;
    }

    public void setRegionalProvinceName(String regionalProvinceName) {
        this.regionalProvinceName = regionalProvinceName;
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
