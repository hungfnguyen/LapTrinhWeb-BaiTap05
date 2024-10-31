package vn.iotstar.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
/* @Data */
@Entity
@Table(name = "category")

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryId")
	private Long id;

	@Column(name = "categoryname", columnDefinition = "NVARCHAR(255)")
	@NotEmpty(message="Không được phép rỗng")
	private String name;

	@Column(name = "images", columnDefinition = "NVARCHAR(MAX)")
	private String images;

	//@Column(name = "status")
	private int status;
	
	@Column(name = "is_edit", nullable = false)
    private Boolean isEdit = false; // Giá trị mặc định

	
	
	
	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
